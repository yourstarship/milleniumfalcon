package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.FactureClient;


public interface IDaoFactureClient {
	void creerFactureClient(FactureClient t);
	void supprimerFactureClient(FactureClient t);
	FactureClient mettreAjourFactureClient(FactureClient t);
	FactureClient rechercherParId(FactureClient t);

	//Requetes personnalis�ees
	List<FactureClient> rechercherParRequeteNommee(String requeteNommee);
	List<FactureClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<FactureClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<FactureClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<FactureClient> obtenirTousFactureClient();
}
