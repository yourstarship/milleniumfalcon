package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Planete;


public interface IDaoPlanete  {
	void creerPlanete(Planete t);
	void supprimerPlanete(Planete t);
	Planete mettreAjourPlanete(Planete t);
	Planete rechercherParId(Planete t);

	//Requetes personnalis�es
	List<Planete> rechercherParRequeteNommee(String requeteNommee);
	List<Planete> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Planete> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Planete> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Planete> obtenirTousPlanete();
}
