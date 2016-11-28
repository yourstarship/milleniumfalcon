package gal.cor.services.api;

import gal.cor.persistence.entities.Client;

import java.util.List;

public interface IClientService {

	void creerClient(Client t);
	void supprimerClient(Client t);
	Client mettreAjourClient(Client t);
	Client rechercherParClientId(Integer idClient);
	Client rechercherParNomMotDePasse(String nom, String motDePasse);
	List<Client> obtenirTousClient();
}
