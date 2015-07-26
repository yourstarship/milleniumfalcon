package gal.cor.web.managedbean;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.persistence.entities.TVA;
import gal.cor.services.api.ICommandeClientService;
import gal.cor.services.api.IServiceClient;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean(name = "testPanierMB")
@SessionScoped
public class TestPanierMB
{
	@EJB
	ICommandeClientService iCommandeClientService;
	@EJB
	IServiceClient iClientService;

	@ManagedProperty(value = "#{gestionUtilisateurMBean}")
	private GestionUtilisateurMBean gestionUtilisateurMBean;

	private Logger logger = Logger.getLogger(this.getClass());
	private DecimalFormat dF = new DecimalFormat("### ### ### ### ### ##0.00");

	private CommandeClient panier;

	// List<LignePieceClient> lignesPanier = new ArrayList<>();

	@PostConstruct
	public void init()
	{
		// si le client est connecté
		if (gestionUtilisateurMBean.getClient() != null)
		{
			// on cherche son panier
			panier = this.panierClient(gestionUtilisateurMBean.getClient());
			// on le crée s'il n'en a pas
			if (panier == null)
			{
				panier = new CommandeClient();
				panier.setDateCreation(Calendar.getInstance().getTime());
			}
			// lignesPanier.addAll(panier.getLignesPieceClient());
		} else
		// sinon on crée un panier pour l'utilisateur non connecté
		{
			panier = new CommandeClient();
			panier.setDateCreation(Calendar.getInstance().getTime());
			// lignesPanier.addAll(panier.getLignesPieceClient());
		}
	}

	// public void rechargeLignes()
	// {
	// lignesPanier.clear();
	// lignesPanier.addAll(panier.getLignesPieceClient());
	// }

	public void ajouterUnProduitChoisi(Produit produit)
	{
		this.panier = iCommandeClientService.ajouterProduitAuPanier(gestionUtilisateurMBean.getClient(), produit, panier);
		// this.rechargeLignes();
	}

	public void viderPanier()
	{
		this.panier = iCommandeClientService.viderPanier(gestionUtilisateurMBean.getClient(), this.panier);
	}

	/**
	 * @author Filippo Retourne le panier, contenant ses lignes, <br/>
	 *         contenant à leur tour leur produit
	 * @param client
	 * @return le panier de type CommandeClient
	 */
	public CommandeClient panierClient(Client client)
	{
		return iCommandeClientService.panierClient(client);
	}

	public void incrementeQuantiteLigne(LignePieceClient lignePieceClient)
	{
		this.panier = iCommandeClientService.incrementeQuantiteLigne(gestionUtilisateurMBean.getClient(), lignePieceClient);
	}

	public void decrementeQuantiteLigne(LignePieceClient lignePieceClient)
	{
		this.panier = iCommandeClientService.decrementeQuantiteLigne(gestionUtilisateurMBean.getClient(), lignePieceClient);
	}

	public void supprimerLignePieceClient(LignePieceClient lignePieceClient)
	{
		this.panier = iCommandeClientService.supprimerLignePieceClient(gestionUtilisateurMBean.getClient(), lignePieceClient);
		// this.rechargeLignes();

	}

	public void miseAJourQuantiteLigne(LignePieceClient lignePieceClient, int nouvelleQuantite)
	{
		this.panier = iCommandeClientService.miseAJourQuantiteLigne(gestionUtilisateurMBean.getClient(), lignePieceClient, nouvelleQuantite);
		// this.rechargeLignes();
	}

	// historique des commandes
	public List<CommandeClient> commandesParClient()// TODO :Fil remettre args
													// :Client client
	{

		/**
		 * TODO :Fil enlever zone de test
		 */
		Client client = iClientService.clientParId(1);
		// les commandes sont renvoyées sans leurs lignes
		List<CommandeClient> historiqueCommandesClient = iCommandeClientService.commandesParIdClient(client.getId());
		for (CommandeClient commandeClient : historiqueCommandesClient)
		{
			logger.info(commandeClient);
		}
		/**
		 * Fin zone pour test
		 */

		return iCommandeClientService.commandesParIdClient(client.getId());
	}

