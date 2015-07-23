package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.TVA;


<<<<<<< HEAD
public interface IDaoTVA {
=======
public interface IDaoTVA  {
>>>>>>> mf/master
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
