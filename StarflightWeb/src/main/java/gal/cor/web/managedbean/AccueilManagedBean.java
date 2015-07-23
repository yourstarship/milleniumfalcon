package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="accueilManagedBean")
public class AccueilManagedBean {

	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Proc�dure ] *****/
	
	public void ajoutProduitAuPanier(){
		
	}
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailProduit(){
		return ("affichageDetailProduit.xhtml");
	}
	
	public String accesDetailPanier(){
		return ("affichageDetailPanier.xhtml");
	}
	
	public String validerLaCommande(){
		return ("compteUtilisateur.xhtml");
	}
	
}
