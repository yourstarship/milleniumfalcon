package gal.cor.web.managedbean;

import gal.cor.persistence.entities.Produit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "detailProduitMBean")
@RequestScoped
public class AffichageDetailProduitManagedBean
{

	@ManagedProperty(value = "#{accueilManagedBean}")
	private AccueilManagedBean accueilManagedBean;

	private Produit produit;

	public void ajoutProduitAuPanier()
	{

	}

	/***** [ Fonctions ] *****/

	public String accesDetailPanier()
	{
		return ("affichageDetailPanier.xhtml");
	}

	public String validerLaCommande()
	{
		return ("compteUtilisateur.xhtml");
	}

	public AccueilManagedBean getAccueilManagedBean()
	{
		return accueilManagedBean;
	}

	public void setAccueilManagedBean(AccueilManagedBean accueilManagedBean)
	{
		produit = accueilManagedBean.getProduit();
		this.accueilManagedBean = accueilManagedBean;
	}

	public Produit getProduit()
	{

		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
	}

}
