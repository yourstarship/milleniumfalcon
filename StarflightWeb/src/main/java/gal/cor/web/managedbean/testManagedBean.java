package gal.cor.web.managedbean;

import java.util.List;

import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.IProduitServices;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class testManagedBean {

	@EJB
	private IProduitServices proxyProduitSevices;
	
	List<Produit> listeProduit = null;

	@PostConstruct
	public void afficherListeProduit(){
		listeProduit = proxyProduitSevices.obtenirTousProduitServices();
		System.out.println(listeProduit);
	}
	
	
	public IProduitServices getProxyProduitSevices() {
		return proxyProduitSevices;
	}
	public void setProxyProduitSevices(IProduitServices proxyProduitSevices) {
		this.proxyProduitSevices = proxyProduitSevices;
	}
	public List<Produit> getListeProduit() {
		return listeProduit;
	}
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
}
