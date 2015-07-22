package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;

import java.util.Collection;

public class DaoClientImpl extends DaoGenericImpl<Client> implements IDaoClient {

	@Override
	public void creerClient(gal.cor.persistence.entities.Client t) {
		this.creer(t);
	}

	@Override
	public void supprimerClient(Client t) {
		this.supprimer(Client.class, t.getId());
	}

	@Override
	public Client mettreAjourClient(Client t) {
		
		return this.mettreAjour(t);
	}

	@Override
	public Client rechercherParId(Client t) {
		return this.rechercherParId(Client.class, t.getId());
	}

	@Override
	public Collection<Client> obtenirTousClient() {
		return this.obtenirTous();
	}

}
