package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DaoClientImpl implements IDaoClient
{

	@Override
	public void creer(Client t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimer(Class<Client> type, Object id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Client mettreAjour(Client t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> obtenirTous()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client rechercherParId(Class<Client> type, Object clefPrimaire)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> rechercherParRequeteNative(String requeteSQL, Class<Client> type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerClient(Client t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerClient(Client t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Client mettreAjourClient(Client t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client rechercherParId(Client t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Client> obtenirTousClient()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
