package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="detailProduitMBean")
public class AffichageDetailProduitManagedBean {

	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Proc�dure ] *****/
	
	public void ajoutProduitAuPanier(){
		
	}
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailPanier(){
		return ("affichageDetailPanier.xhtml");
	}
	
	public String validerLaCommande(){
		return ("compteUtilisateur.xhtml");
	}
	
}
