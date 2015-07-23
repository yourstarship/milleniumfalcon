package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoPersonne;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.Personne;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

@Stateless
public class DaoPersonneImpl implements IDaoPersonne {

	Logger log = Logger.getLogger(DaoPersonneImpl.class);
	
	@PersistenceContext(name="YourStarshipPersistence")
	private EntityManager em;
	
	@Override
	public void creerPersonne(Personne t) {
		//Le nom est stocké en majuscule
		t.setNom(t.getNom().toUpperCase());
		em.persist(t);		
	}

	@Override
	public void supprimerPersonne(Personne t) {
		em.remove(t);
	}

	@Override
	public Personne mettreAjourPersonne(Personne t) {
		return em.merge(t);
	}

	@Override
	public Personne rechercherParId(Personne t) {
		return em.find(Personne.class, t.getId());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> rechercherParNom(String nom) {
		String request= "SELECT p FROM Personne p WHERE p.nom = :param";
		Query query = em.createQuery(request);
		query.setParameter("param", nom.toUpperCase());
		List<Personne>liste =new ArrayList<Personne>();
		liste = (List<Personne>)query.getResultList();
		return liste;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Personne rechercherParEmail(String email) {
		Personne personne = null;
		String request= "SELECT p FROM Personne p WHERE p.nom = :param1";
		Query query = em.createQuery(request);
		query.setParameter("param1", email);
		List<Personne> liste = new ArrayList<Personne>();		
		liste = (List<Personne>)query.getResultList();
		if (liste.size() == 1) {
			personne = liste.get(0);
			log.info("Client.rechercherParEmail la requete retourne le personne : " + personne);
		} else if (liste.size() > 1) {
			personne = liste.get(0);
			log.warn("Client.rechercherParEmail la requete retourne plus d'un client, on utilise : " + personne);
		}
		return personne;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> obtenirTousPersonne() {
		String request= "SELECT p FROM Personne p";
		Query query = em.createQuery(request);
		List<Personne>liste =new ArrayList<Personne>();
		liste = (List<Personne>)query.getResultList();
		return liste;
	}
}
