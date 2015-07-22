package gal.cor.persistence.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Promotion
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;
	private Double taux;
	private Date dateDebut;
	private Date dateFin;

	@ManyToMany(cascade =
	{ CascadeType.ALL })
	@JoinTable(name = "Produit_Promotion", joinColumns =
	{ @JoinColumn(name = "idPromotion") }, inverseJoinColumns =
	{ @JoinColumn(name = "idProduit") })
	private Set<Produit> produits;

	public Promotion(Integer id, String nom, Double taux, Date dateDebut, Date dateFin, Set<Produit> produits)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.taux = taux;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.produits = produits;
	}

	public Promotion()
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

	public Double getTaux()
	{
		return taux;
	}

	public void setTaux(Double taux)
	{
		this.taux = taux;
	}

	public Date getDateDebut()
	{
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut)
	{
		this.dateDebut = dateDebut;
	}

	public Date getDateFin()
	{
		return dateFin;
	}

	public void setDateFin(Date dateFin)
	{
		this.dateFin = dateFin;
	}

	public Set<Produit> getProduits()
	{
		return produits;
	}

	public void setProduits(Set<Produit> produits)
	{
		this.produits = produits;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n\ttaux: " + taux + "\n\tdateDebut: " + dateDebut + "\n\tdateFin: " + dateFin + "\n}\n";
	}

}
