package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoAdresse;
import gal.cor.persistence.entities.Adresse;

import java.util.Collection;

public class DaoAdresseImpl extends DaoGenericImpl<Adresse> implements IDaoAdresse {

	@Override
	public void creerAdresse(Adresse t) {
		this.creer(t);
	}

	@Override
	public void supprimerAdresse(Adresse t) {
		this.supprimer(Adresse.class, t.getId());
	}

	@Override
	public Adresse mettreAjourAdresse(Adresse t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Adresse rechercherParId(Adresse t) {
		return this.rechercherParId(Adresse.class, t.getId());
	}

	@Override
	public Collection<Adresse> obtenirTousAdresse() {
		return this.obtenirTous();
	}

}
