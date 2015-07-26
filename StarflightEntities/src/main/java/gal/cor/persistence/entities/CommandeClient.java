package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CommandeClient implements Serializable
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
	private Date dateAnnulation;
	private Date dateDerniereTentativePaiement;
	private Date datePaiementAccepte;
	private Date dateSoldee;
	private Date dateEnvoi;

	@ManyToOne
	@JoinColumn(name = "idcarte")
	private Carte carte;

	@ManyToOne
	@JoinColumn(name = "idclient")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "idfacture")
	private FactureClient factureClient;

	@OneToMany(mappedBy = "commandeClient")
	private Set<LignePieceClient> lignesPieceClient = new LinkedHashSet<LignePieceClient>();

	@ManyToOne
	@JoinColumn(name = "idtva")
	private TVA tva;

	public CommandeClient(Integer id, Double remise, Date dateCreation, Date dateAnnulation, Date dateDerniereTentativePaiement, Date datePaiementAccepte, Date dateSoldee, Date dateEnvoi, Carte carte, Client client, FactureClient factureClient)
	{
		super();
		this.id = id;
		this.remise = remise;
		this.dateCreation = dateCreation;
		this.dateAnnulation = dateAnnulation;
		this.dateDerniereTentativePaiement = dateDerniereTentativePaiement;
		this.datePaiementAccepte = datePaiementAccepte;
		this.dateSoldee = dateSoldee;
		this.dateEnvoi = dateEnvoi;
		this.carte = carte;
		this.client = client;
		this.factureClient = factureClient;
	}

	public CommandeClient(Integer id, Double remise, Date dateCreation, Date dateAnnulation, Date dateDerniereTentativePaiement, Date datePaiementAccepte, Date dateSoldee, Date dateEnvoi)
	{
		super();
		this.id = id;
		this.remise = remise;
		this.dateCreation = dateCreation;
		this.dateAnnulation = dateAnnulation;
		this.dateDerniereTentativePaiement = dateDerniereTentativePaiement;
		this.datePaiementAccepte = datePaiementAccepte;
		this.dateSoldee = dateSoldee;
		this.dateEnvoi = dateEnvoi;
	}

	public CommandeClient()
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

	public Date getDateAnnulation()
	{
		return dateAnnulation;
	}

	public void setDateAnnulation(Date dateAnnulation)
	{
		this.dateAnnulation = dateAnnulation;
	}

	public Date getDateDerniereTentativePaiement()
	{
		return dateDerniereTentativePaiement;
	}

	public void setDateDerniereTentativePaiement(Date dateDerniereTentativePaiement)
	{
		this.dateDerniereTentativePaiement = dateDerniereTentativePaiement;
	}

	public Date getDatePaiementAccepte()
	{
		return datePaiementAccepte;
	}

	public void setDatePaiementAccepte(Date datePaiementAccepte)
	{
		this.datePaiementAccepte = datePaiementAccepte;
	}

	public Date getDateSoldee()
	{
		return dateSoldee;
	}

	public void setDateSoldee(Date dateSoldee)
	{
		this.dateSoldee = dateSoldee;
	}

	public Date getDateEnvoi()
	{
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi)
	{
		this.dateEnvoi = dateEnvoi;
	}

	public Carte getCarte()
	{
		return carte;
	}

	public void setCarte(Carte carte)
	{
		this.carte = carte;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public FactureClient getFacture()
	{
		return factureClient;
	}

	public void setFacture(FactureClient facture)
	{
		this.factureClient = facture;
	}

	public FactureClient getFactureClient()
	{
		return factureClient;
	}

	public void setFactureClient(FactureClient factureClient)
	{
		this.factureClient = factureClient;
	}

	public Set<LignePieceClient> getLignesPieceClient()
	{
		return lignesPieceClient;
	}

	public void setLignesPieceClient(Set<LignePieceClient> lignesPieceClient)
	{
		this.lignesPieceClient = lignesPieceClient;
	}

	public TVA getTva()
	{
		return tva;
	}

	public void setTva(TVA tva)
	{
		this.tva = tva;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\tremise: " + remise + "\n\tdateCreation: " + dateCreation + "\n\tdateAnnulation: " + dateAnnulation + "\n\tdateDerniereTentativePaiement: " + dateDerniereTentativePaiement + "\n\tdatePaiementAccepte: " + datePaiementAccepte + "\n\tdateSoldee: " + dateSoldee + "\n\tdateEnvoi: " + dateEnvoi + "\n}\n";
	}

}
