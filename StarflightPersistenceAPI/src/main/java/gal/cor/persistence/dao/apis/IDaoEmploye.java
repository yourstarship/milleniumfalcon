package gal.cor.persistence.dao.apis;

import gal.cor.persistence.entities.Employe;

import java.util.Collection;
import java.util.List;
import java.util.Map;


public interface IDaoEmploye extends IDaoGeneric<Employe> {
	void creerEmploye(Employe t);
	void supprimerEmploye(Employe t);
	Employe mettreAjourEmploye(Employe t);
	Employe rechercherParId(Employe t);

	//Requetes personnalis�es
	List<Employe> rechercherParRequeteNommee(String requeteNommee);
	List<Employe> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Employe> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Employe> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Employe> obtenirTousEmploye();
}
