package gal.cor.persistence.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LignePieceClient implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer quantite;
	private Double remise;
	private Double prixHT;

	@ManyToOne
	@JoinColumn(name = "idproduit")
	private Produit produit;

	@ManyToOne
	@JoinColumn(name = "idcommande")
	private CommandeClient commandeClient;

	@ManyToOne
	@JoinColumn(name = "idfacture")
	private FactureClient factureClient;

	@ManyToOne
	@JoinColumn(name = "idavoir")
	private AvoirClient avoirClient;

	public LignePieceClient(Integer id, Integer quantite, Double remise, Double prixHT, Produit produit, CommandeClient commande, FactureClient facture, AvoirClient avoir)
	{
		super();
		this.id = id;
		this.quantite = quantite;
		this.remise = remise;
		this.prixHT = prixHT;
		this.produit = produit;
		this.commandeClient = commande;
		this.factureClient = facture;
		this.avoirClient = avoir;
	}

	public LignePieceClient(Integer id, Integer quantite, Double remise, Double prixHT)
	{
		super();
		this.id = id;
		this.quantite = quantite;
		this.remise = remise;
		this.prixHT = prixHT;
	}

	public LignePieceClient()
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

	public Integer getQuantite()
	{
		return quantite;
	}

	public void setQuantite(Integer quantite)
	{
		this.quantite = quantite;
	}

	public Double getRemise()
	{
		return remise;
	}

	public void setRemise(Double remise)
	{
		this.remise = remise;
	}

	public Double getPrixHT()
	{
		return prixHT;
	}

	public void setPrixHT(Double prixHT)
	{
		this.prixHT = prixHT;
	}

	public Produit getProduit()
	{
		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
	}

	public CommandeClient getCommandeClient()
	{
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient)
	{
		this.commandeClient = commandeClient;
	}

	public FactureClient getFactureClient()
	{
		return factureClient;
	}

	public void setFactureClient(FactureClient factureClient)
	{
		this.factureClient = factureClient;
	}

	public AvoirClient getAvoirClient()
	{
		return avoirClient;
	}

	public void setAvoirClient(AvoirClient avoirClient)
	{
		this.avoirClient = avoirClient;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tquantite: " + quantite + "\n\tremise: " + remise + "\n\tprixHT: " + prixHT + "\n}\n";
	}

}
