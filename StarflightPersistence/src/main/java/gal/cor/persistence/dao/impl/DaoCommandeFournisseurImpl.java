package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCommandeFournisseur;
import gal.cor.persistence.entities.CommandeFournisseur;

import java.util.Collection;

public class DaoCommandeFournisseurImpl extends DaoGenericImpl<CommandeFournisseur> implements IDaoCommandeFournisseur {

	@Override
	public void creerCommandeFournisseur(CommandeFournisseur t) {
		this.creer(t);
	}

	@Override
	public void supprimerCommandeFournisseur(CommandeFournisseur t) {
		this.supprimer(CommandeFournisseur.class, t.getId());
	}

	@Override
	public CommandeFournisseur mettreAjourCommandeFournisseur(CommandeFournisseur t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public CommandeFournisseur rechercherParId(CommandeFournisseur t) {
		return this.rechercherParId(CommandeFournisseur.class, t.getId());
	}

	@Override
	public Collection<CommandeFournisseur> obtenirTousCommandeFournisseur() {
		return this.obtenirTous();
	}

}
