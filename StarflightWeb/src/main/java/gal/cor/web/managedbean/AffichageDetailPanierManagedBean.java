package gal.cor.web.managedbean;

import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.ICommandeClientService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "detailPanierMBean")
@RequestScoped
public class AffichageDetailPanierManagedBean
{

	@ManagedProperty(value = "#{detailProduitMBean}")
	private AffichageDetailProduitManagedBean beanDetail;

	@ManagedProperty(value = "#{gestionUtilisateurMBean}")
	private GestionUtilisateurMBean gestionUtilisateurMBean;

	@ManagedProperty(value = "#{testPanierMB}")
	private TestPanierMB testPanierMB;

	@EJB
	private ICommandeClientService proxyCommandeClient;

	private CommandeClient panier;
	private List<LignePieceClient> lignesPanier = new ArrayList<>();


	@PostConstruct
	public void AfficherUneCommande()
	{
		panier = testPanierMB.getPanier();
		lignesPanier.addAll(panier.getLignesPieceClient());
	}

	public String accesDetailProduit(Produit produit)
	{
		beanDetail.setProduit(produit);
		return ("affichageDetailProduit.xhtml");
	}

	public String validerLaCommande()
	{
		return ("compteUtilisateur.xhtml");
	}

	public CommandeClient getCommandeClient()
	{
		return panier;
	}

	public void setCommandeClient(CommandeClient commandeClient)
	{
		this.panier = commandeClient;
	}

	public CommandeClient getPanier()
	{
		return panier;
	}

	public void setPanier(CommandeClient panier)
	{
		this.panier = panier;
	}

	public List<LignePieceClient> getLignesPanier()
	{
		return lignesPanier;
	}

	public void setLignesPanier(List<LignePieceClient> lignesPanier)
	{
		this.lignesPanier = lignesPanier;
	}

	public ICommandeClientService getProxyCommandeClient()
	{
		return proxyCommandeClient;
	}

	public void setProxyCommandeClient(ICommandeClientService proxyCommandeClient)
	{
		this.proxyCommandeClient = proxyCommandeClient;
	}

	public void setBeanDetail(AffichageDetailProduitManagedBean beanDetail)
	{
		this.beanDetail = beanDetail;
	}

	public AffichageDetailProduitManagedBean getBeanDetail()
	{
		return beanDetail;
	}

	public GestionUtilisateurMBean getGestionUtilisateurMBean()
	{
		return gestionUtilisateurMBean;
	}

	public void setGestionUtilisateurMBean(GestionUtilisateurMBean gestionUtilisateurMBean)
	{
		this.gestionUtilisateurMBean = gestionUtilisateurMBean;
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
