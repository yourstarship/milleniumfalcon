package gal.cor.services.impl;

import gal.cor.persistence.dao.apis.IDaoCommandeClient;
import gal.cor.persistence.dao.apis.IDaoLignePieceClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.ICommandeClientService;

import java.util.Calendar;
import java.util.Set;

import javax.ejb.EJB;

import org.apache.log4j.Logger;

public class CommandeClientServiceImpl implements ICommandeClientService
{
	@EJB
	IDaoCommandeClient iDaoCommandeClient;
	@EJB
	IDaoLignePieceClient iDaoLignePieceClient;

	Logger logger = Logger.getLogger(CommandeClientServiceImpl.class);

	@Override
	public boolean ajouterProduitAuPanier(Client client, Produit produit)
	{
		boolean resultat = false;
		CommandeClient panierDuClient = this.panierClient(client);
		LignePieceClient ligneDeCeProduitDansLePanier = ligneDeCeProduitDansCetteCommande(panierDuClient, produit);

		try
		{
			//si le client n'a pas encore de panier on en crée un
			if (panierDuClient == null)
			{
				panierDuClient = new CommandeClient(null, 0d, Calendar.getInstance().getTime(), null, null, null, null, null);
			}
			//si ligne de ce produit existe alors on incrémente sa quantité
			if (ligneDeCeProduitDansLePanier != null)
			{
				ligneDeCeProduitDansLePanier.setQuantite(ligneDeCeProduitDansLePanier.getQuantite() + 1);
				iDaoLignePieceClient.mettreAjourLignePieceClient(ligneDeCeProduitDansLePanier);
			}
			//sinon on ajoute au panier une ligne avec ce produit
			else
			{
				LignePieceClient lignePieceClient = new LignePieceClient(null, 1, 0d, 0d, produit, panierDuClient, null, null);
				panierDuClient.getLignesPieceClient().add(lignePieceClient);
				iDaoLignePieceClient.creerLignePieceClient(lignePieceClient);
			}
			//on sauve la commande(le panier) avec son association au client
			iDaoCommandeClient.creerCommandeClient(panierDuClient);

		} catch (Exception e)
		{
			logger.error("Une erreur est survenue pendant l'ajout du produit au panier");
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
					panier = commandeClient;
				}
			}
		}
		return panier;
	}

	private LignePieceClient ligneDeCeProduitDansCetteCommande(CommandeClient commandeClient, Produit produit)
	{
		LignePieceClient result = null;
		//TO DO
		//si pas de ligne ==> false
		//sinon
		Set<LignePieceClient> lignesPieceClient = commandeClient.getLignesPieceClient();
		if (lignesPieceClient.size() > 0)
		{
			//	on parcourt toutes les lignes de la commande
			for (LignePieceClient lignePieceClient : lignesPieceClient)
			{
				//	si on en trouve une dont le produit est celui passé ==> true
				if (lignePieceClient.getProduit().getId() == produit.getId())
				{
					result = lignePieceClient;
				}
			}
		}
		return result;
	}

}
