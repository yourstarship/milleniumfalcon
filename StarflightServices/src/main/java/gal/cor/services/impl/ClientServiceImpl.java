package gal.cor.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;
import gal.cor.services.api.IClientService;

@Stateless
@Remote (IClientService.class)
public class ClientServiceImpl implements IClientService{
	
	Logger log = Logger.getLogger(ClientServiceImpl.class);
	
	@EJB
	private IDaoClient proxyClient;
	
	@Override
	public void creerClient(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerClient(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client mettreAjourClient(Client t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client rechercherParClientId(Integer idClient) {
		
		return proxyClient.rechercherClientParId(idClient);
	}

	@Override
	public Client rechercherParNomMotDePasse(String nom, String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> obtenirTousClient() {
		// TODO Auto-generated method stub
		return null;
	}

}
