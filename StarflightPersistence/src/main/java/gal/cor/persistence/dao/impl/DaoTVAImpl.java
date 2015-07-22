package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoTVA;
import gal.cor.persistence.entities.TVA;

import java.util.Collection;

public class DaoTVAImpl extends DaoGenericImpl<TVA> implements IDaoTVA {

	@Override
	public void creerTVA(TVA t) {
		this.creer(t);
	}

	@Override
	public void supprimerTVA(TVA t) {
		this.supprimer(TVA.class, t.getId());
	}

	@Override
	public TVA mettreAjourTVA(TVA t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public TVA rechercherParId(TVA t) {
		return this.rechercherParId(TVA.class, t.getId());
	}

	@Override
	public Collection<TVA> obtenirTousTVA() {
		return this.obtenirTous();
	}

}
