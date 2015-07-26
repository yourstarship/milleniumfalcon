package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.TVA;

public interface IDaoCommandeClient
{
	public CommandeClient creerCommandeClient(CommandeClient t);

	public void supprimerCommandeClient(CommandeClient t);

	public CommandeClient mettreAjourCommandeClient(CommandeClient t);

	public CommandeClient rechercherParId(int id);

	public Collection<CommandeClient> obtenirTousCommandeClient();

	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(int id);

	public TVA tauxTVACommande();

	//Requetes personnalis�es
	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee);

	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres, int nbreMaxElements);

	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres);

	public List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	List<CommandeClient> recupeCommandesParClient(Integer idClient);
}
