package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="compteAdminMBean")
public class CompteAdministrateurManagedBean {
	
	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Proc�dure ] *****/
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailProduit(){
		return ("creationEtGestionProduitDetaille.xhtml");
	}
	
	public String accesCreationProduit(){
		return ("creationEtGestionProduitDetaille.xhtml");
	}

}
