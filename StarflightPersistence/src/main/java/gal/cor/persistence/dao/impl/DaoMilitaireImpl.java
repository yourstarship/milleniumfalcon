package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoMilitaire;
import gal.cor.persistence.entities.Militaire;

import java.util.Collection;

public class DaoMilitaireImpl extends DaoGenericImpl<Militaire> implements IDaoMilitaire {

	@Override
	public void creerMilitaire(Militaire t) {
		this.creer(t);
	}

	@Override
	public void supprimerMilitaire(Militaire t) {
		this.supprimer(Militaire.class, t.getId());
	}

	@Override
	public Militaire mettreAjourMilitaire(Militaire t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Militaire rechercherParId(Militaire t) {
		return this.rechercherParId(Militaire.class, t.getId());
	}

	@Override
	public Collection<Militaire> obtenirTousMilitaire() {
		return this.obtenirTous();
	}
}
