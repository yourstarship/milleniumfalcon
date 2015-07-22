package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoSysteme;
import gal.cor.persistence.entities.Systeme;

import java.util.Collection;

public class DaoSystemeImpl extends DaoGenericImpl<Systeme> implements IDaoSysteme {

	@Override
	public void creerSysteme(Systeme t) {
		this.creer(t);
	}

	@Override
	public void supprimerSysteme(Systeme t) {
		this.supprimer(Systeme.class, t.getId());
	}

	@Override
	public Systeme mettreAjourSysteme(Systeme t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Systeme rechercherParId(Systeme t) {
		return this.rechercherParId(Systeme.class, t.getId());
	}

	@Override
	public Collection<Systeme> obtenirTousSysteme() {
		return this.obtenirTous();
	}

}
