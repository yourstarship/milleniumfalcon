package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoAvoirClient;
import gal.cor.persistence.entities.AvoirClient;

import java.util.Collection;

public class DaoAvoirClientImpl extends DaoGenericImpl<AvoirClient> implements IDaoAvoirClient {

	@Override
	public void creerAvoirClient(AvoirClient t) {
		this.creer(t);
	}

	@Override
	public void supprimerAvoirClient(AvoirClient t) {
		this.supprimer(AvoirClient.class, t.getId());
	}

	@Override
	public AvoirClient mettreAjourAvoirClient(AvoirClient t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public AvoirClient rechercherParId(AvoirClient t) {
		return this.rechercherParId(AvoirClient.class, t.getId());
	}

	@Override
	public Collection<AvoirClient> obtenirTousAvoirClient() {
		return this.obtenirTous();
	}

}
