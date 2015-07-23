package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoCommandeClient;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import java.util.Collection;
import java.util.List;
<<<<<<< HEAD
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DaoCommandeClientImpl implements IDaoCommandeClient
{
	@PersistenceContext(unitName="YourStarshipPersistence")
	EntityManager em;
	
	private List<LignePieceClient> lignesPanier;

	public double montantTotalHT(CommandeClient commandeClient)
	{
		/**
		 * TODO
		 * 
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
		//TODO Fil
		//persister les modifs
	}

	@Override
	public void creerCommandeClient(CommandeClient commandeClient)
	{
		em.persist(commandeClient);
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
	public CommandeClient rechercherParId(CommandeClient t)
	{
		// TODO Auto-generated method stub
		return null;
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
=======

public class DaoCommandeClientImpl  implements IDaoCommandeClient {

	@Override
	public void creerCommandeClient(CommandeClient t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommandeClient rechercherParId(CommandeClient t) {
>>>>>>> mf/master
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public Collection<CommandeClient> obtenirTousCommandeClient()
	{
=======
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee) {
>>>>>>> mf/master
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements)
	{
=======
	public List<CommandeClient> obtenirTousCommandeClient() {
>>>>>>> mf/master
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
	@Override
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres)
	{
		// TODO Auto-generated method stub
		return null;
	}
=======
	
>>>>>>> mf/master

}
