package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoLignePieceFournisseur;
import gal.cor.persistence.entities.LignePieceFournisseur;

import java.util.Collection;

public class DaoLignePieceFournisseurImpl extends DaoGenericImpl<LignePieceFournisseur> implements IDaoLignePieceFournisseur {

	@Override
	public void creerLignePieceFournisseur(LignePieceFournisseur t) {
		this.creer(t);
	}

	@Override
	public void supprimerLignePieceFournisseur(LignePieceFournisseur t) {
		this.supprimer(LignePieceFournisseur.class, t.getId());
	}

	@Override
	public LignePieceFournisseur mettreAjourLignePieceFournisseur(LignePieceFournisseur t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public LignePieceFournisseur rechercherParId(LignePieceFournisseur t) {
		return this.rechercherParId(LignePieceFournisseur.class, t.getId());
	}

	@Override
	public Collection<LignePieceFournisseur> obtenirTousLignePieceFournisseur() {
		return this.obtenirTous();
	}

}
