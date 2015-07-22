package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCivilite;
import gal.cor.persistence.entities.Civilite;

import java.util.Collection;

public class DaoCiviliteImpl extends DaoGenericImpl<Civilite> implements IDaoCivilite {

	@Override
	public void creerCivilite(Civilite t) {
		this.creer(t);
	}

	@Override
	public void supprimerCivilite(Civilite t) {
		this.supprimer(Civilite.class, t.getId());
	}

	@Override
	public Civilite mettreAjourCivilite(Civilite t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Civilite rechercherParId(Civilite t) {
		return this.rechercherParId(Civilite.class, t.getId());
	}

	@Override
	public Collection<Civilite> obtenirTousCivilite() {
		return this.obtenirTous();
	}

}
