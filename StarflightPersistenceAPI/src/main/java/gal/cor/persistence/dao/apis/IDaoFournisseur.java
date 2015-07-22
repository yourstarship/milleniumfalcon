package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Fournisseur;


public interface IDaoFournisseur extends IDaoGeneric<Fournisseur> {
	void creerFournisseur(Fournisseur t);
	void supprimerFournisseur(Fournisseur t);
	Fournisseur mettreAjourFournisseur(Fournisseur t);
	Fournisseur rechercherParId(Fournisseur t);

	//Requetes personnaliséés
	List<Fournisseur> rechercherParRequeteNommee(String requeteNommee);
	List<Fournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Fournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Fournisseur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Fournisseur> obtenirTousFournisseur();
}
