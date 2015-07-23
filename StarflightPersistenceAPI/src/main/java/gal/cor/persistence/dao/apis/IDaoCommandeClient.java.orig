package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.CommandeClient;


public interface IDaoCommandeClient {
	public void creerCommandeClient(CommandeClient t);
	void supprimerCommandeClient(CommandeClient t);
	CommandeClient mettreAjourCommandeClient(CommandeClient t);
	CommandeClient rechercherParId(CommandeClient t);

	//Requetes personnalis�es
	List<CommandeClient> rechercherParRequeteNommee(String requeteNommee);
	List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<CommandeClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<CommandeClient> obtenirTousCommandeClient();
}
