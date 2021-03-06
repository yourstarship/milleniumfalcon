package gal.cor.persistence.dao.impl;

import gal.cor.persistence.constantes.ConstantLoader;
import gal.cor.persistence.dao.apis.IDaoCommandeClient;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.persistence.entities.TVA;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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

	Logger logger = Logger.getLogger(getClass());

	@Override
	public CommandeClient creerCommandeClient(CommandeClient commandeClient)
	{
		// commandeClient.setClient(em.find(Client.class,
		// commandeClient.getClient().getId()));
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
		String request = "SELECT c FROM CommandeClient c INNER JOIN FETCH c.lignesPieceClient WHERE c.id = :param ";
		Query query = em.createQuery(request);
		query.setParameter("param", id);
		List<CommandeClient> liste = query.getResultList();
		CommandeClient commandeClient = new CommandeClient();
		if (!liste.isEmpty())
		{
			commandeClient = liste.get(0);
		}
		return commandeClient;
	}

	@Override
	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(int id)
	{
		CommandeClient resultat = null;
		String rawQuery = "from CommandeClient c left join fetch c.lignesPieceClient l left join fetch l.produit where c.id = :id";
		Query query = em.createQuery(rawQuery);
		query.setParameter("id", id);
		List<CommandeClient> resultats = query.getResultList();
		if (resultats.size() > 0)
		{
			resultat = resultats.get(0);
		}
		return resultat;
	}

	@Override
	public TVA tauxTVACommande()
	{
		TVA tva = null;
		String nom_minuscules_taux_tva_commandes = ConstantLoader.load("nom_minuscules_taux_tva_commandes", "TvaCommandes.properties");
		String rawQuery = "from TVA tva where lower(tva.nom)=:tvaName";
		Query query = em.createQuery(rawQuery);
		query.setParameter("tvaName", nom_minuscules_taux_tva_commandes);
		List<TVA> tvas = query.getResultList();
		if (tvas.size() > 0)
		{
			tva = tvas.get(0);
		}
		return tva;
	}

	@Override
	public List<CommandeClient> recupeCommandesParClient(Integer idClient)
	{
		String request = "SELECT c FROM CommandeClient c WHERE c.client.id = :param";
		Query query = em.createQuery(request);
		query.setParameter("param", idClient);
		List<CommandeClient> liste = new ArrayList<CommandeClient>();
		liste = query.getResultList();
		return liste;
	}

	@Override
	public double prixVenteHTParIdProduit(int id)
	{
		double resultat = 0;
		String rawQuery = "select p from Produit p where id=:id";
		Query query = em.createQuery(rawQuery);
		query.setParameter("id", id);
		List<Produit> produits = query.getResultList();
		if (!produits.isEmpty())
		{
			resultat = produits.get(0).getPrixVenteHT();
		}
		return resultat;
	}
}
