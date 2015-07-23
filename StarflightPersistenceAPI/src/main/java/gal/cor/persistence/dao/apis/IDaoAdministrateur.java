package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Administrateur;


<<<<<<< HEAD
public interface IDaoAdministrateur {
=======
public interface IDaoAdministrateur  {
>>>>>>> mf/master
	void creerAdministrateur(Administrateur t);
	Administrateur mettreAjourAdministrateur(Administrateur t);
	Administrateur rechercherParId(Administrateur t);

<<<<<<< HEAD
	//Requetes personnalis�es
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee);
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Administrateur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);
=======
>>>>>>> mf/master

}
