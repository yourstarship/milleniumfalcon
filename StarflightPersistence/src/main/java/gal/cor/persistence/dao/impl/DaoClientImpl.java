package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

@Stateless
@Remote
public class DaoClientImpl implements IDaoClient, Serializable
{

	Logger log = Logger.getLogger(this.getClass());

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
	public void supprimerClient(Client t)
	{
		em.remove(t);
	}

	@Override
	public Client mettreAjourClient(Client client)
	{
		em.merge(client);
		return client;
	}

	@Override
	public Client rechercherParId(Client client)
	{
		return em.find(Client.class, client.getId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Client rechercherParNomMotDePasse(String nom, String motDePasse)
	{
		Client client = null;
		String request = "SELECT p FROM Client p WHERE p.nom = :param1 AND p.motDePasse = :param2";
		Query query = em.createQuery(request);
		query.setParameter("param1", nom.toUpperCase());
		query.setParameter("param2", motDePasse);
		List<Client> liste = new ArrayList<Client>();
		liste = (List<Client>) query.getResultList();
		if (liste.size() == 1)
		{
			client = liste.get(0);
			log.info("Client.rechercherParNomMotDePasse la requete retourne le client : " + client);
		} else if (liste.size() > 1)
		{
			client = liste.get(0);
			log.warn("Client.rechercherParNomMotDePasse la requete retourne plus d'un client, on utilise : " + client);
		}
		return client;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> obtenirTousClient()
	{
		String request = "SELECT p FROM Client p";
		Query query = em.createQuery(request);
		List<Client> liste = new ArrayList<Client>();
		liste = (List<Client>) query.getResultList();
		for (Client c : liste)
		{
			log.info("Client.obtenirTousClient la requete retourne la liste client : " + c);
		}

		return liste;
	}

}
