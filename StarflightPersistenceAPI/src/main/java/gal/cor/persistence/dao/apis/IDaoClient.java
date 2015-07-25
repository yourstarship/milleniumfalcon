package gal.cor.persistence.dao.apis;

import java.util.List;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.Produit;

public interface IDaoClient
{
	public Client creerClient(Client t);
	public void supprimerClient(Client t);
	public Client mettreAjourClient(Client t);
	public Client rechercherParId(int id);
	public Client rechercherParNomMotDePasse(String nom, String motDePasse);
	public List<Client> obtenirTousClient();
	public Client rechercherParIdentifiantMotDePasse(String identifiant, String motDePasse);
	public List<CommandeClient> commandesParIdClient(int id);

	public Client clientParIdClientAvecSesCommandes(int id);

}
