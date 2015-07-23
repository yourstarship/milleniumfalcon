package gal.cor.persistence.dao.apis;

import java.util.List;


import gal.cor.persistence.entities.Produit;


public interface IDaoProduit {
	void creerProduit(Produit t);

	Produit mettreAjourProduit(Produit t);
	Produit rechercherParId(Produit t);
	List<Produit> rechercherParRequeteNommee(String requeteNommee);
	List<Produit> obtenirTousProduit();
	
}
