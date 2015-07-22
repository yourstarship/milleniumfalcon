package gal.cor.persistence.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public abstract class Utilisateur extends Personne
{

	private String identifiant;
	private String motDePasse;
	private Date dateOuverture;

	public Utilisateur(Integer id, String nom, String prenom, Date dateDeNaissance, String identifiant, String motDePasse, Date dateOuverture)
	{
		super(id, nom, prenom, dateDeNaissance);
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.dateOuverture = dateOuverture;
	}

	public Utilisateur()
	{
		super();
	}

	public String getIdentifiant()
	{
		return identifiant;
	}

	public void setIdentifiant(String identifiant)
	{
		this.identifiant = identifiant;
	}

	public String getMotDePasse()
	{
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse)
	{
		this.motDePasse = motDePasse;
	}

	public Date getDateOuverture()
	{
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture)
	{
		this.dateOuverture = dateOuverture;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tidentifiant: " + identifiant + "\n\tmotDePasse: " + motDePasse + "\n\tdateOuverture: " + dateOuverture + "\n}\n";
	}

}
