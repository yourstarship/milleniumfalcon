package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoTypeCarte;
import gal.cor.persistence.entities.TypeCarte;

import java.util.Collection;

public class DaoTypeCarteImpl extends DaoGenericImpl<TypeCarte> implements IDaoTypeCarte {

	@Override
	public void creerTypeCarte(TypeCarte t) {
		this.creer(t);
	}

	@Override
	public void supprimerTypeCarte(TypeCarte t) {
		this.supprimer(TypeCarte.class, t.getId());
	}

	@Override
	public TypeCarte mettreAjourTypeCarte(TypeCarte t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public TypeCarte rechercherParId(TypeCarte t) {
		return this.rechercherParId(TypeCarte.class, t.getId());
	}

	@Override
	public Collection<TypeCarte> obtenirTousTypeCarte() {
		return this.obtenirTous();
	}

}
