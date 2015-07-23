package gal.cor.services.api;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;

public interface ICommandeClientService
{

	public boolean ajouterProduitAuPanier(Client client, Produit produit);

	CommandeClient panierClient(Client client);

}
