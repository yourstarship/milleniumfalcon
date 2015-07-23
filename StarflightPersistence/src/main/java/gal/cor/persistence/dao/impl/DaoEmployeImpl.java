package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoEmploye;
import gal.cor.persistence.entities.Employe;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DaoEmployeImpl implements IDaoEmploye
{

	@Override
	public void creer(Employe t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimer(Class<Employe> type, Object id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Employe mettreAjour(Employe t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> obtenirTous()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe rechercherParId(Class<Employe> type, Object clefPrimaire)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> rechercherParRequeteNative(String requeteSQL, Class<Employe> type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerEmploye(Employe t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerEmploye(Employe t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Employe mettreAjourEmploye(Employe t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe rechercherParId(Employe t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employe> obtenirTousEmploye()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
