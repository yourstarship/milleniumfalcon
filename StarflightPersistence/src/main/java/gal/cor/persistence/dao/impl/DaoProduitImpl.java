package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoProduit;
import gal.cor.persistence.entities.Produit;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(IDaoProduit.class)
public class DaoProduitImpl implements IDaoProduit
{

	@Override
	public void creer(Produit t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimer(Class<Produit> type, Object id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Produit mettreAjour(Produit t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> obtenirTous()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit rechercherParId(Class<Produit> type, Object clefPrimaire)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNative(String requeteSQL, Class<Produit> type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerProduit(Produit t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerProduit(Produit t)
	{
		// TODO Auto-generated method stub

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
	public List<Produit> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Produit> obtenirTousProduit()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
