package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoPromotion;
import gal.cor.persistence.entities.Promotion;

import java.util.Collection;

public class DaoPromotionImpl extends DaoGenericImpl<Promotion> implements IDaoPromotion {

	@Override
	public void creerPromotion(Promotion t) {
		this.creer(t);
	}

	@Override
	public void supprimerPromotion(Promotion t) {
		this.supprimer(Promotion.class, t.getId());
	}

	@Override
	public Promotion mettreAjourPromotion(Promotion t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Promotion rechercherParId(Promotion t) {
		return this.rechercherParId(Promotion.class, t.getId());
	}

	@Override
	public Collection<Promotion> obtenirTousPromotion() {
		return this.obtenirTous();
	}

}
