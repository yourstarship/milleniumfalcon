package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.AvoirClient;


public interface IDaoAvoirClient {
	void creerAvoirClient(AvoirClient t);
	
	List<AvoirClient> RechercherAvoirParPersonne(Integer idPersonne );
	Collection<AvoirClient> obtenirTousAvoirClient();
}
