package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.AvisProduit;


public interface IDaoAvisProduit {
	void creerAvisProduit(AvisProduit t);
	
	List<AvisProduit> rechercherParRequeteNommee(Integer IdPersonne);


	Collection<AvisProduit> obtenirTousAvisProduit();
}
