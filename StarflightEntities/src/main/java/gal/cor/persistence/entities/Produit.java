package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;
	private String description;
	private String photo;
	private Double prixAchatHT;
	private Double prixVenteHT;
	private Double marge;
	private Date dateCreation;
	private Boolean estMilitaire;
	private Integer quantiteDisponible;
	private Date dateVisible;
	private Date dateInvisible;
	private Integer vitesse;
	private Integer poids;
	private Double longueur;
	private Double largeur;
	private Double hauteur;
	private Integer nombrePassagersMax;
	private Integer nombreEquipage;

	@ManyToOne
	@JoinColumn(name = "idTva")
	private TVA tva;

	@ManyToOne
	@JoinColumn(name = "idType")
	private Type type;

	@ManyToOne
	@JoinColumn(name = "idCat")
	private Categorie categorie;

	@ManyToMany(mappedBy = "produits")
	private Set<Promotion> promotions = new LinkedHashSet<>();

	@OneToMany(mappedBy = "produit")
	private Set<LignePieceClient> lignePieceClients = new LinkedHashSet<>();

	@ManyToOne
	@JoinColumn(name = "idcouleur")
	private Couleur couleur;

	@ManyToOne
	@JoinColumn(name = "idfournisseur")
	private Fournisseur constructeur;

	@ManyToMany(mappedBy = "produitsFavoris")
	private Set<Client> clientsPourLesquelsSuisFavori = new LinkedHashSet<>();

	public Produit(Integer id, String nom, String description, String photo, double prixAchatHT, double prixVenteHT, double marge, Date dateCreation, Boolean estMilitaire, int quantiteDisponible, Date dateVisible, Date dateInvisible, int vitesse, int poids, double longueur, double largeur, double hauteur, int nombrePassagersMax, int nombreEquipage)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.photo = photo;
		this.prixAchatHT = prixAchatHT;
		this.prixVenteHT = prixVenteHT;
		this.marge = marge;
		this.dateCreation = dateCreation;
		this.estMilitaire = estMilitaire;
		this.quantiteDisponible = quantiteDisponible;
		this.dateVisible = dateVisible;
		this.dateInvisible = dateInvisible;
		this.vitesse = vitesse;
		this.poids = poids;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nombrePassagersMax = nombrePassagersMax;
		this.nombreEquipage = nombreEquipage;
	}

	public Produit()
	{
		super();
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getPhoto()
	{
		return photo;
	}

	public void setPhoto(String photo)
	{
		this.photo = photo;
	}

	public Double getPrixAchatHT()
	{
		return prixAchatHT;
	}

	public void setPrixAchatHT(Double prixAchatHT)
	{
		this.prixAchatHT = prixAchatHT;
	}

	//	public Double getPrixVenteHT()
	//	{
	//		
	//		Double prix;
	//		prix = this.prixAchatHT*(1+this.marge/100);
	//		return prix;
	//	}

	public void setPrixVenteHT(Double prixVenteHT)
	{
		this.prixVenteHT = prixVenteHT;
	}

	public Double getMarge()
	{
		return marge;
	}

	public void setMarge(Double marge)
	{
		this.marge = marge;
	}

	public Date getDateCreation()
	{
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation)
	{
		this.dateCreation = dateCreation;
	}

	public Boolean getEstMilitaire()
	{
		return estMilitaire;
	}

	public void setEstMilitaire(Boolean estMilitaire)
	{
		this.estMilitaire = estMilitaire;
	}

	public Integer getQuantiteDisponible()
	{
		return quantiteDisponible;
	}

	public void setQuantiteDisponible(Integer quantiteDisponible)
	{
		this.quantiteDisponible = quantiteDisponible;
	}

	public Date getDateVisible()
	{
		return dateVisible;
	}

	public void setDateVisible(Date dateVisible)
	{
		this.dateVisible = dateVisible;
	}

	public Date getDateInvisible()
	{
		return dateInvisible;
	}

	public void setDateInvisible(Date dateInvisible)
	{
		this.dateInvisible = dateInvisible;
	}

	public Integer getVitesse()
	{
		return vitesse;
	}

	public void setVitesse(Integer vitesse)
	{
		this.vitesse = vitesse;
	}

	public Integer getPoids()
	{
		return poids;
	}

	public void setPoids(Integer poids)
	{
		this.poids = poids;
	}

	public Double getLongueur()
	{
		return longueur;
	}

	public void setLongueur(Double longueur)
	{
		this.longueur = longueur;
	}

	public Double getLargeur()
	{
		return largeur;
	}

	public void setLargeur(Double largeur)
	{
		this.largeur = largeur;
	}

	public Double getHauteur()
	{
		return hauteur;
	}

	public void setHauteur(Double hauteur)
	{
		this.hauteur = hauteur;
	}

	public Integer getNombrePassagersMax()
	{
		return nombrePassagersMax;
	}

	public void setNombrePassagersMax(Integer nombrePassagersMax)
	{
		this.nombrePassagersMax = nombrePassagersMax;
	}

	public Integer getNombreEquipage()
	{
		return nombreEquipage;
	}

	public void setNombreEquipage(Integer nombreEquipage)
	{
		this.nombreEquipage = nombreEquipage;
	}

	public TVA getTva()
	{
		return tva;
	}

	public void setTva(TVA tva)
	{
		this.tva = tva;
	}

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	public Categorie getCategorie()
	{
		return categorie;
	}

	public void setCategorie(Categorie categorie)
	{
		this.categorie = categorie;
	}

	public Set<Promotion> getPromotions()
	{
		return promotions;
	}

	public void setPromotions(Set<Promotion> promotions)
	{
		this.promotions = promotions;
	}

	public Set<LignePieceClient> getLignePieceClients()
	{
		return lignePieceClients;
	}

	public void setLignePieceClients(Set<LignePieceClient> lignePieceClients)
	{
		this.lignePieceClients = lignePieceClients;
	}

	public Couleur getCouleur()
	{
		return couleur;
	}

	public void setCouleur(Couleur couleur)
	{
		this.couleur = couleur;
	}

	public Fournisseur getConstructeur()
	{
		return constructeur;
	}

	public void setConstructeur(Fournisseur constructeur)
	{
		this.constructeur = constructeur;
	}

	public Set<Client> getClientsPourLesquelsSuisFavori()
	{
		return clientsPourLesquelsSuisFavori;
	}

	public void setClientsPourLesquelsSuisFavori(Set<Client> clientsPourLesquelsSuisFavori)
	{
		this.clientsPourLesquelsSuisFavori = clientsPourLesquelsSuisFavori;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n\tdescription: " + description + "\n\tphoto: " + photo + "\n\tprixAchatHT: " + prixAchatHT + "\n\tprixVenteHT: " + prixVenteHT + "\n\tmarge: " + marge + "\n\tdateCreation: " + dateCreation + "\n\testMilitaire: " + estMilitaire + "\n\tquantiteDisponible: " + quantiteDisponible + "\n\tdateVisible: " + dateVisible + "\n\tdateInvisible: " + dateInvisible + "\n\tvitesse: " + vitesse + "\n\tpoids: " + poids + "\n\tlongueur: " + longueur + "\n\tlargeur: " + largeur + "\n\thauteur: " + hauteur + "\n\tnombrePassagersMax: " + nombrePassagersMax + "\n\tnombreEquipage: " + nombreEquipage + "\n}\n";
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public Double getPrixVenteHT()
	{
		return prixVenteHT;
	}

}
