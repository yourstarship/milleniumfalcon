package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;

	@OneToMany(mappedBy = "categorie")
	private Set<Produit> produits;

	public Categorie(Integer id, String nom, Set<Produit> produits)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.produits = produits;
	}

	public Categorie()
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
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n}\n";
	}

}
