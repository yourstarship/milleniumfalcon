package gal.cor.persistence.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fonction
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFonction;
	private String libelle;

	public Integer getIdFonction()
	{
		return idFonction;
	}

	public void setIdFonction(Integer idFonction)
	{
		this.idFonction = idFonction;
	}

	public String getLibelle()
	{
		return libelle;
	}

	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

	public Fonction(String libelle)
	{
		super();

		this.libelle = libelle;
	}

	public Fonction()
	{
		super();
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tidFonction: " + idFonction + "\n\tlibelle: " + libelle + "\n}\n";
	}

}
