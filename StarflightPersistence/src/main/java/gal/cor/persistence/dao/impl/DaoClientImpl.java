package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Remote
public class DaoClientImpl implements IDaoClient, Serializable
{

	@PersistenceContext(unitName = "YourStarshipPersistence")
	EntityManager em;

	@Override
	public Client creerClient(Client client)
	{
		em.persist(client);
		em.flush();
		return client;
	}

	@Override
	public Client mettreAjourClient(Client client)
	{
		em.merge(client);
		return client;
	}

	@Override
	public Client rechercherParId(Client t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> obtenirTousClient()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
