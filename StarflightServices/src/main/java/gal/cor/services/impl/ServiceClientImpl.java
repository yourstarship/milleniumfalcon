package gal.cor.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import gal.cor.persistence.dao.apis.IDaoClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.IServiceClient;

@Stateless
@Remote
public class ServiceClientImpl implements IServiceClient
{
	private Logger log = Logger.getLogger(this.getClass());
	@EJB
	//injection de dependance
	private IDaoClient daoClient;

	@Override
	public List<Client> listerClients() throws Exception
	{
		return daoClient.obtenirTousClient();
	}

	@Override
	public Client clientExiste(String nom, String motDePasse)
	{
		log.info(nom+ " "+motDePasse);
		return daoClient.rechercherParIdentifiantMotDePasse(nom, motDePasse);
	}

	@Override
	public Client clientParId(int id)
	{
		return daoClient.rechercherClientParId(id);
	}

	@Override
	public Client creer(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client clientParIdAvecSesCommandes(int id)
	{
		return daoClient.clientParIdClientAvecSesCommandes(id);
	}

}
