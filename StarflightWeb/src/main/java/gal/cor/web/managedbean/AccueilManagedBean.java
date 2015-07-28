package gal.cor.web.managedbean;

import gal.cor.persistence.entities.Produit;
import gal.cor.services.api.IProduitServices;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean(name = "accueilManagedBean")
@SessionScoped
public class AccueilManagedBean	
{
	@ManagedProperty(value="#{gestionUtilisateurMBean}")
	private GestionUtilisateurMBean gestion;
	
	
	@EJB
	private IProduitServices proxyProduitServices;

	private Logger log = Logger.getLogger(this.getClass());

	List<Produit> listeProduit = new ArrayList<Produit>();
	private Produit produit;
	private List<Produit> listPromotion = new ArrayList<Produit>();

	private Integer nomCategorie = 1;
	private Integer nomCategorie1 = 2;
	private Integer nomCategorie2 = 3;
	private Integer nomCategorie3 = 4;
	private Integer nomCategorie4 = 5;
	private Integer nomCategorie5 = 6;
	private Integer nomCategorie6 = 7;
	private Integer nomCategorie7 = 8;
	private Integer typeSubmersible = 20;
	private Integer typeNavireDeSuface = 14;
	private Integer typeTank = 22;
	private Integer typeTransport = 23;
	private Integer typeReconnaissance = 15;
	private Integer typeSpeeder = 16;
	private Integer typeChasseur = 5;
	private Integer typeBombardier = 2;
	private Integer typeIntercepteur = 12;

	private String nomRecherche;

	/***** [ Fonctions ] *****/

	@PostConstruct
	public void afficherListeProduit()
	{
		listeProduit.clear();
		listeProduit = proxyProduitServices.obtenirTousProduitServices();
		listPromotion = proxyProduitServices.ListeDesTroisMeilleursPromo();

	}

	public void afficherLesSelections(Integer idCategorie)
	{

		listeProduit = proxyProduitServices.rechercherParCategorie(idCategorie);
	}

	public void afficherSousCategorie(Integer idCategorie, Integer idType)
	{
		listeProduit = proxyProduitServices.rechercherProduitParCategorieEtType(idCategorie, idType);
	}

	public void afficherListeProduitParRecherche(String nomRecherche)
	{

		listeProduit.clear();
		listeProduit = proxyProduitServices.obtenirTousProduitParNom(nomRecherche);
	}

	public String accesDetailProduit(Produit produit)
	{
		this.produit = produit;

		return ("affichageDetailProduit.xhtml");
	}

	public String accesDetailPanier()
	{
		return ("affichageDetailPanier.xhtml");
	}

	public String validerLaCommande()
	{
		
		if(gestion.getClient() !=null){
			
			return ("compteUtilisateur.xhtml");
		}
		else{
			return ("formulaireInscription.xhtml");
		}
		
	}

	/******************* GETTER && SETTER *********************/

	public Integer getTypeSubmersible()
	{
		return typeSubmersible;
	}

	public IProduitServices getProxyProduitServices()
	{
		return proxyProduitServices;
	}

	public void setProxyProduitServices(IProduitServices proxyProduitServices)
	{
		this.proxyProduitServices = proxyProduitServices;
	}

	public List<Produit> getListPromotion()
	{
		return listPromotion;
	}

	public void setListPromotion(List<Produit> listPromotion)
	{
		this.listPromotion = listPromotion;
	}

	public Produit getProduit()
	{
		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
	}

	public void setTypeSubmersible(Integer typeSubmersible)
	{
		this.typeSubmersible = typeSubmersible;
	}

	public Integer getTypeNavireDeSuface()
	{
		return typeNavireDeSuface;
	}

	public void setTypeNavireDeSuface(Integer typeNavireDeSuface)
	{
		this.typeNavireDeSuface = typeNavireDeSuface;
	}

	public Integer getTypeTank()
	{
		return typeTank;
	}

	public void setTypeTank(Integer typeTank)
	{
		this.typeTank = typeTank;
	}

	public Integer getTypeTransport()
	{
		return typeTransport;
	}

	public void setTypeTransport(Integer typeTransport)
	{
		this.typeTransport = typeTransport;
	}

	public Integer getTypeReconnaissance()
	{
		return typeReconnaissance;
	}

	public void setTypeReconnaissance(Integer typeReconnaissance)
	{
		this.typeReconnaissance = typeReconnaissance;
	}

	public Integer getTypeSpeeder()
	{
		return typeSpeeder;
	}

	public void setTypeSpeeder(Integer typeSpeeder)
	{
		this.typeSpeeder = typeSpeeder;
	}

	public Integer getTypeChasseur()
	{
		return typeChasseur;
	}

	public void setTypeChasseur(Integer typeChasseur)
	{
		this.typeChasseur = typeChasseur;
	}

	public Integer getTypeBombardier()
	{
		return typeBombardier;
	}

	public void setTypeBombardier(Integer typeBombardier)
	{
		this.typeBombardier = typeBombardier;
	}

	public Integer getTypeIntercepteur()
	{
		return typeIntercepteur;
	}

	public void setTypeIntercepteur(Integer typeIntercepteur)
	{
		this.typeIntercepteur = typeIntercepteur;
	}

	public IProduitServices getProxyProduitSevices()
	{
		return proxyProduitServices;
	}

	public void setProxyProduitSevices(IProduitServices proxyProduitSevices)
	{
		this.proxyProduitServices = proxyProduitSevices;
	}

	public List<Produit> getListeProduit()
	{
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit)
	{
		this.listeProduit = listeProduit;
	}

	public Integer getNomCategorie()
	{
		return nomCategorie;
	}

	public void setNomCategorie(Integer nomCategorie)
	{
		this.nomCategorie = nomCategorie;
	}

	public Integer getNomCategorie1()
	{
		return nomCategorie1;
	}

	public void setNomCategorie1(Integer nomCategorie1)
	{
		this.nomCategorie1 = nomCategorie1;
	}

	public Integer getNomCategorie2()
	{
		return nomCategorie2;
	}

	public void setNomCategorie2(Integer nomCategorie2)
	{
		this.nomCategorie2 = nomCategorie2;
	}

	public Integer getNomCategorie3()
	{
		return nomCategorie3;
	}

	public void setNomCategorie3(Integer nomCategorie3)
	{
		this.nomCategorie3 = nomCategorie3;
	}

	public Integer getNomCategorie4()
	{
		return nomCategorie4;
	}

	public void setNomCategorie4(Integer nomCategorie4)
	{
		this.nomCategorie4 = nomCategorie4;
	}

	public Integer getNomCategorie5()
	{
		return nomCategorie5;
	}

	public void setNomCategorie5(Integer nomCategorie5)
	{
		this.nomCategorie5 = nomCategorie5;
	}

	public Integer getNomCategorie6()
	{
		return nomCategorie6;
	}

	public void setNomCategorie6(Integer nomCategorie6)
	{
		this.nomCategorie6 = nomCategorie6;
	}

	public Integer getNomCategorie7()
	{
		return nomCategorie7;
	}

	public void setNomCategorie7(Integer nomCategorie7)
	{
		this.nomCategorie7 = nomCategorie7;
	}

	public void ajoutProduitAuPanier()
	{

	}

	public String getNomRecherche()
	{
		return nomRecherche;
	}

	public void setNomRecherche(String nomRecherche)
	{
		this.nomRecherche = nomRecherche;
	}

	public GestionUtilisateurMBean getGestion()
	{
		return gestion;
	}

	public void setGestion(GestionUtilisateurMBean gestion)
	{
		this.gestion = gestion;
	}

	/***** [ Fonctions ] *****/

}
