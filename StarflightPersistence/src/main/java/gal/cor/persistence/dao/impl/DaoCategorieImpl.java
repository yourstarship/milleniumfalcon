package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCategorie;
import gal.cor.persistence.entities.Categorie;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DaoCategorieImpl implements IDaoCategorie
{

	@Override
	public void creer(Categorie t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimer(Class<Categorie> type, Object id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Categorie mettreAjour(Categorie t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> obtenirTous()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie rechercherParId(Class<Categorie> type, Object clefPrimaire)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> rechercherParRequeteNative(String requeteSQL, Class<Categorie> type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerCategorie(Categorie t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerCategorie(Categorie t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Categorie mettreAjourCategorie(Categorie t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie rechercherParId(Categorie t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Categorie> obtenirTousCategorie()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
