package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.TypeCarte;


public interface IDaoTypeCarte  {
	void creerTypeCarte(TypeCarte t);
	void supprimerTypeCarte(TypeCarte t);
	TypeCarte mettreAjourTypeCarte(TypeCarte t);
	TypeCarte rechercherParId(TypeCarte t);

	//Requetes personnalis�es
	List<TypeCarte> rechercherParRequeteNommee(String requeteNommee);
	List<TypeCarte> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<TypeCarte> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<TypeCarte> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<TypeCarte> obtenirTousTypeCarte();
}
