package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.CommandeClient;


public interface IDaoCommandeClient {
<<<<<<< HEAD
	public void creerCommandeClient(CommandeClient t);
	void supprimerCommandeClient(CommandeClient t);
	CommandeClient mettreAjourCommandeClient(CommandeClient t);
	CommandeClient rechercherParId(CommandeClient t);

	//Requetes personnalis�es
=======
	
	void creerCommandeClient(CommandeClient t);
	
	CommandeClient rechercherParId(CommandeClient t);
	
>>>>>>> mf/master
	List<CommandeClient> rechercherParRequeteNommee(String requeteNommee);


	List<CommandeClient> obtenirTousCommandeClient();
}
