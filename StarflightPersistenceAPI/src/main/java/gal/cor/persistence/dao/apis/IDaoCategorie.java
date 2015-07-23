package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Categorie;


public interface IDaoCategorie  {
	void creerCategorie(Categorie t);
<<<<<<< HEAD
	void supprimerCategorie(Categorie t);
	Categorie mettreAjourCategorie(Categorie t);
	Categorie rechercherParId(Categorie t);

	//Requetes personnalis�es
	List<Categorie> rechercherParRequeteNommee(String requeteNommee);
	List<Categorie> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Categorie> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Categorie> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);
=======
>>>>>>> mf/master

	Collection<Categorie> obtenirTousCategorie();
}
