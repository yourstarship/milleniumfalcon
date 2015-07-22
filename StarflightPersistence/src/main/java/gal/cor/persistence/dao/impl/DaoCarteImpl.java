package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCarte;
import gal.cor.persistence.entities.Carte;

import java.util.Collection;

public class DaoCarteImpl extends DaoGenericImpl<Carte> implements IDaoCarte {

	@Override
	public void creerCarte(Carte t) {
		this.creer(t);
	}

	@Override
	public void supprimerCarte(Carte t) {
		this.supprimer(Carte.class, t.getId());
	}

	@Override
	public Carte mettreAjourCarte(Carte t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Carte rechercherParId(Carte t) {
		return this.rechercherParId(Carte.class, t.getId());
	}

	@Override
	public Collection<Carte> obtenirTousCarte() {
		return this.obtenirTous();
	}

}
