package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.Produit;

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
	private EntityManager em;

	@Override
	public Client creerClient(Client client)
	{
		if (client.getAdresse() != null) {
			em.persist(client.getAdresse());
		}
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
	public Client rechercherClientParId(Integer idClient) {
		String request = "SELECT c FROM Client c  WHERE c.id = :param";
		Query query = em.createQuery(request);
		query.setParameter("param", idClient);
		List<Client>liste= new ArrayList<Client>();
		Client clie = new Client();
		liste= query.getResultList();
		if(!liste.isEmpty()){
			clie=liste.get(0);
			
		
		}

		return clie;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Client rechercherParNomMotDePasse(String nom, String motDePasse)
	{
		Client client = null;
		String request= "SELECT p FROM Client p WHERE UPPER(p.nom) = :param1 AND p.motDePasse = :param2";
		Query query = em.createQuery(request);
		query.setParameter("param1", nom.toUpperCase());
		query.setParameter("param2", motDePasse);
		List<Client> liste = new ArrayList<Client>();
		liste = (List<Client>) query.getResultList();
		if (!liste.isEmpty()) {
			client = liste.get(0);
			log.info("Client.rechercherParNomMotDePasse la requete retourne le client : " + client);
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

	@Override
	public List<CommandeClient> commandesParIdClient(int id)
	{
		List<CommandeClient> commandesParClient = new ArrayList<>();
		String rawQuery = "select c from Client c left join fetch c.commandesClient cC left join fetch cC.lignesPieceClient lPC left join fetch lPC.produit where c.id=:id";
		Query query = em.createQuery(rawQuery);
		query.setParameter("id", id);
		commandesParClient = query.getResultList();
		return commandesParClient;
	}

	@Override
	public Client clientParIdClientAvecSesCommandes(int id)
	{
		Client client = null;
		String rawQuery = "select c from Client c left join fetch c.commandesClient where c.id=:id";
		Query query = em.createQuery(rawQuery);
		query.setParameter("id", id);
		List<Client> clients = query.getResultList();
		if (!clients.isEmpty())
		{
			client = clients.get(0);
		}
		return client;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Client rechercherParIdentifiantMotDePasse(String identifiant, String motDePasse) {
		Client client = new Client();;
		String request= "SELECT p FROM Client p WHERE UPPER(p.identifiant) = :param1 AND p.motDePasse = :param2";
		Query query = em.createQuery(request);
		query.setParameter("param1", identifiant.toUpperCase());
		query.setParameter("param2", motDePasse);
		List<Client> liste = new ArrayList<Client>();		
		liste = (List<Client>)query.getResultList();
		if (!liste.isEmpty()) {
			client = liste.get(0);
			log.info("Client.rechercherParIdentifiantMotDePasse la requete retourne le client : " + client);
		} 
		return client;
	}
}
