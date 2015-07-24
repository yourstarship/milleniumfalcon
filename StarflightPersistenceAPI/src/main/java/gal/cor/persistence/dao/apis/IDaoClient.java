package gal.cor.persistence.dao.apis;

import gal.cor.persistence.entities.Client;

import java.util.List;

public interface IDaoClient
{
	public Client creerClient(Client t);

	public Client mettreAjourClient(Client t);

	public void supprimerClient(Client t);

	public Client rechercherParId(Client t);

	Client rechercherParNomMotDePasse(String nom, String motDePasse);

	public List<Client> obtenirTousClient();
}
