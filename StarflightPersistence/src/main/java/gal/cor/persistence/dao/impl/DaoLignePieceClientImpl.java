package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoLignePieceClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;

import java.util.Collection;
import java.util.List;
import java.util.Map;

<<<<<<< HEAD
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

public class DaoLignePieceClientImpl implements IDaoLignePieceClient
{

	Logger logger = Logger.getLogger(DaoLignePieceClientImpl.class);

	@PersistenceContext(unitName = "YourStarshipPersistence")
	EntityManager em;

	private Produit produit;
	private double quantitee;

	@Override
	public void creerLignePieceClient(LignePieceClient lignePieceClient)
	{
		em.persist(lignePieceClient);
	}

	@Override
	public LignePieceClient mettreAjourLignePieceClient(LignePieceClient lignePieceClient)
	{
		em.merge(lignePieceClient);
		return lignePieceClient;
	}

	@Override
	public void supprimerLignePieceClient(LignePieceClient t)
	{
		// TODO Auto-generated method stub

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
=======
public class DaoLignePieceClientImpl  implements IDaoLignePieceClient {

	@Override
	public void creerLignePieceClient(LignePieceClient t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerLignePieceClient(LignePieceClient t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LignePieceClient mettreAjourLignePieceClient(LignePieceClient t) {
>>>>>>> mf/master
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
=======
	public LignePieceClient rechercherParId(LignePieceClient t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(
			String requeteNommee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(
			String requeteNommee, Map<String, Object> parametres,
			int nbreMaxElements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(
			String requeteNommee, Map<String, Object> parametres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LignePieceClient> rechercherParRequeteNommee(
			String requeteNommee, int nbreMaxElements) {
>>>>>>> mf/master
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
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
=======
	public Collection<LignePieceClient> obtenirTousLignePieceClient() {
		// TODO Auto-generated method stub
		return null;
>>>>>>> mf/master
	}

	

}
