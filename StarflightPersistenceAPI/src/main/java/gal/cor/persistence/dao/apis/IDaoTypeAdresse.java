package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.TypeAdresse;


public interface IDaoTypeAdresse extends IDaoGeneric<TypeAdresse> {
	void creerTypeAdresse(TypeAdresse t);
	void supprimerTypeAdresse(TypeAdresse t);
	TypeAdresse mettreAjourTypeAdresse(TypeAdresse t);
	TypeAdresse rechercherParId(TypeAdresse t);

	//Requetes personnalisées
	List<TypeAdresse> rechercherParRequeteNommee(String requeteNommee);
	List<TypeAdresse> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<TypeAdresse> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<TypeAdresse> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<TypeAdresse> obtenirTousTypeAdresse();
}
