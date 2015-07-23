package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Adresse implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer numeroVoie;
	private String complementNumeroVoie;
	private String nomVoie;
	private String complementAdresse;
	private String codePostal;
	private String ville;
	private Double latitude;
	private Double longitude;
	private Double altitude;

	@ManyToOne
	@JoinColumn(name = "idplanete")
	private Planete planete;

	@ManyToMany(cascade =
	{ CascadeType.ALL })
	@JoinTable(name = "Adresse_Client", joinColumns =
	{ @JoinColumn(name = "idAdresse") }, inverseJoinColumns =
	{ @JoinColumn(name = "idClient") })
	private Set<Client> clientsACetteAdresse;

	
	@ManyToOne
	@JoinColumn(name="idTypeAdresse")
	private TypeAdresse typeAdresse;

	public Adresse(Integer id, Integer numeroVoie, String complementNumeroVoie, String nomVoie, String complementAdresse, String codePostal, String ville, double latitude, double longitude, double altitude, Planete planete)
	{
		super();
		this.id = id;
		this.numeroVoie = numeroVoie;
		this.complementNumeroVoie = complementNumeroVoie;
		this.nomVoie = nomVoie;
		this.complementAdresse = complementAdresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.planete = planete;
	}

	public Adresse(Integer id, Integer numeroVoie, String complementNumeroVoie, String nomVoie, String complementAdresse, String codePostal, String ville, double latitude, double longitude, double altitude)
	{
		super();
		this.id = id;
		this.numeroVoie = numeroVoie;
		this.complementNumeroVoie = complementNumeroVoie;
		this.nomVoie = nomVoie;
		this.complementAdresse = complementAdresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}

	public Adresse()
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

	public Integer getNumeroVoie()
	{
		return numeroVoie;
	}

	public void setNumeroVoie(Integer numeroVoie)
	{
		this.numeroVoie = numeroVoie;
	}

	public String getComplementNumeroVoie()
	{
		return complementNumeroVoie;
	}

	public void setComplementNumeroVoie(String complementNumeroVoie)
	{
		this.complementNumeroVoie = complementNumeroVoie;
	}

	public String getNomVoie()
	{
		return nomVoie;
	}

	public void setNomVoie(String nomVoie)
	{
		this.nomVoie = nomVoie;
	}

	public String getComplementAdresse()
	{
		return complementAdresse;
	}

	public void setComplementAdresse(String complementAdresse)
	{
		this.complementAdresse = complementAdresse;
	}

	public String getCodePostal()
	{
		return codePostal;
	}

	public void setCodePostal(String codePostal)
	{
		this.codePostal = codePostal;
	}

	public String getVille()
	{
		return ville;
	}

	public void setVille(String ville)
	{
		this.ville = ville;
	}

	public double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	public double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

	public double getAltitude()
	{
		return altitude;
	}

	public void setAltitude(double altitude)
	{
		this.altitude = altitude;
	}

	public Planete getPlanete()
	{
		return planete;
	}

	public void setPlanete(Planete planete)
	{
		this.planete = planete;
	}

	public Set<Client> getClientsACetteAdresse()
	{
		return clientsACetteAdresse;
	}

	public void setClientsACetteAdresse(Set<Client> clientsACetteAdresse)
	{
		this.clientsACetteAdresse = clientsACetteAdresse;
	}

	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}

	public void setAltitude(Double altitude)
	{
		this.altitude = altitude;
	}

	public TypeAdresse getTypeAdresse()
	{
		return typeAdresse;
	}

	public void setTypeAdresse(TypeAdresse typeAdresse)
	{
		this.typeAdresse = typeAdresse;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnumeroVoie: " + numeroVoie + "\n\tcomplementNumeroVoie: " + complementNumeroVoie + "\n\tnomVoie: " + nomVoie + "\n\tcomplementAdresse: " + complementAdresse + "\n\tcodePostal: " + codePostal + "\n\tville: " + ville + "\n\tlatitude: " + latitude + "\n\tlongitude: " + longitude + "\n\taltitude: " + altitude + "\n}\n";
	}

}
