package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.CommandeClient;

public interface IDaoCommandeClient
{
	public CommandeClient creerCommandeClient(CommandeClient t);

	public void supprimerCommandeClient(CommandeClient t);

	public CommandeClient mettreAjourCommandeClient(CommandeClient t);

	CommandeClient rechercherParId(int id);

	List<CommandeClient> recupeCommandesParClient(Integer idClient);
}
