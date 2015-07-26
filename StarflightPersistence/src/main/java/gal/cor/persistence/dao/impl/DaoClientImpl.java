package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

@Stateless
public class DaoClientImpl implements IDaoClient {

	Logger log = Logger.getLogger(DaoClientImpl.class);
	
	@PersistenceContext(name="YourStarshipPersistence")
	private EntityManager em;
	
	@Override
	public void creerClient(Client t) {
		if (t.getAdresse() != null) {
			em.persist(t.getAdresse());
			em.flush();
		}

			
		em.persist(t);
	}

	@Override
	public void supprimerClient(Client t) {
		em.remove(t);		
	}

	@Override
	public Client mettreAjourClient(Client t) {
		return em.merge(t);
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
	public Client rechercherParNomMotDePasse(String nom, String motDePasse) {
		Client client = null;
		String request= "SELECT p FROM Client p WHERE UPPER(p.nom) = :param1 AND p.motDePasse = :param2";
		Query query = em.createQuery(request);
		query.setParameter("param1", nom.toUpperCase());
		query.setParameter("param2", motDePasse);
		List<Client> liste = new ArrayList<Client>();		
		liste = (List<Client>)query.getResultList();
		if (!liste.isEmpty()) {
			client = liste.get(0);
			log.info("Client.rechercherParNomMotDePasse la requete retourne le client : " + client);
		}
		return client;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> obtenirTousClient() {
		String request= "SELECT p FROM Client p";
		Query query = em.createQuery(request);
		List<Client> liste = new ArrayList<Client>();		
		liste = (List<Client>)query.getResultList();
		for (Client c : liste) {
			log.info("Client.obtenirTousClient la requete retourne la liste client : " + c);
		}
		
		return liste;
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