	// montant total ht panier
	public double montantTotalHTPanier()// TODO :Fil - remettre args :Client
										// client
	{
		/**
		 * TODO :Fil - début zone pour test à enlever
		 */
		Client client = iClientService.clientParId(1);
		CommandeClient commandeClient = iCommandeClientService.panierClient(client);
		/**
		 * fin zone pour test à enlever
		 */
		// la commande doit contenir ses lignes et les lignes doivent contenir
		// leurs produits
		return iCommandeClientService.montantTotalHTCommande(commandeClient);
	}

	// montant total ht commande
	public double montantTotalHTCommande()// TODO :Fil - remettre args
											// :CommandeClient commandeClient
	{
		/**
		 * TODO :Fil - début zone pour test à enlever
		 */
		CommandeClient commandeClient = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(1);
		/**
		 * fin zone pour test à enlever
		 */
		// la commande doit contenir ses lignes et les lignes doivent contenir
		// leurs produits
		return iCommandeClientService.montantTotalHTCommande(commandeClient);
	}

	// montant total TTC commande
	public double montantTotalTTC()// TODO :Fil - remettre args :CommandeClient
									// commandeClient
	{
		/**
		 * TODO :Fil - début zone pour test à enlever
		 */
		CommandeClient commandeClient = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(1);
		/**
		 * fin zone pour test à enlever
		 */
		// récupère le client dans la session
		// récupère le panier complet du client
		// la commande doit contenir ses lignes et les lignes doivent contenir
		// leurs produits
		return iCommandeClientService.montantTotalTTCCommande(commandeClient);
	}

	// montant total TTC panier
	public String montantTotalTTCPanier()
	{
		// la commande doit contenir ses lignes et les lignes doivent contenir
		// leurs produits
		double montantTotalTTCPanier = iCommandeClientService.montantTotalTTCCommande(panier);
		// montantTotalTTCPanier = Math.round(montantTotalTTCPanier * 100) /
		// 100;
		return dF.format(montantTotalTTCPanier);
	}

	// tva commande
	public TVA tauxTVACommande()
	{
		return iCommandeClientService.tauxTVACommande();
	}

	public String montantTotalTTCLigne(LignePieceClient lignePieceClient)
	{
		return dF.format(iCommandeClientService.montantTotalTTCLigne(lignePieceClient));
	}

	public String montantTTCProduit(Produit produit)
	{
		return dF.format(iCommandeClientService.montantTTCProduit(produit));
	}

	public CommandeClient getPanier()
	{
		return panier;
	}

	public void setPanier(CommandeClient panier)
	{
		this.panier = panier;
	}

	public ICommandeClientService getiCommandeClientService()
	{
		return iCommandeClientService;
	}

	public void setiCommandeClientService(ICommandeClientService iCommandeClientService)
	{
		this.iCommandeClientService = iCommandeClientService;
	}

	public IServiceClient getiClientService()
	{
		return iClientService;
	}

	public void setiClientService(IServiceClient iClientService)
	{
		this.iClientService = iClientService;
	}

	public GestionUtilisateurMBean getGestionUtilisateurMBean()
	{
		return gestionUtilisateurMBean;
	}

	public void setGestionUtilisateurMBean(GestionUtilisateurMBean gestionUtilisateurMBean)
	{
		this.gestionUtilisateurMBean = gestionUtilisateurMBean;
	}

	public Logger getLogger()
	{
		return logger;
	}

	public void setLogger(Logger logger)
	{
		this.logger = logger;
	}

	// public List<LignePieceClient> getLignesPanier()
	// {
	// return lignesPanier;
	// }
	//
	// public void setLignesPanier(List<LignePieceClient> lignesPanier)
	// {
	// this.lignesPanier = lignesPanier;
	// }

}
