package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="formInsciptMBean")
@RequestScoped
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
