package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Militaire;


<<<<<<< HEAD
public interface IDaoMilitaire  {
=======
public interface IDaoMilitaire{
>>>>>>> mf/master
	void creerMilitaire(Militaire t);
	void supprimerMilitaire(Militaire t);
	Militaire mettreAjourMilitaire(Militaire t);
	Militaire rechercherParId(Militaire t);

	//Requetes personnalis�es
	List<Militaire> rechercherParRequeteNommee(String requeteNommee);
	List<Militaire> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Militaire> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Militaire> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Militaire> obtenirTousMilitaire();
}
