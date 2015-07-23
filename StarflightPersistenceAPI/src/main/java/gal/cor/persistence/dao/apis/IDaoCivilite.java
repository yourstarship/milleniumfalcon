package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Civilite;


public interface IDaoCivilite  {
	void creerCivilite(Civilite t);
	void supprimerCivilite(Civilite t);
	Civilite mettreAjourCivilite(Civilite t);
	Civilite rechercherParId(Civilite t);

	//Requetes personnalisées
	List<Civilite> rechercherParRequeteNommee(String requeteNommee);
	List<Civilite> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Civilite> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Civilite> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Civilite> obtenirTousCivilite();
}
