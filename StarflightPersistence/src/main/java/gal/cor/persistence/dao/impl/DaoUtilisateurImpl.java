package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoUtilisateur;
import gal.cor.persistence.entities.Utilisateur;

import java.util.Collection;

public class DaoUtilisateurImpl extends DaoGenericImpl<Utilisateur> implements IDaoUtilisateur {

	@Override
	public void creerUtilisateur(Utilisateur t) {
		this.creer(t);
	}

	@Override
	public void supprimerUtilisateur(Utilisateur t) {
		this.supprimer(Utilisateur.class, t.getId());
	}

	@Override
	public Utilisateur mettreAjourUtilisateur(Utilisateur t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Utilisateur rechercherParId(Utilisateur t) {
		return this.rechercherParId(Utilisateur.class, t.getId());
	}

	@Override
	public Collection<Utilisateur> obtenirTousUtilisateur() {
		return this.obtenirTous();
	}

}
