package gal.cor.web.managedbean;

import java.io.Serializable;

import gal.cor.persistence.entities.Personne;
import gal.cor.services.api.IServiceUtilisateur;

import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class GestionUtilisateurMBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4853825174991877791L;

	@Inject
	private IServiceUtilisateur gestionUtilisateur;
	
	@Inject
	private InformationLogin infosLogin;
	
	private Personne personne = null;
	
	public void connecter() throws Exception {

		Personne p = gestionUtilisateur.recherche(infosLogin.getEmail(), infosLogin.getMotDePasse());
	      if (p != null) {
	    	  //La personne existe
	         this.personne = p;
	         FacesContext.getCurrentInstance().addMessage(null,
	               new FacesMessage("Welcome, " + personne.getNom()));
	      }
	   }

	   public void deconnecter() {

	      FacesContext.getCurrentInstance().addMessage(null,

	            new FacesMessage("Goodbye, " + personne.getNom()));

	      personne = null;

	   }

	   public boolean estConnecte() {
	      return personne != null;
	   }

	   @Produces
	   //@LoggedIn
	   public Personne retournePersonne() {

	      return personne;

	   }

	   /*
	public IGestionUtilisateur getGestionUtilisateur() {
		return gestionUtilisateur;
	}

	public void setGestionUtilisateur(IGestionUtilisateur gestionUtilisateur) {
		this.gestionUtilisateur = gestionUtilisateur;
	}

	public InformationLogin getInfosLogin() {
		return infosLogin;
	}

	public void setInfosLogin(InformationLogin infosLogin) {
		this.infosLogin = infosLogin;
	}	
		*/
	
	
}
