package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "militaire")
public class Militaire extends Client implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;

	public Militaire(Integer id, String nom, String prenom, Date dateDeNaissance, String identifiant, String motDePasse, Date dateOuverture, Date dernierAcces, Boolean aSurveiller, Double remise, Date dateDesactivation, Date dateActivation, String code)
	{
		super(id, nom, prenom, dateDeNaissance, identifiant, motDePasse, dateOuverture, dernierAcces, aSurveiller, remise, dateDesactivation, dateActivation);
		this.code = code;
	}

	public Militaire()
	{
		super();
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tcode: " + code + "\n}\n";
	}

}
