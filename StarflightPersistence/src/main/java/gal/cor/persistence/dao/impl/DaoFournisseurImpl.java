package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoFournisseur;
import gal.cor.persistence.entities.Fournisseur;

import java.util.Collection;

public class DaoFournisseurImpl extends DaoGenericImpl<Fournisseur> implements IDaoFournisseur {

	@Override
	public void creerFournisseur(Fournisseur t) {
		this.creer(t);
	}

	@Override
	public void supprimerFournisseur(Fournisseur t) {
		this.supprimer(Fournisseur.class, t.getId());
	}

	@Override
	public Fournisseur mettreAjourFournisseur(Fournisseur t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Fournisseur rechercherParId(Fournisseur t) {
		return this.rechercherParId(Fournisseur.class, t.getId());
	}

	@Override
	public Collection<Fournisseur> obtenirTousFournisseur() {
		return this.obtenirTous();
	}

}
