package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.LignePieceClient;


public interface IDaoLignePieceClient extends IDaoGeneric<LignePieceClient> {
	void creerLignePieceClient(LignePieceClient t);
	void supprimerLignePieceClient(LignePieceClient t);
	LignePieceClient mettreAjourLignePieceClient(LignePieceClient t);
	LignePieceClient rechercherParId(LignePieceClient t);

	//Requetes personnalis�es
	List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee);
	List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<LignePieceClient> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<LignePieceClient> obtenirTousLignePieceClient();
}
