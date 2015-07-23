package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

@Entity
public class TypeAdresse implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String libelle;

	@OneToMany(mappedBy = "typeAdresse")
	private Set<Adresse> adressesDeCeType;

	public TypeAdresse()
	{
		super();
	}

	public TypeAdresse(Integer id, String libelle)
	{
		super();
		Id = id;
		this.libelle = libelle;
	}

	public Integer getId()
	{
		return Id;
	}

	public void setId(Integer id)
	{
		Id = id;
	}

	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

	public Set<Adresse> getAdressesDeCeType()
	{
		return adressesDeCeType;
	}

	public void setAdressesDeCeType(Set<Adresse> adressesDeCeType)
	{
		this.adressesDeCeType = adressesDeCeType;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tId: " + Id + "\n\tlibelle: " + libelle + "\n}\n";
	}

}
