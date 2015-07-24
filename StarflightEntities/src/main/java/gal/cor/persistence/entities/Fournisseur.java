package gal.cor.persistence.entities;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String raisonSociale;
	private String codeGalactique;
	private String www;
	private String mail;
	private String telephone;

	@OneToMany(mappedBy = "fournisseur")
	private Set<CommandeFournisseur> commandesFournisseurs = new LinkedHashSet<>();

	@OneToMany(mappedBy = "employeur")
	private Set<Employe> employes = new LinkedHashSet<>();

	@OneToMany(mappedBy = "constructeur")
	private Set<Produit> produits = new LinkedHashSet<>();

	public Fournisseur(Integer id, String raisonSociale, String codeGalactique, String www, String mail, String telephone)
	{
		super();
		this.id = id;
		this.raisonSociale = raisonSociale;
		this.codeGalactique = codeGalactique;
		this.www = www;
		this.mail = mail;
		this.telephone = telephone;
	}

	public Fournisseur()
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

	public String getRaisonSociale()
	{
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale)
	{
		this.raisonSociale = raisonSociale;
	}

	public String getCodeGalactique()
	{
		return codeGalactique;
	}

	public void setCodeGalactique(String codeGalactique)
	{
		this.codeGalactique = codeGalactique;
	}

	public String getWww()
	{
		return www;
	}

	public void setWww(String www)
	{
		this.www = www;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public String getTelephone()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	public Set<CommandeFournisseur> getCommandesFournisseurs()
	{
		return commandesFournisseurs;
	}

	public void setCommandesFournisseurs(Set<CommandeFournisseur> commandesFournisseurs)
	{
		this.commandesFournisseurs = commandesFournisseurs;
	}

	public Set<Employe> getEmployes()
	{
		return employes;
	}

	public void setEmployes(Set<Employe> employes)
	{
		this.employes = employes;
	}

	public Set<Produit> getProduits()
	{
		return produits;
	}

	public void setProduits(Set<Produit> produits)
	{
		this.produits = produits;
	}

	@Override
	public String toString()
	{
		return "\n\n" + getClass().getName() + " {\n\tid: " + id + "\n\traisonSociale: " + raisonSociale + "\n\tcodeGalactique: " + codeGalactique + "\n\twww: " + www + "\n\tmail: " + mail + "\n\ttelephone: " + telephone + "\n}\n";
	}

}
