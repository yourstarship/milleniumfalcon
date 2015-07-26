package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCarte;
import gal.cor.persistence.entities.Carte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Remote(IDaoCarte.class)
public class DaoCarteImpl  implements IDaoCarte {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void creerCarte(Carte t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carte rechercherParId(Integer idCarte) {
		
		return em.find(Carte.class, idCarte);
	}

	@Override
	public List<Carte> rechercherParRequeteNommee(String requeteNommee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carte> rechercherParRequeteNommee(String requeteNommee,
			Map<String, Object> parametres, int nbreMaxElements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carte> rechercherParRequeteNommee(String requeteNommee,
			Map<String, Object> parametres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carte> rechercherParRequeteNommee(String requeteNommee,
			int nbreMaxElements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Carte> obtenirTousCarte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carte> RechercheCartesParIdClient(Integer idClient) {
		
		List<Carte>liste = new ArrayList<Carte>();
		String request="SELECT c FROM Carte c WHERE c.client.id = :param";
		
		Query query = em .createQuery(request);
		query.setParameter("param", idClient);
		liste=query.getResultList();
		
		return liste;
	}




}
