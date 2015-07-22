package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.FactureFournisseur;


public interface IDaoFactureFournisseur extends IDaoGeneric<FactureFournisseur> {
	void creerFactureFournisseur(FactureFournisseur t);
	void supprimerFactureFournisseur(FactureFournisseur t);
	FactureFournisseur mettreAjourFactureFournisseur(FactureFournisseur t);
	FactureFournisseur rechercherParId(FactureFournisseur t);

	//Requetes personnalisées
	List<FactureFournisseur> rechercherParRequeteNommee(String requeteNommee);
	List<FactureFournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<FactureFournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<FactureFournisseur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<FactureFournisseur> obtenirTousFactureFournisseur();
}
