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
public class DaoProduitImpl implements IDaoProduit
{

	@PersistenceContext(name = "YourStarshipPersistence")
	private EntityManager em;

	@Override
	public Produit creerProduit(Produit produit)
	{
		em.persist(produit);
		em.flush();
		return produit;
	}

	@Override
	public Produit mettreAjourProduit(Produit t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit rechercherParId(Produit t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> obtenirTousProduit()
	{
		Query query = em.createQuery("SELECT p FROM Produit p");
		List<Produit> listes = new ArrayList<Produit>();
		listes = query.getResultList();

		return listes;
	}

	@Override
	public List<Produit> rechercherProduitParCategorieEtType(Integer idCategorie, Integer idType)
	{
		String request = " SELECT p FROM Produit p WHERE p.categorie.id = :param AND p.type.id =:paramType";
		Query query = em.createQuery(request);
		query.setParameter("param", idCategorie);
		query.setParameter("paramType", idType);
		List<Produit> liste = new ArrayList<Produit>();
		liste = query.getResultList();
		System.out.println(liste);
		return liste;
	}

	@Override
	public List<Produit> rechercherParCategorie(Integer idCategorie)
	{
		String request = "SELECT p FROM Produit p WHERE p.categorie.id = :param";
		Query query = em.createQuery(request);
		query.setParameter("param", idCategorie);
		List<Produit> liste = new ArrayList<Produit>();

		liste = query.getResultList();
		return liste;
	}

}
