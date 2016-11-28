package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "formInsciptMBean")
@RequestScoped
public class FormulaireInscriptionManagedBean
{

	@ManagedProperty(value = "#{testPanierMB}")
	private TestPanierMB testPanierMB;

	/************************/
	/***** [ M�thodes ] *****/
	/************************/

	/***** [ Proc�dure ] *****/

	/***** [ Fonctions ] *****/

	public String accesDetailPanier()
	{
		return ("affichageDetailPanier.xhtml");
	}

	public String accesCompteUtilisateur()
	{
		return ("compteUtilisateur.xhtml");
	}

	public TestPanierMB getTestPanierMB()
	{
		return testPanierMB;
	}

	public void setTestPanierMB(TestPanierMB testPanierMB)
	{
		this.testPanierMB = testPanierMB;
	}

}
