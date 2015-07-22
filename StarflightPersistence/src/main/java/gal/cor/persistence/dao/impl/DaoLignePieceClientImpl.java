package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoLignePieceClient;
import gal.cor.persistence.entities.LignePieceClient;

import java.util.Collection;

public class DaoLignePieceClientImpl extends DaoGenericImpl<LignePieceClient> implements IDaoLignePieceClient {

	@Override
	public void creerLignePieceClient(LignePieceClient t) {
		this.creer(t);
	}

	@Override
	public void supprimerLignePieceClient(LignePieceClient t) {
		this.supprimer(LignePieceClient.class, t.getId());
	}

	@Override
	public LignePieceClient mettreAjourLignePieceClient(LignePieceClient t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public LignePieceClient rechercherParId(LignePieceClient t) {
		return this.rechercherParId(LignePieceClient.class, t.getId());
	}

	@Override
	public Collection<LignePieceClient> obtenirTousLignePieceClient() {
		return this.obtenirTous();
	}

}
