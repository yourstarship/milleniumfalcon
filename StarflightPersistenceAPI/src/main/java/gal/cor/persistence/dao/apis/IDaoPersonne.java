package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Personne;


public interface IDaoPersonne  {
	void creerPersonne(Personne t);
	void supprimerPersonne(Personne t);
	Personne mettreAjourPersonne(Personne t);
	Personne rechercherParId(Personne t);

	//Requetes personnalis�es
	List<Personne> rechercherParRequeteNommee(String requeteNommee);
	List<Personne> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Personne> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Personne> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Personne> obtenirTousPersonne();
}
