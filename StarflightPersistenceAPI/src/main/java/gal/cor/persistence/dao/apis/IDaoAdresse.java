package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Adresse;


public interface IDaoAdresse extends IDaoGeneric<Adresse> {
	void creerAdresse(Adresse t);
	void supprimerAdresse(Adresse t);
	Adresse mettreAjourAdresse(Adresse t);
	Adresse rechercherParId(Adresse t);

	//Requetes personnalisées
	List<Adresse> rechercherParRequeteNommee(String requeteNommee);
	List<Adresse> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Adresse> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Adresse> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Adresse> obtenirTousAdresse();
}
