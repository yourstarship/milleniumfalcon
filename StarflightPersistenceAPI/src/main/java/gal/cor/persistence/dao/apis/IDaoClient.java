package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Client;


public interface IDaoClient extends IDaoGeneric<Client> {
	void creerClient(Client t);
	void supprimerClient(Client t);
	Client mettreAjourClient(Client t);
	Client rechercherParId(Client t);

	//Requetes personnalisées
	List<Client> rechercherParRequeteNommee(String requeteNommee);
	List<Client> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Client> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Client> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Client> obtenirTousClient();
}
