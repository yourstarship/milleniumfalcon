package gal.cor.services.api;

import java.util.List;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;

public interface ICommandeClientService
{

	public boolean ajouterProduitAuPanier(Client client, Produit produit);

	public CommandeClient panierClient(Client client);

	public boolean incrementeQuantiteLigne(LignePieceClient lignePieceClient);

	public boolean decrementeQuantiteLigne(CommandeClient commandeClient, LignePieceClient lignePieceClient);

	public boolean viderPanier(CommandeClient commandeClient);

	public boolean supprimerLigne(CommandeClient commandeClient, LignePieceClient lignePieceClient);
	
	public CommandeClient rechercherParId(int id);
	
	List<CommandeClient> recupeCommandesParClient(Integer idClient);

}
