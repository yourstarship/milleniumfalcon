package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoFactureClient;
import gal.cor.persistence.entities.FactureClient;

import java.util.Collection;

public class DaoFactureClientImpl extends DaoGenericImpl<FactureClient> implements IDaoFactureClient {

	@Override
	public void creerFactureClient(FactureClient t) {
		this.creer(t);
	}

	@Override
	public void supprimerFactureClient(FactureClient t) {
		this.supprimer(FactureClient.class, t.getId());
	}

	@Override
	public FactureClient mettreAjourFactureClient(FactureClient t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public FactureClient rechercherParId(FactureClient t) {
		return this.rechercherParId(FactureClient.class, t.getId());
	}

	@Override
	public Collection<FactureClient> obtenirTousFactureClient() {
		return this.obtenirTous();
	}

}
