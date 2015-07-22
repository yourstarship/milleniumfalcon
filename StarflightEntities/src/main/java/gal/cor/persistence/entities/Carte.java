package gal.cor.persistence.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Carte
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer numero;
	private Date dateExpiration;
	private Integer cryptogramme;

	@ManyToOne
	@JoinColumn(name = "idtypecarte")
	private TypeCarte typeCarte;

	@ManyToOne
	@JoinColumn(name = "idclient")
	private Client client;

	@OneToMany(mappedBy = "carte")
	private Set<CommandeClient> commandesPayeesAvecCetteCarte;

	public Carte(Integer id, Integer numero, Date dateExpiration, Integer cryptogramme)
	{
		super();
		this.id = id;
		this.numero = numero;
		this.dateExpiration = dateExpiration;
		this.cryptogramme = cryptogramme;
	}

	public Carte()
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

	public Integer getNumero()
	{
		return numero;
	}

	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	public Date getDateExpiration()
	{
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration)
	{
		this.dateExpiration = dateExpiration;
	}

	public Integer getCryptogramme()
	{
		return cryptogramme;
	}

	public void setCryptogramme(Integer cryptogramme)
	{
		this.cryptogramme = cryptogramme;
	}

	public TypeCarte getTypeCarte()
	{
		return typeCarte;
	}

	public void setTypeCarte(TypeCarte typeCarte)
	{
		this.typeCarte = typeCarte;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public Set<CommandeClient> getCommandesPayeesAvecCetteCarte()
	{
		return commandesPayeesAvecCetteCarte;
	}

	public void setCommandesPayeesAvecCetteCarte(Set<CommandeClient> commandesPayeesAvecCetteCarte)
	{
		this.commandesPayeesAvecCetteCarte = commandesPayeesAvecCetteCarte;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tnumero: " + numero + "\n\tdateExpiration: " + dateExpiration + "\n\tcryptogramme: " + cryptogramme + "\n}\n";
	}

}
