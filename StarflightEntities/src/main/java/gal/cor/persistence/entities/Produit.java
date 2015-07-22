package gal.cor.persistence.entities;

import java.util.Date;
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
public class Produit
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;
	private String description;
	private String photo;
	private double prixAchatHT;
	private double prixVenteHT;
	private double marge;
	private Date dateCreation;
	private Boolean estMilitaire;
	private int quantiteDisponible;
	private Date dateVisible;
	private Date dateInvisible;
	private int vitesse;
	private int poids;
	private double longueur;
	private double largeur;
	private double hauteur;
	private int nombrePassagersMax;
	private int nombreEquipage;

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
	private Set<Promotion> promotions;

	@OneToMany(mappedBy = "produit")
	private Set<LignePieceClient> lignePieceClients;

	@ManyToOne
	@JoinColumn(name = "idcouleur")
	private Couleur couleur;

	@ManyToOne
	@JoinColumn(name = "idfournisseur")
	private Fournisseur constructeur;

	@ManyToMany(mappedBy = "produitsFavoris")
	private Set<Client> clientsPourLesquelsSuisFavori;

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

	public double getPrixAchatHT()
	{
		return prixAchatHT;
	}

	public void setPrixAchatHT(double prixAchatHT)
	{
		this.prixAchatHT = prixAchatHT;
	}

	public double getPrixVenteHT()
	{
		return prixVenteHT;
	}

	public void setPrixVenteHT(double prixVenteHT)
	{
		this.prixVenteHT = prixVenteHT;
	}

	public double getMarge()
	{
		return marge;
	}

	public void setMarge(double marge)
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

	public int getQuantiteDisponible()
	{
		return quantiteDisponible;
	}

	public void setQuantiteDisponible(int quantiteDisponible)
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

	public int getVitesse()
	{
		return vitesse;
	}

	public void setVitesse(int vitesse)
	{
		this.vitesse = vitesse;
	}

	public int getPoids()
	{
		return poids;
	}

	public void setPoids(int poids)
	{
		this.poids = poids;
	}

	public double getLongueur()
	{
		return longueur;
	}

	public void setLongueur(double longueur)
	{
		this.longueur = longueur;
	}

	public double getLargeur()
	{
		return largeur;
	}

	public void setLargeur(double largeur)
	{
		this.largeur = largeur;
	}

	public double getHauteur()
	{
		return hauteur;
	}

	public void setHauteur(double hauteur)
	{
		this.hauteur = hauteur;
	}

	public int getNombrePassagersMax()
	{
		return nombrePassagersMax;
	}

	public void setNombrePassagersMax(int nombrePassagersMax)
	{
		this.nombrePassagersMax = nombrePassagersMax;
	}

	public int getNombreEquipage()
	{
		return nombreEquipage;
	}

	public void setNombreEquipage(int nombreEquipage)
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
}
