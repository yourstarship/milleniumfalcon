package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoTypeAdresse;
import gal.cor.persistence.entities.TypeAdresse;

import java.util.Collection;

public class DaoTypeAdresseImpl extends DaoGenericImpl<TypeAdresse> implements IDaoTypeAdresse {

	@Override
	public void creerTypeAdresse(TypeAdresse t) {
		this.creer(t);
	}

	@Override
	public void supprimerTypeAdresse(TypeAdresse t) {
		this.supprimer(TypeAdresse.class, t.getId());
	}

	@Override
	public TypeAdresse mettreAjourTypeAdresse(TypeAdresse t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public TypeAdresse rechercherParId(TypeAdresse t) {
		return this.rechercherParId(TypeAdresse.class, t.getId());
	}

	@Override
	public Collection<TypeAdresse> obtenirTousTypeAdresse() {
		return this.obtenirTous();
	}

}
