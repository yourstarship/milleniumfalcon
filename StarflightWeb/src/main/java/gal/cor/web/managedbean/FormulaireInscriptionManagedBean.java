package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="formInsciptMBean")
public class FormulaireInscriptionManagedBean {

	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Proc�dure ] *****/
	
	/***** [ Fonctions ] *****/
	
	public String accesDetailPanier(){
		return ("affichageDetailPanier.xhtml");
	}
	
	public String accesCompteUtilisateur(){
		return ("compteUtilisateur.xhtml");
	}
}
