package gal.cor.services.impl;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import gal.cor.persistence.dao.apis.IDaoProduit;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.IProduitServices;

@Stateless
@Remote(IProduitServices.class)
public class ProduitServicesImpl implements IProduitServices {
	
	@EJB
	private IDaoProduit proxyProduit;

	@Override
	public void creerProduit(Produit t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit mettreAjourProduit(Produit t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit rechercherParId(Produit t) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Produit> obtenirTousProduitServices() {
		
		return proxyProduit.obtenirTousProduit();
	}

	@Override
	public List<Produit> rechercherProduitParCategorieEtType(
			Integer idCategorie, Integer idType) {
		// TODO Auto-generated method stub
		return proxyProduit.rechercherProduitParCategorieEtType(idCategorie, idType);
	}

	@Override
	public List<Produit> rechercherParCategorie(Integer idCategorie) {
		// TODO Auto-generated method stub
		return proxyProduit.rechercherParCategorie(idCategorie);
	}

	@Override
	public List<Produit> ListeDesTroisMeilleursPromo() {
		
		return proxyProduit.ListeDesTroisMeilleursPromo();
	}

	@Override
	public List<Produit> obtenirTousProduitParNom(String nom) {
		// TODO Auto-generated method stub
		return proxyProduit.obtenirTousProduitParNom(nom);
	}

	
	
	

}
