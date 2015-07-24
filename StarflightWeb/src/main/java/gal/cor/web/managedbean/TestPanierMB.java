package gal.cor.web.managedbean;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.ICommandeClientService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

	Logger logger = Logger.getLogger(this.getClass());

	public String ajouterUnProduitChoisi(Client client, Produit produit)
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
		Client unClientSansCommande = new Client(null, "John", "Edward", dateDeNaissance, "login", "password", dateOuverture, dernierAcces, false, 0d, null, null);
		/**
		 * >>>>>>>>>>>>> Fin code pour test
		 */
		/**
		 * TODO :Fil, brancher les paramètres plutôt que les objets de test
		 */
		iCommandeClientService.ajouterProduitAuPanier(unClientSansCommande, unProduit);
		return "";
	}

	public String viderPanier(CommandeClient commandeClient)
	{
		/**
		 * TODO :Fil, supprimer code pour test
		 */
		/**
		 * Début code de test
		 */
		CommandeClient commande = iCommandeClientService.rechercherParId(105);
		/**
		 * Fin code de test
		 */
		iCommandeClientService.viderPanier(commande);
		return "";
	}

	public CommandeClient panierClient(Client client)
	{
		return iCommandeClientService.panierClient(client);
	}
}
