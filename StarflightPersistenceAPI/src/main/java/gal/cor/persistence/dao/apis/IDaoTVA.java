package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.TVA;


public interface IDaoTVA extends IDaoGeneric<TVA> {
	void creerTVA(TVA t);
	void supprimerTVA(TVA t);
	TVA mettreAjourTVA(TVA t);
	TVA rechercherParId(TVA t);

	//Requetes personnalis�es
	List<TVA> rechercherParRequeteNommee(String requeteNommee);
	List<TVA> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<TVA> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<TVA> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<TVA> obtenirTousTVA();
}
