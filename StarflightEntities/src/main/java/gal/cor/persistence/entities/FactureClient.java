package gal.cor.persistence.entities;

import java.io.Serializable;
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
public class FactureClient implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Double remise;
	private Date dateCreation;
	private Date dateValidation;
	private Date dateEnvoi;

	@OneToMany(mappedBy = "factureClient")
	private Set<CommandeClient> commandesClient;

	@ManyToOne
	@JoinColumn(name = "idavoir")
	private AvoirClient avoirClient;

	@OneToMany(mappedBy = "factureClient")
	private Set<LignePieceClient> lignesPieceClient;

	public FactureClient(Integer id, Double remise, Date dateCreation, Date dateValidation, Date dateEnvoi, AvoirClient avoirClient)
	{
		super();
		this.id = id;
		this.remise = remise;
		this.dateCreation = dateCreation;
		this.dateValidation = dateValidation;
		this.dateEnvoi = dateEnvoi;
		this.avoirClient = avoirClient;
	}

	public FactureClient(Integer id, Double remise, Date dateCreation, Date dateValidation, Date dateEnvoi)
	{
		super();
		this.id = id;
		this.remise = remise;
		this.dateCreation = dateCreation;
		this.dateValidation = dateValidation;
		this.dateEnvoi = dateEnvoi;
	}

	public FactureClient()
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

	public Double getRemise()
	{
		return remise;
	}

	public void setRemise(Double remise)
	{
		this.remise = remise;
	}

	public Date getDateCreation()
	{
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation)
	{
		this.dateCreation = dateCreation;
	}

	public Date getDateValidation()
	{
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation)
	{
		this.dateValidation = dateValidation;
	}

	public Date getDateEnvoi()
	{
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi)
	{
		this.dateEnvoi = dateEnvoi;
	}

	public AvoirClient getAvoirClient()
	{
		return avoirClient;
	}

	public void setAvoirClient(AvoirClient avoirClient)
	{
		this.avoirClient = avoirClient;
	}

	public Set<CommandeClient> getCommandesClient()
	{
		return commandesClient;
	}

	public void setCommandesClient(Set<CommandeClient> commandesClient)
	{
		this.commandesClient = commandesClient;
	}

	public Set<LignePieceClient> getLignesPieceClient()
	{
		return lignesPieceClient;
	}

	public void setLignesPieceClient(Set<LignePieceClient> lignesPieceClient)
	{
		this.lignesPieceClient = lignesPieceClient;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tremise: " + remise + "\n\tdateCreation: " + dateCreation + "\n\tdateValidation: " + dateValidation + "\n\tdateEnvoi: " + dateEnvoi + "\n}\n";
	}

}
