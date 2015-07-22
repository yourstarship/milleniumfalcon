package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCommandeClient;
import gal.cor.persistence.entities.CommandeClient;

import java.util.Collection;

public class DaoCommandeClientImpl extends DaoGenericImpl<CommandeClient> implements IDaoCommandeClient {

	@Override
	public void creerCommandeClient(CommandeClient t) {
		this.creer(t);
	}

	@Override
	public void supprimerCommandeClient(CommandeClient t) {
		this.supprimer(CommandeClient.class, t.getId());
	}

	@Override
	public CommandeClient mettreAjourCommandeClient(CommandeClient t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public CommandeClient rechercherParId(CommandeClient t) {
		return this.rechercherParId(CommandeClient.class, t.getId());
	}

	@Override
	public Collection<CommandeClient> obtenirTousCommandeClient() {
		return this.obtenirTous();
	}

}
