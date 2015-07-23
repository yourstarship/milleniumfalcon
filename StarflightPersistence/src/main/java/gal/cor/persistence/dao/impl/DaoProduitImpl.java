package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoProduit;
import gal.cor.persistence.entities.Produit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Remote(IDaoProduit.class)
public class DaoProduitImpl implements IDaoProduit {
	
	@PersistenceContext(name="YourStarshipPersistence")
	private EntityManager em;

	@Override
	public void creerProduit(Produit t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee) {
		String request= "SELECT p FROM Produit p WHERE p.categorie.nom = :param";
		Query query = em.createQuery(request);
		query.setParameter("param", requeteNommee);
		List<Produit>liste =new ArrayList<Produit>();
		
		liste=query.getResultList();
		return liste;
	}
	@Override
	public void supprimerProduit(Produit t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Produit mettreAjourProduit(Produit t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit rechercherParId(Produit t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> obtenirTousProduit() {
		Query query = em.createQuery("SELECT p FROM Produit p");
		List<Produit>listes = new ArrayList<Produit>();
		listes=query.getResultList();
		
		return listes;
	}

	

}
