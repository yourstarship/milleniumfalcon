package gal.cor.services.api;

import gal.cor.persistence.entities.Client;

import java.util.List;

public interface IServiceClient {

	public List<Client> listerClient() throws Exception;
	public Client clientExiste(String nom, String motDePasse);
	
}
