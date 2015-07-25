package gal.cor.services.api;

import gal.cor.persistence.entities.Produit;

import java.util.List;
import java.util.Map;


public interface IProduitServices {
	
	void creerProduit(Produit t);

	Produit mettreAjourProduit(Produit t);
	Produit rechercherParId(Produit t);
	
	List<Produit> rechercherParCategorie(Integer idCategorie);
	List<Produit> obtenirTousProduitServices();
	List<Produit> rechercherProduitParCategorieEtType(Integer idCategorie, Integer idType);
	List<Produit> ListeDesTroisMeilleursPromo();
	
	/***** [ Test Méthode Louis ] *****/
	List<Produit> obtenirTousProduitParNom(String nom); 
	

}
