package gal.cor.persistence.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Systeme
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;

	@OneToMany(mappedBy = "systeme")
	private Set<Planete> planetes;

	public Systeme(Integer id, String nom)
	{
		super();
		this.id = id;
		this.nom = nom;
	}

	public Systeme()
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

	public Set<Planete> getPlanetes()
	{
		return planetes;
	}

	public void setPlanetes(Set<Planete> planetes)
	{
		this.planetes = planetes;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n}\n";
	}

}
