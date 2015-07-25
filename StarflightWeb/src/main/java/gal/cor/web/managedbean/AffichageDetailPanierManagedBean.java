package gal.cor.web.managedbean;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.LignePieceClient;
import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.ICommandeClientService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "detailPanierMBean")
@SessionScoped
public class AffichageDetailPanierManagedBean
{

	@ManagedProperty(value = "#{detailProduitMBean}")
	private AffichageDetailProduitManagedBean beanDetail;

	@ManagedProperty(value = "#{gestionUtilisateurMBean}")
	private GestionUtilisateurMBean gestionUtilisateurMBean;

	@EJB
	private ICommandeClientService proxyCommandeClient;

	private CommandeClient commandeClient;
	private List<LignePieceClient> listeLigneCommandes = new ArrayList<>();
	private Produit produit;

	@PostConstruct
	public void AfficherUneCommande()
	{

		commandeClient = proxyCommandeClient.rechercherParId(gestionUtilisateurMBean.getClient().getId());
		listeLigneCommandes.addAll(commandeClient.getLignesPieceClient());
		for (LignePieceClient lign : listeLigneCommandes)
		{
			produit = lign.getProduit();
		}

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
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient)
	{
		this.commandeClient = commandeClient;
	}

	public List<LignePieceClient> getListeLigneCommandes()
	{
		return listeLigneCommandes;
	}

	public void setListeLigneCommandes(List<LignePieceClient> listeLigneCommandes)
	{
		this.listeLigneCommandes = listeLigneCommandes;
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

	public Produit getProduit()
	{
		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
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

}
