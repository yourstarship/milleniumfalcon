package gal.cor.persistence.dao.apis;

import gal.cor.persistence.entities.Client;

import java.util.List;

public interface IDaoClient
{
	public Client creerClient(Client t);

	public Client mettreAjourClient(Client t);

	public Client rechercherParId(Client t);

	public List<Client> obtenirTousClient();
}
