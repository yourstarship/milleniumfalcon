package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoAdministrateur;
import gal.cor.persistence.entities.Administrateur;

import java.util.Collection;

public class DaoAdministrateurImpl extends DaoGenericImpl<Administrateur> implements IDaoAdministrateur {

	@Override
	public void creerAdministrateur(gal.cor.persistence.entities.Administrateur t) {
		this.creer(t);
	}

	@Override
	public void supprimerAdministrateur(Administrateur t) {
		this.supprimer(Administrateur.class, t.getId());
	}

	@Override
	public Administrateur mettreAjourAdministrateur(Administrateur t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Administrateur rechercherParId(Administrateur t) {
		return this.rechercherParId(Administrateur.class, t.getId());
	}

	@Override
	public Collection<Administrateur> obtenirTousAdministrateur() {
		return this.obtenirTous();
	}

}
