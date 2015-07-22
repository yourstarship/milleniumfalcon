package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCategorie;
import gal.cor.persistence.entities.Categorie;

import java.util.Collection;

public class DaoCategorieImpl extends DaoGenericImpl<Categorie> implements IDaoCategorie {

	@Override
	public void creerCategorie(Categorie t) {
		this.creer(t);
	}

	@Override
	public void supprimerCategorie(Categorie t) {
		this.supprimer(Categorie.class, t.getId());
	}

	@Override
	public Categorie mettreAjourCategorie(Categorie t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Categorie rechercherParId(Categorie t) {
		return this.rechercherParId(Categorie.class, t.getId());
	}

	@Override
	public Collection<Categorie> obtenirTousCategorie() {
		return this.obtenirTous();
	}

}
