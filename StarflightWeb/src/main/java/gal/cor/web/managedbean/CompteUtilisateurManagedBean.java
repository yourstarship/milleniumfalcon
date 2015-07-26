package gal.cor.web.managedbean;

import gal.cor.persistence.entities.Adresse;
import gal.cor.persistence.entities.Carte;
import gal.cor.persistence.entities.Civilite;
import gal.cor.persistence.entities.Client;
import gal.cor.persistence.entities.CommandeClient;
import gal.cor.persistence.entities.Personne;
import gal.cor.persistence.entities.Utilisateur;
import gal.cor.services.api.IClientService;
import gal.cor.services.api.ICommandeClientService;
import gal.cor.services.api.IServiceCarte;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

@ManagedBean (name="compteUtilisateurMBean")
@SessionScoped
public class CompteUtilisateurManagedBean {
	
	private  static Logger log = Logger.getLogger(CompteUtilisateurManagedBean.class);
	
	@ManagedProperty(value="#{gestionUtilisateurMBean}")
	private GestionUtilisateurMBean gestion;
	
	@EJB
	private IClientService proxyClientService;
	
	@EJB
	private IServiceCarte proxyCarte;
	
	@EJB
	private ICommandeClientService proxyCommandeClient;

/*******************ATTRIBUTS***************************************************************************************/
	private Client client = new Client();
	private Adresse adresse = new Adresse();
	
	
	private List<CommandeClient>commandesClients = new ArrayList<CommandeClient>();
	private List<Carte>cartes;
	private List<Adresse>adresses = new ArrayList<Adresse>();
	
/*******************METHODES***************************************************************************************/
	

	@PostConstruct
	public void renseignerUtilisateur(){	
		client = proxyClientService.rechercherParClientId(gestion.getClient().getId());
		cartes= proxyCarte.RechercheCartesParIdClient(client.getId());	
		commandesClients=proxyCommandeClient.recupeCommandesParClient(client.getId());
		
		
	
	
	}
		


	public String accesDetailPanier(){
		return ("affichageDetailPanier.xhtml");
	}

	public String validerLaCommande(){
		return ("compteUtilisateur.xhtml");
	}

/*******************GETTER/SETTER***************************************************************************************/

	public GestionUtilisateurMBean getGestion() {
		return gestion;
	}




	public void setGestion(GestionUtilisateurMBean gestion) {
		this.gestion = gestion;
	}




	public IClientService getProxyClientService() {
		return proxyClientService;
	}




	public void setProxyClientService(IClientService proxyClientService) {
		this.proxyClientService = proxyClientService;
	}




	public IServiceCarte getProxyCarte() {
		return proxyCarte;
	}




	public void setProxyCarte(IServiceCarte proxyCarte) {
		this.proxyCarte = proxyCarte;
	}




	public Client getClient() {
		return client;
	}




	public void setClient(Client client) {
		this.client = client;
	}




	public Adresse getAdresse() {
		return adresse;
	}




	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}




	public List<CommandeClient> getCommandesClients() {
		return commandesClients;
	}




	public void setCommandesClients(List<CommandeClient> commandesClients) {
		this.commandesClients = commandesClients;
	}




	public List<Carte> getCartes() {
		return cartes;
	}




	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}




	public List<Adresse> getAdresses() {
		return adresses;
	}




	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}



	public ICommandeClientService getProxyCommandeClient() {
		return proxyCommandeClient;
	}



	public void setProxyCommandeClient(ICommandeClientService proxyCommandeClient) {
		this.proxyCommandeClient = proxyCommandeClient;
	}

	
	

}
