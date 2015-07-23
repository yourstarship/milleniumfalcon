package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TVA implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double taux;
	private String nom;

	@OneToMany(mappedBy = "tva")
	private Set<Produit> produits;

	public Set<Produit> getProduits()
	{
		return produits;
	}

	public void setProduits(Set<Produit> produits)
	{
		this.produits = produits;
	}

	public Integer getIdTva()
	{
		return id;
	}

	public void setIdTva(Integer idTva)
	{
		this.id = idTva;
	}

	public double getTaux()
	{
		return taux;
	}

	public void setTaux(double taux)
	{
		this.taux = taux;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public TVA(Integer idTva, double taux, String nom)
	{
		super();
		this.id = idTva;
		this.taux = taux;
		this.nom = nom;
	}

	public TVA()
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

	public void setTaux(Double taux)
	{
		this.taux = taux;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\ttaux: " + taux + "\n\tnom: " + nom + "\n}\n";
	}

}
