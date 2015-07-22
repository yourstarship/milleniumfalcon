package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoEmploye;
import gal.cor.persistence.entities.Employe;

import java.util.Collection;

public class DaoEmployeImpl extends DaoGenericImpl<Employe> implements IDaoEmploye {

	@Override
	public void creerEmploye(Employe t) {
		this.creer(t);
	}

	@Override
	public void supprimerEmploye(Employe t) {
		this.supprimer(Employe.class, t.getId());
	}

	@Override
	public Employe mettreAjourEmploye(Employe t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Employe rechercherParId(Employe t) {
		return this.rechercherParId(Employe.class, t.getId());
	}

	@Override
	public Collection<Employe> obtenirTousEmploye() {
		return this.obtenirTous();
	}

}
