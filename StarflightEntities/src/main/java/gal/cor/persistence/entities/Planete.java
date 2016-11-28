package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Planete implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;

	@ManyToOne
	@JoinColumn(name = "idsysteme")
	private Systeme systeme;

	@OneToMany(mappedBy = "planete")
	private Set<Adresse> adresses = new LinkedHashSet<>();

	public Planete(Integer id, String nom, Systeme systeme)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.systeme = systeme;
	}

	public Planete(Integer id, String nom, Systeme systeme, Set<Adresse> adresses)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.systeme = systeme;
		this.adresses = adresses;
	}

	public Planete(Integer id, String nom)
	{
		super();
		this.id = id;
		this.nom = nom;
	}

	public Planete()
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

	public Systeme getSysteme()
	{
		return systeme;
	}

	public void setSysteme(Systeme systeme)
	{
		this.systeme = systeme;
	}

	public Set<Adresse> getAdresses()
	{
		return adresses;
	}

	public void setAdresses(Set<Adresse> adresses)
	{
		this.adresses = adresses;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n}\n";
	}

}
