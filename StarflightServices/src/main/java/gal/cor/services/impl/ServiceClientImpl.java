package gal.cor.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.IServiceClient;

@Stateful
public class ServiceClientImpl implements IServiceClient
{

	@EJB
	//injection de dependance
	private IDaoClient daoClient;

	@Override
	public List<Client> listerClients() throws Exception
	{
		return daoClient.obtenirTousClient();
	}

	@Override
	public Client clientExiste(String nom, String motDePasse)
	{
		Client client = daoClient.rechercherParNomMotDePasse(nom, motDePasse);
		return client;
	}

	@Override
	public Client clientParId(int id)
	{
		return daoClient.rechercherParId(id);
	}

	@Override
	public Client clientParIdAvecSesCommandes(int id)
	{
		return daoClient.clientParIdClientAvecSesCommandes(id);
	}

}
