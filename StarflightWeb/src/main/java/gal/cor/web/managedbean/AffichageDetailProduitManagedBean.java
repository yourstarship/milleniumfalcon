package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean (name="detailProduitMBean")
public class AffichageDetailProduitManagedBean {
	
	
	@ManagedProperty(value="#{accueilManagedBean}")
	private AccueilManagedBean accueilManagedBean;
	
	

	public void ajoutProduitAuPanier(){
		
	}
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailPanier(){
		return ("affichageDetailPanier.xhtml");
	}
	
	public String validerLaCommande(){
		return ("compteUtilisateur.xhtml");
	}

	public AccueilManagedBean getAccueilManagedBean() {
		return accueilManagedBean;
	}

	public void setAccueilManagedBean(AccueilManagedBean accueilManagedBean) {
		this.accueilManagedBean = accueilManagedBean;
	}
	
	
	
	
}
