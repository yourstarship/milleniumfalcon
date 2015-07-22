package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Produit;


public interface IDaoProduit extends IDaoGeneric<Produit> {
	void creerProduit(Produit t);
	void supprimerProduit(Produit t);
	Produit mettreAjourProduit(Produit t);
	Produit rechercherParId(Produit t);

	//Requetes personnalis�es
	List<Produit> rechercherParRequeteNommee(String requeteNommee);
	List<Produit> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Produit> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Produit> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Produit> obtenirTousProduit();
}
