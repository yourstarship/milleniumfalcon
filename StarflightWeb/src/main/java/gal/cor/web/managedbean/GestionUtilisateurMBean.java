package gal.cor.web.managedbean;

import java.io.Serializable;

import gal.cor.persistence.entities.Client;
import gal.cor.services.api.IServiceClient;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

@ManagedBean(name="gestionUtilisateurMBean")
@SessionScoped
public class GestionUtilisateurMBean implements Serializable {
	
	private static final long serialVersionUID = 4853825174991877791L;

	private Logger log = Logger.getLogger(GestionUtilisateurMBean.class);

	@EJB
	private IServiceClient serviceClient;

	@ManagedProperty(value="#{informationsLogin}")
	private InformationsLogin infosLogin;
	
	private String pageRetournee = "pageErreur.xhtml";
	private Client client = null;

	//Méthode appelée lorsque l'utilisateur appuie sur le bouton OK de la connexion
	public String connecter(){

	
		log.info( ": Connexion de l'utilisateur : " + infosLogin.getLogin());

		if (infosLogin.getLogin().equals("") || infosLogin.getMotDePasse().equals("")) {
			
			log.info(this.getClass() + ": Les infos de login sont vides !!! : " + infosLogin.getLogin());
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Les informations de login sont incorrectes, "));
			
			pageRetournee = "accueil.xhtml";
			
		} else {

			if (!estConnecte()) {
				
				log.info(infosLogin.getLogin());
				client = serviceClient.clientExiste(infosLogin.getLogin(), infosLogin.getMotDePasse());
				
				if (client != null) {
					//Le client existe
					log.info(this.getClass() + " Client connecté :" + client.getNom());
					FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Welcome, " + client.getNom()));
					pageRetournee = "";
				} else {
					
					//Le Client n'existe pas
					log.info(this.getClass() + ": Le Client n'existe pas, retourne à l'accueil : " + infosLogin);
					pageRetournee = "accueil.xhtml";
				}
				
			}
		}

		return pageRetournee;
	}

	public String deconnecter() {

		 FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			

		return "accueil.xhtml";
	}


	public String affichePageInscriptionClient() {
		log.info(this.getClass() + ": Affichage formulaire de création d'un compte.");
	
		return "formulaireInscription3.xhtml";
		
	}

	public boolean estConnecte() {
		return client != null;
	}

	public IServiceClient getServiceClient() {
		return serviceClient;
	}

	public void setServiceClient(IServiceClient serviceClient) {
		this.serviceClient = serviceClient;
	}

	public InformationsLogin getInfosLogin() {
		return infosLogin;
	}

	public void setInfosLogin(InformationsLogin infosLogin) {
		this.infosLogin = infosLogin;
	}

	public Client getClient() {
		return client;
	}

}
