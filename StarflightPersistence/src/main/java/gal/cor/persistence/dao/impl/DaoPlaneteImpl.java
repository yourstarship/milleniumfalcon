package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoPlanete;
import gal.cor.persistence.entities.Planete;

import java.util.Collection;

public class DaoPlaneteImpl extends DaoGenericImpl<Planete> implements IDaoPlanete {

	@Override
	public void creerPlanete(Planete t) {
		this.creer(t);
	}

	@Override
	public void supprimerPlanete(Planete t) {
		this.supprimer(Planete.class, t.getId());
	}

	@Override
	public Planete mettreAjourPlanete(Planete t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Planete rechercherParId(Planete t) {
		return this.rechercherParId(Planete.class, t.getId());
	}

	@Override
	public Collection<Planete> obtenirTousPlanete() {
		return this.obtenirTous();
	}

}
