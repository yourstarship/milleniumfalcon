package gal.cor.services.impl;

import java.util.Collection;
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
	
	/***** [ Procédures ] *****/
	
	@Override
	public void creerProduit(Produit t) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void supprimerProduit(Produit t) {
		// TODO Auto-generated method stub
		
	}

	/***** [ Fonctions ] *****/
	
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
	public List<Produit> rechercherParRequeteNommee(String requeteNommee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee,
			Map<String, Object> parametres, int nbreMaxElements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee,
			Map<String, Object> parametres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> rechercherParRequeteNommee(String requeteNommee,
			int nbreMaxElements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> obtenirTousProduitServices() {
		List<Produit> maListe = (List<Produit>) proxyProduit.obtenirTousProduit(); 
		return maListe;
	}

}
