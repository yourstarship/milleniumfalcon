package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "administrateur")
public class Administrateur extends Utilisateur implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5041028374523577174L;

	public Administrateur(Integer id, String nom, String prenom, Date dateDeNaissance, String telephone, String email, String identifiant, String motDePasse, Date dateOuverture)
	{
		super(id, nom, prenom, dateDeNaissance, telephone, email, identifiant, motDePasse, dateOuverture);
		// TODO Auto-generated constructor stub
	}

	public Administrateur()
	{
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tgetIdentifiant: " + getIdentifiant() + "\n\tgetMotDePasse: " + getMotDePasse() + "\n\tgetDateOuverture: " + getDateOuverture() + "\n\tgetAdresse: " + getAdresse() + "\n\tgetTelephone: " + getTelephone() + "\n\tgetEmail: " + getEmail() + "\n\tgetCivilite: " + getCivilite() + "\n\tgetId: " + getId() + "\n\tgetNom: " + getNom() + "\n\tgetPrenom: " + getPrenom() + "\n\tgetDateDeNaissance: " + getDateDeNaissance() + "\n}\n";
	}

}
