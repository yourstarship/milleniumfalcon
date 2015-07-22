package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.AvisProduit;


public interface IDaoAvisProduit extends IDaoGeneric<AvisProduit> {
	void creerAvisProduit(AvisProduit t);
	void supprimerAvisProduit(AvisProduit t);
	AvisProduit mettreAjourAvisProduit(AvisProduit t);
	AvisProduit rechercherParId(AvisProduit t);

	//Requetes personnalisées
	List<AvisProduit> rechercherParRequeteNommee(String requeteNommee);
	List<AvisProduit> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<AvisProduit> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<AvisProduit> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<AvisProduit> obtenirTousAvisProduit();
}
