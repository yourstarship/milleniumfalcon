package gal.cor.persistence.dao.apis;

import java.util.List;
import java.util.Map;

public interface IDaoGeneric <T> {
	
	void creer(T t);
	void supprimer(Class<T> type,Object id);
    T mettreAjour(T t);
    List<T> obtenirTous();
    
    T rechercherParId(Class<T> type, Object clefPrimaire);
    List<T> rechercherParRequeteNommee(String requeteNommee);
    List<T> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
    List<T> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
    List<T> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);
    List<T> rechercherParRequeteNative(String requeteSQL, Class<T> type);
    
}
