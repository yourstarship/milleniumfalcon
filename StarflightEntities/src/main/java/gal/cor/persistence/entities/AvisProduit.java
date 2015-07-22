package gal.cor.persistence.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AvisProduit
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String titre;
	private String commentaire;
	private Integer note;
	private Date dateAvis;

	@ManyToOne
	@JoinColumn(name = "idproduit")
	private Produit produit;
	@ManyToOne
	@JoinColumn(name = "idclient")
	private Client client;

	public AvisProduit(Integer id, String titre, String commentaire, Integer note, Date dateAvis)
	{
		super();
		this.id = id;
		this.titre = titre;
		this.commentaire = commentaire;
		this.note = note;
		this.dateAvis = dateAvis;
	}

	public AvisProduit()
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

	public String getTitre()
	{
		return titre;
	}

	public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public String getCommentaire()
	{
		return commentaire;
	}

	public void setCommentaire(String commentaire)
	{
		this.commentaire = commentaire;
	}

	public Integer getNote()
	{
		return note;
	}

	public void setNote(Integer note)
	{
		this.note = note;
	}

	public Date getDateAvis()
	{
		return dateAvis;
	}

	public void setDateAvis(Date dateAvis)
	{
		this.dateAvis = dateAvis;
	}

	public Produit getProduit()
	{
		return produit;
	}

	public void setProduit(Produit produit)
	{
		this.produit = produit;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\ttitre: " + titre + "\n\tcommentaire: " + commentaire + "\n\tnote: " + note + "\n\tdateAvis: " + dateAvis + "\n}\n";
	}

}
