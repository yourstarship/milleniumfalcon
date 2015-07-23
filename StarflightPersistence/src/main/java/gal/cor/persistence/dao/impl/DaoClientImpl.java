package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.Personne;

import java.util.ArrayList;
import java.util.Collection;
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
		//Le nom est stocké en majuscule
		t.setNom(t.getNom().toUpperCase());
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
	public Client rechercherParId(Client t) {
		return em.find(Client.class, t.getId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Client rechercherParNomMotDePasse(String nom, String motDePasse) {
		Client client = null;
		String request= "SELECT p FROM Client p WHERE p.nom = :param1 AND p.motDePasse = :param2";
		Query query = em.createQuery(request);
		query.setParameter("param1", nom.toUpperCase());
		query.setParameter("param2", motDePasse);
		List<Client> liste = new ArrayList<Client>();		
		liste = (List<Client>)query.getResultList();
		if (liste.size() == 1) {
			client = liste.get(0);
			log.info("Client.rechercherParNomMotDePasse la requete retourne le client : " + client);
		} else if (liste.size() > 1) {
			client = liste.get(0);
			log.warn("Client.rechercherParNomMotDePasse la requete retourne plus d'un client, on utilise : " + client);
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



}
