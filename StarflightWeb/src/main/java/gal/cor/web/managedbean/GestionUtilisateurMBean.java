package gal.cor.web.managedbean;

import java.io.Serializable;

import gal.cor.persistence.entities.Client;
import gal.cor.services.api.IServiceClient;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class GestionUtilisateurMBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4853825174991877791L;

	@EJB
	private IServiceClient serviceClient;

	@ManagedProperty(value="#{informationsLogin}")
	private InformationsLogin infosLogin;

	private Client client = null;

	public String connecter() throws Exception {

		String pageRetournee = "pageErreur.xhtml";
		
		if (!estConnecte()) {
			Client c = serviceClient.clientExiste(infosLogin.getLogin(), infosLogin.getMotDePasse());
			if (c != null) {
				//Le client existe
				this.client = c;
				FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Welcome, " + client.getNom()));
				pageRetournee = "compteUtilisateur.xhtml";
			} else {
				//Le Client n'existe pas
				pageRetournee = "accueil.xhtml";
			}
		}
		
		return pageRetournee;
	}

	public void deconnecter() {

		FacesContext.getCurrentInstance().addMessage(null,

				new FacesMessage("Goodbye, " + client.getNom()));

		client = null;

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
