package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoPersonne;
import gal.cor.persistence.entities.Personne;

import java.util.Collection;

public class DaoPersonneImpl extends DaoGenericImpl<Personne> implements IDaoPersonne {

	@Override
	public void creerPersonne(Personne t) {
		this.creer(t);
	}

	@Override
	public void supprimerPersonne(Personne t) {
		this.supprimer(Personne.class, t.getId());
	}

	@Override
	public Personne mettreAjourPersonne(Personne t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Personne rechercherParId(Personne t) {
		return this.rechercherParId(Personne.class, t.getId());
	}

	@Override
	public Collection<Personne> obtenirTousPersonne() {
		return this.obtenirTous();
	}

}
