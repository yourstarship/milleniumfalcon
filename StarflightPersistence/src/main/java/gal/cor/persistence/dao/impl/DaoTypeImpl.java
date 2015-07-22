package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoType;
import gal.cor.persistence.entities.Type;

import java.util.Collection;

public class DaoTypeImpl extends DaoGenericImpl<Type> implements IDaoType {

	@Override
	public void creerType(Type t) {
		this.creer(t);
	}

	@Override
	public void supprimerType(Type t) {
		this.supprimer(Type.class, t.getId());
	}

	@Override
	public Type mettreAjourType(Type t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Type rechercherParId(Type t) {
		return this.rechercherParId(Type.class, t.getId());
	}

	@Override
	public Collection<Type> obtenirTousType() {
		return this.obtenirTous();
	}

}
