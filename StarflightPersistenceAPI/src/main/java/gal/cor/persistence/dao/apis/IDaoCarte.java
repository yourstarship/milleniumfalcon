package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Carte;


public interface IDaoCarte  {
	void creerCarte(Carte t);
	
	Carte rechercherParId(Integer idCarte);
	List<Carte> RechercheCartesParIdClient(Integer idClient);

	//Requetes personnalis�es
	List<Carte> rechercherParRequeteNommee(String requeteNommee);
	List<Carte> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Carte> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Carte> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Carte> obtenirTousCarte();
}
