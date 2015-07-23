package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Systeme;


public interface IDaoSysteme  {
	void creerSysteme(Systeme t);
	void supprimerSysteme(Systeme t);
	Systeme mettreAjourSysteme(Systeme t);
	Systeme rechercherParId(Systeme t);

	//Requetes personnalis�es
	List<Systeme> rechercherParRequeteNommee(String requeteNommee);
	List<Systeme> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Systeme> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Systeme> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Systeme> obtenirTousSysteme();
}
