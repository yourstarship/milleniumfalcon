package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Produit;


public interface IDaoProduit {
	void creerProduit(Produit t);

	Produit mettreAjourProduit(Produit t);
	Produit rechercherParId(Produit t);
	List<Produit> rechercherParCategorie(Integer idCategorie);
	List<Produit> obtenirTousProduit();
	List<Produit> rechercherProduitParCategorieEtType(Integer idCategorie, Integer idType);
	
}
