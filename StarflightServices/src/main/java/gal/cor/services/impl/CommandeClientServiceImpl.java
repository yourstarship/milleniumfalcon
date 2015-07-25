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
public class CommandeClientServiceImpl implements ICommandeClientService
{
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
	public boolean incrementeQuantiteLigne(LignePieceClient lignePieceClient)
	{
		boolean result = false;
		lignePieceClient.setQuantite(lignePieceClient.getQuantite() + 1);
		iDaoLignePieceClient.mettreAjourLignePieceClient(lignePieceClient);
		return result;
	}

	@Override
	public boolean decrementeQuantiteLigne(CommandeClient commandeClient, LignePieceClient lignePieceClient)
	{
		boolean result = false;
		if (lignePieceClient.getQuantite() > 1)
		{
			lignePieceClient.setQuantite(lignePieceClient.getQuantite() - 1);
			iDaoLignePieceClient.mettreAjourLignePieceClient(lignePieceClient);
		} else if (lignePieceClient.getQuantite() == 1)
		{
			lignePieceClient.setQuantite(lignePieceClient.getQuantite() - 1);
			this.supprimerLignePieceClient(commandeClient, lignePieceClient);
		}
		return result;
	}

	public boolean miseAJourQuantiteLigne(LignePieceClient lignePieceClient, int nouvelleQuantite)
	{
		boolean result = false;
		lignePieceClient.setQuantite(nouvelleQuantite);
		iDaoLignePieceClient.mettreAjourLignePieceClient(lignePieceClient);
		return result;
	}

	@Override
	public boolean supprimerLignePieceClient(CommandeClient commandeClient, LignePieceClient lignePieceClient)
	{
		boolean result = false;
		commandeClient.getLignesPieceClient().remove(lignePieceClient);
		iDaoLignePieceClient.supprimerLignePieceClient(lignePieceClient);
		return result;
	}

	@Override
	public boolean viderPanier(CommandeClient commandeClient)
	{
		boolean result = false;
		Set<LignePieceClient> lesLignesDuPanier = commandeClient.getLignesPieceClient();
		if (lesLignesDuPanier.size() > 0)
		{
			for (LignePieceClient lignePieceClient : lesLignesDuPanier)
			{
				iDaoLignePieceClient.supprimerLignePieceClient(lignePieceClient);
			}
			lesLignesDuPanier.clear();
		}
		return result;
	}

	@Override
	public boolean ajouterProduitAuPanier(Client client, Produit produit)
	{
		boolean resultat = false;

		/**
		 * TODO :Fil supprimer cette ligne car le client existera deja
		 */
		client = iDaoClient.creerClient(client);
		CommandeClient panierDuClient = this.panierClient(client);
		LignePieceClient ligneDeCeProduitDansLePanier = null;

		try
		{
			// si le client n'a pas encore de panier on en crée un
			if (panierDuClient == null)
			{
				panierDuClient = new CommandeClient(null, 0d, Calendar.getInstance().getTime(), null, null, null, null, null);
				panierDuClient.setClient(client);
			} else
			{
				ligneDeCeProduitDansLePanier = ligneDeCeProduitDansCetteCommande(panierDuClient, produit);
			}
			// si ligne de ce produit existe alors on incrémente sa quantité
			if (ligneDeCeProduitDansLePanier != null)
			{
				ligneDeCeProduitDansLePanier.setQuantite(ligneDeCeProduitDansLePanier.getQuantite() + 1);
				iDaoLignePieceClient.mettreAjourLignePieceClient(ligneDeCeProduitDansLePanier);
			}
			// sinon on ajoute au panier une ligne avec ce produit
			else
			{
				LignePieceClient lignePieceClient = new LignePieceClient(null, 1, 0d, 0d, produit, panierDuClient, null, null);
				panierDuClient.getLignesPieceClient().add(lignePieceClient);
				// on sauve la commande(le panier) avec son association au
				// client
				panierDuClient = iDaoCommandeClient.creerCommandeClient(panierDuClient);
				lignePieceClient.setCommandeClient(panierDuClient);
				/**
				 * TODO :Fil supprimer cette ligne car le produit existera déjà
				 * dans la base
				 */
				produit = iDaoProduit.creerProduit(produit);
				lignePieceClient.setProduit(produit);
				// on sauve la ligne avec sa clef étrangère sur la commande
				iDaoLignePieceClient.creerLignePieceClient(lignePieceClient);
			}
			resultat = true;
		} catch (Exception e)
		{
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return resultat;
	}

	@Override
	public CommandeClient panierClient(Client client)
	{
		CommandeClient panier = null;
		if (client.getCommandesClient().size() == 0)
		{
			panier = null;
		} else
		{
			for (CommandeClient commandeClient : client.getCommandesClient())
			{
				if (commandeClient.getDatePaiementAccepte() == null)
				{
					panier = iDaoCommandeClient.rechercherCommandeParIdAvecSesLignesEtSesProduits(commandeClient.getId());
				}
			}
		}
		return panier;
	}

	private LignePieceClient ligneDeCeProduitDansCetteCommande(CommandeClient commandeClient, Produit produit)
	{
		LignePieceClient result = null;
		// si pas de ligne ==> false
		// sinon
		Set<LignePieceClient> lignesPieceClient = commandeClient.getLignesPieceClient();
		if (lignesPieceClient.size() > 0)
		{
			// on parcourt toutes les lignes de la commande
			for (LignePieceClient lignePieceClient : lignesPieceClient)
			{
				// si on en trouve une dont le produit est celui passé ==> true
				if (lignePieceClient.getProduit().getId() == produit.getId())
				{
					result = lignePieceClient;
				}
			}
		}
		return result;
	}

	public CommandeClient rechercherParId(int id)
	{
		return iDaoCommandeClient.rechercherParId(id);
	}

	@Override
	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(int id)
	{
		return iDaoCommandeClient.rechercherCommandeParIdAvecSesLignesEtSesProduits(id);
	}

	@Override
	public List<CommandeClient> commandesParIdClient(int id)
	{
		return iDaoClient.commandesParIdClient(id);
	}

	@Override
	public double montantTotalHTCommande(CommandeClient commandeClient)
	{
		double montantTotalHTCommande = 0;
		for (LignePieceClient lignePieceClient : commandeClient.getLignesPieceClient())
		{
			montantTotalHTCommande += montantTotalHTLigne(lignePieceClient);
		}
		return montantTotalHTCommande;
	}

	@Override
	public double montantTotalTTCCommande(CommandeClient commandeClient)
	{
		double montantTotalTTCommande = 0;
		for (LignePieceClient lignePieceClient : commandeClient.getLignesPieceClient())
		{
			montantTotalTTCommande += montantTotalTTCLigne(lignePieceClient);
		}
		montantTotalTTCommande = montantTotalTTCommande * (1 - commandeClient.getClient().getRemise() / 100);
		return montantTotalTTCommande;
	}

	private double montantTotalTTCLigne(LignePieceClient lignePieceClient)
	{
		return lignePieceClient.getProduit().getPrixVenteHT() * lignePieceClient.getQuantite() * (1 + lignePieceClient.getProduit().getTva().getTaux() / 100);
	}

	private double montantTotalHTLigne(LignePieceClient lignePieceClient)
	{
		return lignePieceClient.getProduit().getPrixVenteHT() * lignePieceClient.getQuantite();
	}

	@Override
	public TVA tauxTVACommande()
	{
		return iDaoCommandeClient.tauxTVACommande();
	}

}
