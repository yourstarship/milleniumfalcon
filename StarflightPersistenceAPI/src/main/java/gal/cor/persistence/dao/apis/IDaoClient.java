package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Client;


public interface IDaoClient{
	void creerClient(Client t);
	
	Client mettreAjourClient(Client t);
	Client rechercherParId(Client t);
	List<Client> obtenirTousClient();
}
