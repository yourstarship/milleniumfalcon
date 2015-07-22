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
public class Civilite implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String libelle;

	public Civilite(Integer id, String libelle)
	{
		this.id = id;
		this.libelle = libelle;
	}

	public Civilite()
	{
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tlibelle: " + libelle + "\n}\n";
	}

}
