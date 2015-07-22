package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Utilisateur;


public interface IDaoUtilisateur extends IDaoGeneric<Utilisateur> {
	void creerUtilisateur(Utilisateur t);
	void supprimerUtilisateur(Utilisateur t);
	Utilisateur mettreAjourUtilisateur(Utilisateur t);
	Utilisateur rechercherParId(Utilisateur t);

	//Requetes personnalis�es
	List<Utilisateur> rechercherParRequeteNommee(String requeteNommee);
	List<Utilisateur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Utilisateur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Utilisateur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Utilisateur> obtenirTousUtilisateur();
}
