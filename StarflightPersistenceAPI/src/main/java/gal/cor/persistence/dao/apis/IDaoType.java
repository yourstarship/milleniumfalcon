package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Type;


public interface IDaoType {
	void creerType(Type t);
	void supprimerType(Type t);
	Type mettreAjourType(Type t);
	Type rechercherParId(Type t);

	//Requetes personnalis�es
	List<Type> rechercherParRequeteNommee(String requeteNommee);
	List<Type> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Type> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Type> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Type> obtenirTousType();
}
