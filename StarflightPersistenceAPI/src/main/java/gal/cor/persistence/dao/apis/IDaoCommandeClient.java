package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.CommandeClient;


public interface IDaoCommandeClient {
	
	void creerCommandeClient(CommandeClient t);
	
	CommandeClient rechercherParId(CommandeClient t);
	
	List<CommandeClient> rechercherParRequeteNommee(String requeteNommee);


	List<CommandeClient> obtenirTousCommandeClient();
}
