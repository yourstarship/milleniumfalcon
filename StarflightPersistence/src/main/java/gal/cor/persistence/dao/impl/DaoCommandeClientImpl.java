package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCommandeClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

@Remote
@Stateless
public class DaoCommandeClientImpl implements IDaoCommandeClient, Serializable
{
	@PersistenceContext(unitName = "YourStarshipPersistence")
	private EntityManager em;

	private List<LignePieceClient> lignesPanier;

	public double montantTotalHT(CommandeClient commandeClient)
	{
		/**
		 * TODO
		 */
		return 0d;
	}

	public double montantTotalTTC(CommandeClient commandeClient)
	{
		return this.montantTotalHT(commandeClient) * (1 + commandeClient.getTva().getTaux() / 100);
	}

	public void viderPanier()
	{
		lignesPanier.clear();
		/**
		 * TODO :Fil
		 */
		//persister les modifs
	}

	Logger logger = Logger.getLogger(getClass());

	@Override
	public CommandeClient creerCommandeClient(CommandeClient commandeClient)
	{
		//commandeClient.setClient(em.find(Client.class, commandeClient.getClient().getId()));
		em.persist(commandeClient);
		em.flush();
		return commandeClient;
	}

	@Override
	public void supprimerCommandeClient(CommandeClient t)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public CommandeClient mettreAjourCommandeClient(CommandeClient t)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandeClient rechercherParId(int id)
	{
		String request= "SELECT c FROM CommandeClient c INNER JOIN FETCH c.lignesPieceClient WHERE c.id = :param ";
		Query query = em.createQuery(request);
		query.setParameter("param", id);
		List<CommandeClient>liste = query.getResultList();
		CommandeClient commandeClient= new CommandeClient();
		if(!liste.isEmpty()){
			commandeClient = liste.get(0);	
		}
		
		return commandeClient;
	}

	@Override
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CommandeClient> obtenirTousCommandeClient()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
