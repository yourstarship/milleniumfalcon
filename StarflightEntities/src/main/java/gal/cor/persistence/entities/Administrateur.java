package gal.cor.persistence.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "administrateur")
public class Administrateur extends Utilisateur
{

	public Administrateur(Integer id, String nom, String prenom, Date dateDeNaissance, Integer idUtilisateur, String identifiant, String motDePasse, Date dateOuverture)
	{
		super(id, nom, prenom, dateDeNaissance, identifiant, motDePasse, dateOuverture);

	}
	
	public Administrateur()
	{}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tgetIdentifiant: " + getIdentifiant() + "\n\tgetMotDePasse: " + getMotDePasse() + "\n\tgetDateOuverture: " + getDateOuverture() + "\n\tgetAdresse: " + getAdresse() + "\n\tgetTelephone: " + getTelephone() + "\n\tgetEmail: " + getEmail() + "\n\tgetCivilite: " + getCivilite() + "\n\tgetId: " + getId() + "\n\tgetNom: " + getNom() + "\n\tgetPrenom: " + getPrenom() + "\n\tgetDateDeNaissance: " + getDateDeNaissance() + "\n}\n";
	}

}
