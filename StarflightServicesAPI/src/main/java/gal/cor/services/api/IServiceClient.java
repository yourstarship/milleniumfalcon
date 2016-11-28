package gal.cor.services.api;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.Produit;

import java.util.List;

public interface IServiceClient
{
	public List<Client> listerClients() throws Exception;
	public Client clientExiste(String nom, String motDePasse);
	public Client creer(Client client);
	public Client clientParId(int id);
	public Client clientParIdAvecSesCommandes(int id);
}
