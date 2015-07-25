package gal.cor.web.managedbean;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.persistence.entities.TVA;
import gal.cor.services.api.ICommandeClientService;
import gal.cor.services.api.IServiceClient;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean
@SessionScoped
public class TestPanierMB
{
	@EJB
	ICommandeClientService iCommandeClientService;
	@EJB
	IServiceClient iClientService;

	Logger logger = Logger.getLogger(this.getClass());

	public String ajouterUnProduitChoisi()//TODO	:Fil, ajouter args Client client, Produit produit
	{
		/**
		 * TODO :Fil enlever zone de test
		 */
		/**
		 * <<<<<<<<<<<<< Début code pour test
		 */
		Produit unProduit = new Produit(null, "nomProduit", "description", "chemin photo", 10.0, 20.0, 100, Calendar.getInstance().getTime(), false, 10, null, null, 360, 1000, 5, 3, 1, 2, 2);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date dateDeNaissance = null, dateOuverture = null, dernierAcces = null;
		try
		{
			dateDeNaissance = sdf.parse("12/01/1980");
			dateOuverture = (sdf).parse("12/01/1990");
			dernierAcces = (sdf).parse("12/01/1990");
		} catch (Exception e)
		{

		}
		Client unClientSansCommande = new Client(null, "John", "Edward", dateDeNaissance, "01 45 26 89 25", "a.a@com", "login", "password", dateOuverture, dernierAcces, false, 0d, null, null);
		/**
		 * >>>>>>>>>>>>> Fin code pour test
		 */
		/**
		 * TODO :Fil, brancher les paramètres plutôt que les objets de test
		 */
		iCommandeClientService.ajouterProduitAuPanier(unClientSansCommande, unProduit);
		return "";
	}

	public String viderPanier()//TODO	:Fil +Client client
	{

		/**
		 * TODO :Fil, supprimer code pour test
		 */
		/**
		 * Début code de test
		 */
		CommandeClient commande = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(131);
		/**
		 * Fin code de test
		 */
		iCommandeClientService.viderPanier(commande);
		return "";
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

	public boolean incrementeQuantiteLigne()//TODO	:Fil ajouter args : LignePieceClient lignePieceClient
	{
		/**
		 * TODO :Fil, supprimer code pour test
		 */
		/**
		 * Début code de test
		 */
		CommandeClient commande = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(34);
		//TODO	:Fil : penser à enlever l'initialisation
		LignePieceClient lignePieceClient = (LignePieceClient) commande.getLignesPieceClient().toArray()[0];
		/**
		 * Fin code de test
		 */
		boolean result = false;
		iCommandeClientService.incrementeQuantiteLigne(lignePieceClient);
		return result;
	}

	public boolean decrementeQuantiteLigne() //TODO	:Fil	: ajouter args : CommandeClient commandeClient, LignePieceClient lignePieceClient
	{
		/**
		 * TODO :Fil, supprimer code pour test
		 */
		/**
		 * Début code de test
		 */
		CommandeClient commandeClient = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(34);
		//TODO	:Fil : penser à enlever l'initialisation
		LignePieceClient lignePieceClient = (LignePieceClient) commandeClient.getLignesPieceClient().toArray()[0];
		/**
		 * Fin code de test
		 */
		boolean result = false;
		iCommandeClientService.decrementeQuantiteLigne(commandeClient, lignePieceClient);
		return result;
	}

	public boolean supprimerLignePieceClient(CommandeClient commandeClient, LignePieceClient lignePieceClient)
	{
		boolean result = false;
		iCommandeClientService.supprimerLignePieceClient(commandeClient, lignePieceClient);
		return result;
	}

	//historique des commandes
	public List<CommandeClient> commandesParClient()//TODO	:Fil remettre args :Client client 
	{

		/**
		 * TODO :Fil enlever zone de test
		 */
		Client client = iClientService.clientParId(1);
		//les commandes sont renvoyées sans leurs lignes
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

	//montant total ht panier
	public double montantTotalHTPanier()//TODO	:Fil - remettre args :Client client
	{
		/**
		 * TODO :Fil - début zone pour test à enlever
		 */
		Client client = iClientService.clientParId(1);
		CommandeClient commandeClient = iCommandeClientService.panierClient(client);
		/**
		 * fin zone pour test à enlever
		 */
		//la commande doit contenir ses lignes et les lignes doivent contenir leurs produits
		return iCommandeClientService.montantTotalHTCommande(commandeClient);
	}

	//montant total ht commande
	public double montantTotalHTCommande()//TODO	:Fil - remettre args :CommandeClient commandeClient
	{
		/**
		 * TODO :Fil - début zone pour test à enlever
		 */
		CommandeClient commandeClient = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(1);
		/**
		 * fin zone pour test à enlever
		 */
		//la commande doit contenir ses lignes et les lignes doivent contenir leurs produits
		return iCommandeClientService.montantTotalHTCommande(commandeClient);
	}

	//montant total TTC commande
	public double montantTotalTTC()//TODO	:Fil - remettre args :CommandeClient commandeClient
	{
		/**
		 * TODO :Fil - début zone pour test à enlever
		 */
		CommandeClient commandeClient = iCommandeClientService.rechercherCommandeParIdAvecSesLignesEtSesProduits(1);
		/**
		 * fin zone pour test à enlever
		 */
		//récupère le client dans la session
		//récupère le panier complet du client
		//la commande doit contenir ses lignes et les lignes doivent contenir leurs produits
		return iCommandeClientService.montantTotalTTCCommande(commandeClient);
	}

	//montant total TTC panier
	public String montantTotalTTCPanier()
	{
		//récupère le client dans la session
		Client client = null;//TODO	:Fil - récupérer le client en session
		/**
		 * TODO :Fil - supprimer zone test - début zone test
		 */
		client = iClientService.clientParIdAvecSesCommandes(134);
		/**
		 * 
		 */
		//récupère le panier complet du client
		CommandeClient panier = panierClient(client);
		//la commande doit contenir ses lignes et les lignes doivent contenir leurs produits
		double montantTotalTTCPanier = iCommandeClientService.montantTotalTTCCommande(panier);
		//		montantTotalTTCPanier = Math.round(montantTotalTTCPanier * 100) / 100;
		DecimalFormat dF = new DecimalFormat("### ### ### ### ### ##0.00");
		return dF.format(montantTotalTTCPanier);
	}

	//tva commande
	public TVA tauxTVACommande()
	{
		return iCommandeClientService.tauxTVACommande();
	}

}
