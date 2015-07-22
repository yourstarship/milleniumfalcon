package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoFactureFournisseur;
import gal.cor.persistence.entities.FactureFournisseur;

import java.util.Collection;

public class DaoFactureFournisseurImpl extends DaoGenericImpl<FactureFournisseur> implements IDaoFactureFournisseur {

	@Override
	public void creerFactureFournisseur(FactureFournisseur t) {
		this.creer(t);
	}

	@Override
	public void supprimerFactureFournisseur(FactureFournisseur t) {
		this.supprimer(FactureFournisseur.class, t.getIdFF());
	}

	@Override
	public FactureFournisseur mettreAjourFactureFournisseur(FactureFournisseur t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public FactureFournisseur rechercherParId(FactureFournisseur t) {
		return this.rechercherParId(FactureFournisseur.class, t.getIdFF());
	}

	@Override
	public Collection<FactureFournisseur> obtenirTousFactureFournisseur() {
		return this.obtenirTous();
	}

}
