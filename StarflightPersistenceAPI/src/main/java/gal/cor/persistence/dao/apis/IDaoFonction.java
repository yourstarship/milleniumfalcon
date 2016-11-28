package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Fonction;


public interface IDaoFonction  {
	void creerFonction(Fonction t);
	void supprimerFonction(Fonction t);
	Fonction mettreAjourFonction(Fonction t);
	Fonction rechercherParId(Fonction t);

	//Requetes personnalis�es
	List<Fonction> rechercherParRequeteNommee(String requeteNommee);
	List<Fonction> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Fonction> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Fonction> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Fonction> obtenirTousFonction();
}
