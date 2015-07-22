package gal.cor.persistence.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FactureFournisseur
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFF;
	private Date dateCreation;
	private Date dateValidation;
	private double remise;

	@OneToMany(mappedBy = "factureFournisseur")
	private Set<CommandeFournisseur> CommandeFournisseurs;

	public Set<CommandeFournisseur> getCommandeFournisseurs()
	{
		return CommandeFournisseurs;
	}

	public void setCommandeFournisseurs(Set<CommandeFournisseur> commandeFournisseurs)
	{
		CommandeFournisseurs = commandeFournisseurs;
	}

	public Integer getIdFF()
	{
		return idFF;
	}

	public void setIdFF(Integer idFF)
	{
		this.idFF = idFF;
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

	public double getRemise()
	{
		return remise;
	}

	public void setRemise(double remise)
	{
		this.remise = remise;
	}

	public FactureFournisseur(Integer idFF, Date dateCreation, Date dateValidation, double remise)
	{
		super();
		this.idFF = idFF;
		this.dateCreation = dateCreation;
		this.dateValidation = dateValidation;
		this.remise = remise;
	}

	public FactureFournisseur()
	{
		super();
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tidFF: " + idFF + "\n\tdateCreation: " + dateCreation + "\n\tdateValidation: " + dateValidation + "\n\tremise: " + remise + "\n}\n";
	}

}
