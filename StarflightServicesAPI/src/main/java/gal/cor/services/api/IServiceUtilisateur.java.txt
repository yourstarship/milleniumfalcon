package gal.cor.services.api;

import gal.cor.persistence.entities.Personne;

import java.util.List;

public interface IServiceUtilisateur {

	public List<Personne> listeUtilisateurs() throws Exception;
	public String ajouteClient() throws Exception;
	public String ajouteMilitaire();
	public Personne recherche(String nom, String motDePasse) throws Exception;
	public Personne creer();
	
}
