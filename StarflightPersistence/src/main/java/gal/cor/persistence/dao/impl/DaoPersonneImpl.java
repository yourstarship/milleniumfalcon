package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoPersonne;
import gal.cor.persistence.entities.Personne;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DaoPersonneImpl implements IDaoPersonne
{

	@Override
	public void creer(Personne t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimer(Class<Personne> type, Object id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Personne mettreAjour(Personne t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> obtenirTous()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne rechercherParId(Class<Personne> type, Object clefPrimaire)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> rechercherParRequeteNative(String requeteSQL, Class<Personne> type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerPersonne(Personne t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerPersonne(Personne t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Personne mettreAjourPersonne(Personne t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne rechercherParId(Personne t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Personne> obtenirTousPersonne()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
