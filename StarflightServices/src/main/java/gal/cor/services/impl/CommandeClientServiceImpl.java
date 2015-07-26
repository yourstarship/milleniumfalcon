package gal.cor.services.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.dao.apis.IDaoCommandeClient;
import gal.cor.persistence.dao.apis.IDaoLignePieceClient;
import gal.cor.persistence.dao.apis.IDaoProduit;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.persistence.entities.TVA;
import gal.cor.services.api.ICommandeClientService;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

@Stateless
@Remote(ICommandeClientService.class)
public class CommandeClientServiceImpl implements ICommandeClientService {
	@EJB
	IDaoCommandeClient iDaoCommandeClient;
	@EJB
	IDaoLignePieceClient iDaoLignePieceClient;
	@EJB
	IDaoClient iDaoClient;
	@EJB
	IDaoProduit iDaoProduit;

	Logger logger = Logger.getLogger(CommandeClientServiceImpl.class);

	@Override
	public CommandeClient incrementeQuantiteLigne(Client client,
			LignePieceClient lignePieceClient) {
		boolean result = false;
		lignePieceClient.setQuantite(lignePieceClient.getQuantite() + 1);
		if (client != null) {
			iDaoLignePieceClient.mettreAjourLignePieceClient(lignePieceClient);
		}
		return lignePieceClient.getCommandeClient();
	}

	@Override
	public CommandeClient decrementeQuantiteLigne(Client client,
			LignePieceClient lignePieceClient) {
		if (lignePieceClient.getQuantite() > 1) {
			lignePieceClient.setQuantite(lignePieceClient.getQuantite() - 1);
			if (client != null) {
				iDaoLignePieceClient
						.mettreAjourLignePieceClient(lignePieceClient);
			}
		} else if (lignePieceClient.getQuantite() == 1) {
			lignePieceClient.setQuantite(lignePieceClient.getQuantite() - 1);
			this.supprimerLignePieceClient(client, lignePieceClient);
		}
		return lignePieceClient.getCommandeClient();
	}

	@Override
	public CommandeClient miseAJourQuantiteLigne(Client client,
			LignePieceClient lignePieceClient, int nouvelleQuantite) {
		lignePieceClient.setQuantite(nouvelleQuantite);
		if (client != null) {
			iDaoLignePieceClient.mettreAjourLignePieceClient(lignePieceClient);
		}
		return lignePieceClient.getCommandeClient();
	}

	@Override
	public CommandeClient supprimerLignePieceClient(Client client,
			LignePieceClient lignePieceClient) {
		lignePieceClient.getCommandeClient().getLignesPieceClient()
				.remove(lignePieceClient);
		if (client != null) {
			iDaoLignePieceClient.supprimerLignePieceClient(lignePieceClient);
		}
		return lignePieceClient.getCommandeClient();
	}

	@Override
	public CommandeClient viderPanier(CommandeClient commandeClient) {
		List<LignePieceClient> lesLignesDuPanier = commandeClient
				.getLignesPieceClient();
		if (lesLignesDuPanier.size() > 0) {
			for (LignePieceClient lignePieceClient : lesLignesDuPanier) {
				iDaoLignePieceClient
						.supprimerLignePieceClient(lignePieceClient);
			}
			lesLignesDuPanier.clear();
		}
		return commandeClient;
	}

