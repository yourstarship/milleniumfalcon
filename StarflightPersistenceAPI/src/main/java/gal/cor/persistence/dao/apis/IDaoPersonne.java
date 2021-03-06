package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.Personne;


public interface IDaoPersonne {
	
	void creerPersonne(Personne t);
	void supprimerPersonne(Personne t);
	Personne mettreAjourPersonne(Personne t);
	Personne rechercherParId(Personne t);
	List<Personne> rechercherParNom(String nom);
	Personne rechercherParEmail(String email);
	Collection<Personne> obtenirTousPersonne();

}
