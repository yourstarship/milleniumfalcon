package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeCarte implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;

	@OneToMany(mappedBy = "typeCarte")
	private Set<Carte> cartesDeCeType = new LinkedHashSet<>();

	public TypeCarte(Integer id, String nom)
	{
		super();
		this.id = id;
		this.nom = nom;
	}

	public TypeCarte()
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

	public Set<Carte> getCartesDeCeType()
	{
		return cartesDeCeType;
	}

	public void setCartesDeCeType(Set<Carte> cartesDeCeType)
	{
		this.cartesDeCeType = cartesDeCeType;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n}\n";
	}

}
