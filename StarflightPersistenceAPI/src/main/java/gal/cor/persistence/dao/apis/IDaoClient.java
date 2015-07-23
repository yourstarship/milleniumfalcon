package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Client;

<<<<<<< HEAD
public interface IDaoClient 
{
	void creerClient(Client t);

	void supprimerClient(Client t);

=======

public interface IDaoClient{
	void creerClient(Client t);
	
>>>>>>> mf/master
	Client mettreAjourClient(Client t);

	Client rechercherParId(Client t);
<<<<<<< HEAD

	//Requetes personnalisées
	List<Client> rechercherParRequeteNommee(String requeteNommee);

	List<Client> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements);

	List<Client> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres);

	List<Client> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Client> obtenirTousClient();

=======
	List<Client> obtenirTousClient();
>>>>>>> mf/master
}
