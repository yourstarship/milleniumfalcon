package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Administrateur;


public interface IDaoAdministrateur extends IDaoGeneric<Administrateur> {
	void creerAdministrateur(Administrateur t);
	void supprimerAdministrateur(Administrateur t);
	Administrateur mettreAjourAdministrateur(Administrateur t);
	Administrateur rechercherParId(Administrateur t);

	//Requetes personnalisées
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee);
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Administrateur> obtenirTousAdministrateur();
}
