package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.LignePieceFournisseur;


<<<<<<< HEAD
public interface IDaoLignePieceFournisseur {
=======
public interface IDaoLignePieceFournisseur  {
>>>>>>> mf/master
	void creerLignePieceFournisseur(LignePieceFournisseur t);
	void supprimerLignePieceFournisseur(LignePieceFournisseur t);
	LignePieceFournisseur mettreAjourLignePieceFournisseur(LignePieceFournisseur t);
	LignePieceFournisseur rechercherParId(LignePieceFournisseur t);

	//Requetes personnalis�es
	List<LignePieceFournisseur> rechercherParRequeteNommee(String requeteNommee);
	List<LignePieceFournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<LignePieceFournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<LignePieceFournisseur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<LignePieceFournisseur> obtenirTousLignePieceFournisseur();
}
