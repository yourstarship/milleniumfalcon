package gal.cor.persistence.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LignePieceFournisseur implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private int quantite;
	private double remise;
	private double prixHt;

	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

	@ManyToOne
	@JoinColumn(name = "idProduit")
	private Produit produit;

	@ManyToOne
	@JoinColumn(name = "idFactureFournisseur")
	private FactureFournisseur factureFournisseur;

	public Integer getLCF()
	{
		return id;
	}

	public void setLCF(Integer id)
	{
		this.id = id;
	}

	public int getQuantite()
	{
		return quantite;
	}

	public void setQuantite(int quantite)
	{
		this.quantite = quantite;
	}

	public double getRemise()
	{
		return remise;
	}

	public void setRemise(double remise)
	{
		this.remise = remise;
	}

	public double getPrixHt()
	{
		return prixHt;
	}

	public void setPrixHt(double prixHt)
	{
		this.prixHt = prixHt;
	}

	public CommandeFournisseur getCommandeFournisseur()
	{
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur)
	{
		this.commandeFournisseur = commandeFournisseur;
	}

	public Produit getProduit()
	{
		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
	}

	public FactureFournisseur getFactureF()
	{
		return factureFournisseur;
	}

	public void setFactureF(FactureFournisseur factureF)
	{
		this.factureFournisseur = factureF;
	}

	public LignePieceFournisseur(Integer id, int quantite, double remise, double prixHt, CommandeFournisseur commandeFournisseur)
	{
		super();
		this.id = id;
		this.quantite = quantite;
		this.remise = remise;
		this.prixHt = prixHt;
		this.commandeFournisseur = commandeFournisseur;
	}

	public LignePieceFournisseur()
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

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tquantite: " + quantite + "\n\tremise: " + remise + "\n\tprixHt: " + prixHt + "\n}\n";
	}

}
