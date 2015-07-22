package gal.cor.services.api;

import gal.cor.persistence.entities.Produit;

import java.util.List;
import java.util.Map;


public interface IProduitServices {
	
	void creerProduit(Produit t);
	void supprimerProduit(Produit t);
	Produit mettreAjourProduit(Produit t);
	Produit rechercherParId(Produit t);

	//Requetes personnalis�es
	List<Produit> rechercherParRequeteNommee(String requeteNommee);
	List<Produit> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Produit> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Produit> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	List<Produit> obtenirTousProduitServices();

}
