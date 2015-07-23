package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.AvoirClient;


public interface IDaoAvoirClient {
	void creerAvoirClient(AvoirClient t);
	void supprimerAvoirClient(AvoirClient t);
	AvoirClient mettreAjourAvoirClient(AvoirClient t);
	AvoirClient rechercherParId(AvoirClient t);

	//Requetes personnalis�es
	List<AvoirClient> rechercherParRequeteNommee(String requeteNommee);
	List<AvoirClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<AvoirClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<AvoirClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<AvoirClient> obtenirTousAvoirClient();
}
