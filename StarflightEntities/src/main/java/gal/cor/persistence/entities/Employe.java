package gal.cor.persistence.entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "employe")
public class Employe extends Personne implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "idfournisseur")
	private Fournisseur employeur;

	public Employe()
	{
		super();
	}

	public Fournisseur getEmployeur()
	{
		return employeur;
	}

	public void setEmployeur(Fournisseur employeur)
	{
		this.employeur = employeur;
	}

}
