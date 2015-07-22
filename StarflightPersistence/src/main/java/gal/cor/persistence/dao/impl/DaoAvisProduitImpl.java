package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoAvisProduit;
import gal.cor.persistence.entities.AvisProduit;

import java.util.Collection;

public class DaoAvisProduitImpl extends DaoGenericImpl<AvisProduit> implements IDaoAvisProduit {

	@Override
	public void creerAvisProduit(AvisProduit t) {
		this.creer(t);
	}

	@Override
	public void supprimerAvisProduit(AvisProduit t) {
		this.supprimer(AvisProduit.class, t.getId());
	}

	@Override
	public AvisProduit mettreAjourAvisProduit(AvisProduit t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public AvisProduit rechercherParId(AvisProduit t) {
		return this.rechercherParId(AvisProduit.class, t.getId());
	}

	@Override
	public Collection<AvisProduit> obtenirTousAvisProduit() {
		return this.obtenirTous();
	}

}