	@Override
	public CommandeClient ajouterProduitAuPanier(Client client,
			Produit produit, CommandeClient panier) {
		LignePieceClient ligneDeCeProduitDansLePanier = null;
		try {

			ligneDeCeProduitDansLePanier = ligneDeCeProduitDansCetteCommande(
					panier, produit);

			// si ligne de ce produit existe alors on incrémente sa quantité
			if (ligneDeCeProduitDansLePanier != null) {
				ligneDeCeProduitDansLePanier
						.setQuantite(ligneDeCeProduitDansLePanier.getQuantite() + 1);
				if (client != null) {
					iDaoLignePieceClient
							.mettreAjourLignePieceClient(ligneDeCeProduitDansLePanier);
				}
			}
			// sinon on ajoute au panier une ligne avec ce produit
			else {
				LignePieceClient lignePieceClient = new LignePieceClient(null,
						1, 0d, 0d, produit, panier, null, null);
				panier.getLignesPieceClient().add(lignePieceClient);
				// on sauve la commande(le panier) avec son association au
				// client
				if (client != null) {
					panier = iDaoCommandeClient.creerCommandeClient(panier);
				}
				lignePieceClient.setCommandeClient(panier);
				lignePieceClient.setProduit(produit);
				// on sauve la ligne avec sa clef étrangère sur la commande
				if (client != null) {
					iDaoLignePieceClient
							.creerLignePieceClient(lignePieceClient);
				}
			}
			// resultat = true;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return panier;
	}

	@Override
	public CommandeClient panierClient(Client client) {
		CommandeClient panier = null;
		if (client.getCommandesClient().size() == 0) {
			panier = null;
		} else {
			for (CommandeClient commandeClient : client.getCommandesClient()) {
				if (commandeClient.getDatePaiementAccepte() == null) {
					panier = iDaoCommandeClient
							.rechercherCommandeParIdAvecSesLignesEtSesProduits(commandeClient
									.getId());
				}
			}
		}
		return panier;
	}

	private LignePieceClient ligneDeCeProduitDansCetteCommande(
			CommandeClient commandeClient, Produit produit) {
		LignePieceClient result = null;
		// si pas de ligne ==> false
		// sinon
		List<LignePieceClient> lignesPieceClient = commandeClient
				.getLignesPieceClient();
		if (lignesPieceClient.size() > 0) {
			// on parcourt toutes les lignes de la commande
			for (LignePieceClient lignePieceClient : lignesPieceClient) {
				// si on en trouve une dont le produit est celui passé ==> true
				if (lignePieceClient.getProduit().getId() == produit.getId()) {
					result = lignePieceClient;
				}
			}
		}
		return result;
	}

	public CommandeClient rechercherParId(int id) {
		return iDaoCommandeClient.rechercherParId(id);
	}

	@Override
	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(
			int id) {
		return iDaoCommandeClient
				.rechercherCommandeParIdAvecSesLignesEtSesProduits(id);
	}

	@Override
	public List<CommandeClient> commandesParIdClient(int id) {
		return iDaoClient.commandesParIdClient(id);
	}

	@Override
	public double montantTotalHTCommande(CommandeClient commandeClient) {
		double montantTotalHTCommande = 0;
		for (LignePieceClient lignePieceClient : commandeClient
				.getLignesPieceClient()) {
			montantTotalHTCommande += montantTotalHTLigne(lignePieceClient);
		}
		return montantTotalHTCommande;
	}

	@Override
	public double montantTotalTTCCommande(CommandeClient commandeClient) {
		double montantTotalTTCommande = 0;
		double facteurRemise = 1;
		List<LignePieceClient> lignesPieceClient = commandeClient
				.getLignesPieceClient();
		if (!lignesPieceClient.isEmpty()) {
			for (LignePieceClient lignePieceClient : lignesPieceClient) {
				montantTotalTTCommande += montantTotalTTCLigne(lignePieceClient);
			}
			if (commandeClient.getClient() != null) {
				facteurRemise = (1 - commandeClient.getClient().getRemise() / 100);
			}
			montantTotalTTCommande = montantTotalTTCommande * facteurRemise;
		} else {
			montantTotalTTCommande = 0;
		}
		return montantTotalTTCommande;
	}

	@Override
	public double montantTotalTTCLigne(LignePieceClient lignePieceClient) {
		return montantTTCProduit(lignePieceClient.getProduit())
				* lignePieceClient.getQuantite();
	}

	private double montantTotalHTLigne(LignePieceClient lignePieceClient) {
		return lignePieceClient.getProduit().getPrixVenteHT()
				* lignePieceClient.getQuantite();
	}

	@Override
	public TVA tauxTVACommande() {
		return iDaoCommandeClient.tauxTVACommande();
	}

	@Override
	public double montantTTCProduit(Produit produit) {
		return produit.getPrixVenteHT()
				* (1 + produit.getTva().getTaux() / 100);
	}

	@Override
	public List<CommandeClient> recupeCommandesParClient(Integer idClient) {
		return iDaoCommandeClient.recupeCommandesParClient(idClient);
	}

}
