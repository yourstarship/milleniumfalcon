package gal.cor.services.api;

import java.util.List;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.persistence.entities.TVA;

public interface ICommandeClientService
{

	//testée
	public CommandeClient ajouterProduitAuPanier(Client client, Produit produit, CommandeClient panier);

	//testée
	public CommandeClient panierClient(Client client);

	//testée
	public CommandeClient incrementeQuantiteLigne(Client client, LignePieceClient lignePieceClient);

	//testée
	public CommandeClient decrementeQuantiteLigne(Client client, LignePieceClient lignePieceClient);

	//testée
	public CommandeClient viderPanier(CommandeClient commandeClient);

	//testée
	public CommandeClient supprimerLignePieceClient(Client client, LignePieceClient lignePieceClient);

	public CommandeClient rechercherParId(int id);

	//testée
	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(int id);

	//historique des commandes
	public List<CommandeClient> commandesParIdClient(int id);

	//montant total HT commande
	public double montantTotalHTCommande(CommandeClient commandeClient);

	//tva commande
	public TVA tauxTVACommande();

	//montant total TTC commande
	public double montantTotalTTCCommande(CommandeClient commandeClient);

	public double montantTotalTTCLigne(LignePieceClient lignePieceClient);

	public double montantTTCProduit(Produit produit);

	public CommandeClient miseAJourQuantiteLigne(Client client, LignePieceClient lignePieceClient, int nouvelleQuantite);

}
