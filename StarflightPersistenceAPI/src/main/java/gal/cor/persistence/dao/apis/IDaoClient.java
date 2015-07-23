package gal.cor.persistence.dao.apis;

import java.util.List;

import gal.cor.persistence.entities.Client;

public interface IDaoClient {
	
	void creerClient(Client t);
	void supprimerClient(Client t);
	Client mettreAjourClient(Client t);
	Client rechercherParId(Client t);
	Client rechercherParNomMotDePasse(String nom, String motDePasse);
	List<Client> obtenirTousClient();
}
