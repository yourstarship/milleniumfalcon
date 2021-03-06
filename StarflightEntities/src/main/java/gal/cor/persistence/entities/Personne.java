package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Personne implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1809483080535852882L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String telephone;
	private String email;
	//private String type;

	@ManyToOne
	@JoinColumn(name = "idAdresse")
	private Adresse adresse;

	@ManyToOne
	@JoinColumn(name = "idcivilite")
	private Civilite civilite;

	public Personne(Integer id, String nom, String prenom, Date dateDeNaissance, String telephone, String email)
	{
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.telephone = telephone;
		this.email = email;
	}

	public Adresse getAdresse()
	{
		return adresse;
	}

	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}

	public Personne()
	{
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Civilite getCivilite()
	{
		return civilite;
	}

	public void setCivilite(Civilite civilite)
	{
		this.civilite = civilite;
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

	public String getPrenom()
	{
		return prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public Date getDateDeNaissance()
	{
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance)
	{
		this.dateDeNaissance = dateDeNaissance;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnom: " + nom + "\n\tprenom: " + prenom + "\n\tdateDeNaissance: " + dateDeNaissance + "\n\ttelephone: " + telephone + "\n\temail: " + email + "\n}\n";
	}

}
