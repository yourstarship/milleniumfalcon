package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoProduit;
import gal.cor.persistence.entities.Produit;

import java.util.Collection;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(IDaoProduit.class)
public class DaoProduitImpl extends DaoGenericImpl<Produit> implements IDaoProduit {

	@Override
	public void creerProduit(Produit t) {
		this.creer(t);
	}

	@Override
	public void supprimerProduit(Produit t) {
		this.supprimer(Produit.class, t.getId());
	}

	@Override
	public Produit mettreAjourProduit(Produit t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Produit rechercherParId(Produit t) {
		return this.rechercherParId(Produit.class, t.getId());
	}

	@Override
	public Collection<Produit> obtenirTousProduit() {
		return this.obtenirTous();
	}

}
