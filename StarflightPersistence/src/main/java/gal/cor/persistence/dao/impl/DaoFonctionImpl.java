package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoFonction;
import gal.cor.persistence.entities.Fonction;

import java.util.Collection;

public class DaoFonctionImpl extends DaoGenericImpl<Fonction> implements IDaoFonction {

	@Override
	public void creerFonction(Fonction t) {
		this.creer(t);
	}

	@Override
	public void supprimerFonction(Fonction t) {
		this.supprimer(Fonction.class, t.getIdFonction());
	}

	@Override
	public Fonction mettreAjourFonction(Fonction t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Fonction rechercherParId(Fonction t) {
		return this.rechercherParId(Fonction.class, t.getIdFonction());
	}

	@Override
	public Collection<Fonction> obtenirTousFonction() {
		return this.obtenirTous();
	}

}
