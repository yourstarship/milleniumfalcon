package gal.cor.persistence.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "client")
public class Client extends Utilisateur
{
	private Date dernierAcces;
	private Boolean aSurveiller;
	private Double remise;
	private Date dateDesactivation;
	private Date dateActivation;

	@ManyToMany(cascade =
	{ CascadeType.ALL })
	@JoinTable(name = "favoris", joinColumns =
	{ @JoinColumn(name = "idClient") }, inverseJoinColumns =
	{ @JoinColumn(name = "idProduit") })
	private Set<Produit> produitsFavoris;

	@ManyToMany(mappedBy = "clientsACetteAdresse")
	private Set<Adresse> adresses;

	@OneToMany(mappedBy = "client")
	private Set<Carte> cartes;

	public Client(Integer id, String nom, String prenom, Date dateDeNaissance, String identifiant, String motDePasse, Date dateOuverture, Date dernierAcces, Boolean aSurveiller, Double remise, Date dateDesactivation, Date dateActivation)
	{
		super(id, nom, prenom, dateDeNaissance, identifiant, motDePasse, dateOuverture);
		this.dernierAcces = dernierAcces;
		this.aSurveiller = aSurveiller;
		this.remise = remise;
		this.dateDesactivation = dateDesactivation;
		this.dateActivation = dateActivation;
	}

	public Client()
	{

	}

	public Date getDernierAcces()
	{
		return dernierAcces;
	}

	public void setDernierAcces(Date dernierAcces)
	{
		this.dernierAcces = dernierAcces;
	}

	public Boolean getaSurveiller()
	{
		return aSurveiller;
	}

	public void setaSurveiller(Boolean aSurveiller)
	{
		this.aSurveiller = aSurveiller;
	}

	public Double getRemise()
	{
		return remise;
	}

	public void setRemise(Double remise)
	{
		this.remise = remise;
	}

	public Date getDateDesactivation()
	{
		return dateDesactivation;
	}

	public void setDateDesactivation(Date dateDesactivation)
	{
		this.dateDesactivation = dateDesactivation;
	}

	public Date getDateActivation()
	{
		return dateActivation;
	}

	public void setDateActivation(Date dateActivation)
	{
		this.dateActivation = dateActivation;
	}

	public Set<Produit> getProduitsFavoris()
	{
		return produitsFavoris;
	}

	public void setProduitsFavoris(Set<Produit> produitsFavoris)
	{
		this.produitsFavoris = produitsFavoris;
	}

	public Set<Adresse> getAdresses()
	{
		return adresses;
	}

	public void setAdresses(Set<Adresse> adresses)
	{
		this.adresses = adresses;
	}

	public Set<Carte> getCartes()
	{
		return cartes;
	}

	public void setCartes(Set<Carte> cartes)
	{
		this.cartes = cartes;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tdernierAcces: " + dernierAcces + "\n\taSurveiller: " + aSurveiller + "\n\tremise: " + remise + "\n\tdateDesactivation: " + dateDesactivation + "\n\tdateActivation: " + dateActivation + "\n}\n";
	}

}