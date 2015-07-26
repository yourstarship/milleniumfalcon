package gal.cor.persistence.dao.apis;

import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.TVA;

import java.util.List;

public interface IDaoCommandeClient {
	public CommandeClient creerCommandeClient(CommandeClient t);

	public void supprimerCommandeClient(CommandeClient t);

	public CommandeClient mettreAjourCommandeClient(CommandeClient t);

	public CommandeClient rechercherParId(int id);

	public CommandeClient rechercherCommandeParIdAvecSesLignesEtSesProduits(
			int id);

	public TVA tauxTVACommande();

	List<CommandeClient> recupeCommandesParClient(Integer idClient);
}
