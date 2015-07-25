package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="informationsLogin")
@SessionScoped
public class InformationsLogin {

	private String login;
	private String motDePasse;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String retourAccueil(){
		return ("accueil.xhtml");
	}
	
	public String pasDeCompte(){
		return ("formulaireInscription.xhtml");
	}
	
	
	
}
