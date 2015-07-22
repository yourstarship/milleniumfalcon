package gal.cor.persistence.dao.impl;

import gal.cor.persistence.dao.apis.IDaoGeneric;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.lang.reflect.ParameterizedType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

@Stateless
public class DaoGenericImpl<T> implements IDaoGeneric<T> {

	@PersistenceContext(unitName = "YourStarshipPersistence", type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

	private String requeteObtenirTous;
	private Class<T> type;    
	
	public DaoGenericImpl() {
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		requeteObtenirTous = "SELECT m From " + type.getName() + " m";
	}
	
	@Override
	public void creer(T t) {
		entityManager.persist(t);		
	}

	@Override
	public void supprimer(Class type, Object id) {
		Object ref = (Object) entityManager.find(type, id);
		if (ref != null) {
			entityManager.remove(ref);
		}
		
	}

	@Override
	public T mettreAjour(T t) {
		return entityManager.merge(t);
		
	}
	
	@Override
	public List<T> obtenirTous() {
		Query query = entityManager.createQuery(requeteObtenirTous);
        return (List<T>) query.getResultList();
	}

	@Override
	public T rechercherParId(Class<T> type, Object clefPrimaire) {
		return entityManager.find(type, clefPrimaire);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> rechercherParRequeteNommee(String requeteNommee) {
		return (List<T>) entityManager.createNamedQuery(requeteNommee).getResultList();
	}

	@Override
	public List<T> rechercherParRequeteNommee(String requeteNommee,Map<String, Object> parametres, int nbreMaxElements) {
		
		Set<Entry<String, Object>> rawParameters = parametres.entrySet();
        Query query = entityManager.createNamedQuery(requeteNommee);
        if (nbreMaxElements > 0)
            query.setMaxResults(nbreMaxElements);
        for (Entry<String, Object> entry : rawParameters) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return (List<T>)query.getResultList();
	}
	
	@Override
	public List<T> rechercherParRequeteNommee(String requeteNommee, Map<String, Object> parametres) {
		return rechercherParRequeteNommee(requeteNommee, parametres, 0);
	}

	@Override
	public List<T> rechercherParRequeteNommee(String requeteNommee,int nbreMaxElements) {
		return (List<T>) entityManager.createNamedQuery(requeteNommee).setMaxResults(nbreMaxElements).getResultList();
	}

	@Override
	public List<T> rechercherParRequeteNative(String requeteSQL,Class<T> type) {
		return (List<T>) entityManager.createNativeQuery(requeteSQL, type).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
