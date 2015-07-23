package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Promotion;


public interface IDaoPromotion  {
	void creerPromotion(Promotion t);
	void supprimerPromotion(Promotion t);
	Promotion mettreAjourPromotion(Promotion t);
	Promotion rechercherParId(Promotion t);

	//Requetes personnalis�es
	List<Promotion> rechercherParRequeteNommee(String requeteNommee);
	List<Promotion> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<Promotion> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<Promotion> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<Promotion> obtenirTousPromotion();
}
