package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="compteUtilisateurMBean")
public class CompteUtilisateurManagedBean {

	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Proc�dure ] *****/
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailPanier(){
		return ("affichageDetailPanier.xhtml");
	}
	
	public String validerLaCommande(){
		return ("compteUtilisateur.xhtml");
	}
	
}
