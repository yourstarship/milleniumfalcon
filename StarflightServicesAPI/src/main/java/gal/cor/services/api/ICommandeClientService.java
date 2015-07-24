package gal.cor.services.api;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;

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

	//public CommandeClient rechercherParId(int id);

	//testée
	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(int id);

}
