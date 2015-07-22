package gal.cor.persistence.entities;

import java.util.Date;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CommandeFournisseur
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Date dateCreation;
	private Date dateSoldee;
	private Double remise;

	@ManyToOne
	@JoinColumn(name = "idFactureFournisseur")
	private FactureFournisseur factureFournisseur;

	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;

	@OneToMany(mappedBy = "commandeFournisseur")
	private Set<LignePieceFournisseur> lignesCommandeFournisseur;

	public CommandeFournisseur(Integer id, Date dateCreation, Date dateSoldee, Double remise)
	{
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateSoldee = dateSoldee;
		this.remise = remise;
	}

	public CommandeFournisseur()
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

	public Date getDateCreation()
	{
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation)
	{
		this.dateCreation = dateCreation;
	}

	public Date getDateSoldee()
	{
		return dateSoldee;
	}

	public void setDateSoldee(Date dateSoldee)
	{
		this.dateSoldee = dateSoldee;
	}

	public Double getRemise()
	{
		return remise;
	}

	public void setRemise(Double remise)
	{
		this.remise = remise;
	}

	public FactureFournisseur getFactureFournisseur()
	{
		return factureFournisseur;
	}

	public void setFactureFournisseur(FactureFournisseur factureFournisseur)
	{
		this.factureFournisseur = factureFournisseur;
	}

	public Fournisseur getFournisseur()
	{
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur)
	{
		this.fournisseur = fournisseur;
	}

	public Set<LignePieceFournisseur> getLignesCommandeFournisseur()
	{
		return lignesCommandeFournisseur;
	}

	public void setLignesCommandeFournisseur(Set<LignePieceFournisseur> lignesCommandeFournisseur)
	{
		this.lignesCommandeFournisseur = lignesCommandeFournisseur;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tdateCreation: " + dateCreation + "\n\tdateSoldee: " + dateSoldee + "\n\tremise: " + remise + "\n}\n";
	}

}
