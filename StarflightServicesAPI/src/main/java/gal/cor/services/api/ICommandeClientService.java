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
	public boolean ajouterProduitAuPanier(Client client, Produit produit);

	//testée
	public CommandeClient panierClient(Client client);

	//testée
	public boolean incrementeQuantiteLigne(LignePieceClient lignePieceClient);

	//testée
	public boolean decrementeQuantiteLigne(CommandeClient commandeClient, LignePieceClient lignePieceClient);

	//testée
	public boolean viderPanier(CommandeClient commandeClient);

	//testée
	public boolean supprimerLignePieceClient(CommandeClient commandeClient, LignePieceClient lignePieceClient);

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

}
