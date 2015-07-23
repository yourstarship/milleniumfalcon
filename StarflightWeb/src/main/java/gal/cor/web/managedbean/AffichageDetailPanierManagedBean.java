package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="detailPanierMBean")
public class AffichageDetailPanierManagedBean {

	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Proc�dure ] *****/
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailProduit(){
		return ("affichageDetailProduit.xhtml");
	}
	
	public String validerLaCommande(){
		return ("compteUtilisateur.xhtml");
	}
}
