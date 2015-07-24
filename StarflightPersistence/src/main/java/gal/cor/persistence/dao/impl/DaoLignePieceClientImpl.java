package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoLignePieceClient;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

@Remote
@Stateless
public class DaoLignePieceClientImpl implements IDaoLignePieceClient, Serializable
{

	Logger logger = Logger.getLogger(DaoLignePieceClientImpl.class);

	@PersistenceContext(unitName = "YourStarshipPersistence")
	EntityManager em;

	private Produit produit;
	private double quantitee;

	@Override
	public LignePieceClient creerLignePieceClient(LignePieceClient lignePieceClient)
	{
		em.persist(lignePieceClient);
		em.flush();
		return lignePieceClient;
	}

	@Override
	public LignePieceClient mettreAjourLignePieceClient(LignePieceClient lignePieceClient)
	{
		em.merge(lignePieceClient);
		return lignePieceClient;
	}

	@Override
	public void supprimerLignePieceClient(LignePieceClient lignePieceClient)
	{
		em.remove(lignePieceClient);
	}

	@Override
	public LignePieceClient rechercherParId(LignePieceClient t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<LignePieceClient> obtenirTousLignePieceClient()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Produit getProduit()
	{
		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
	}

	public double getQuantitee()
	{
		return quantitee;
	}

	public void setQuantitee(double quantitee)
	{
		this.quantitee = quantitee;
	}

}
