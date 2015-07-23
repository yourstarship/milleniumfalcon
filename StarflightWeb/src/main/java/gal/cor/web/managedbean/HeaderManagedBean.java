package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="headerManagedBean")
public class HeaderManagedBean {
	
	/****************************/
	/***** [ D�clarations ] *****/
	/****************************/
	
	private String login;
	private String password;
	
	/************************/
	/***** [ M�thodes ] *****/
	/************************/
	
	/***** [ Fonctions ] *****/
	
	public String retourAccueil(){
		return ("accueil.xhtml");
	}
	
	public String pasDeCompte(){
		return ("formulaireInscription.xhtml");
	}
	
	public String accesCompteUtilisateur(){
		System.out.println("j'entre");
		if(login.equals("admin") && password.equals("azerty"))
		{
			return ("compteAdministrateur.xhtml");
		}
		else
		{
			return ("compteUtilisateur.xhtml");
		}
	}

	/***** [ Getter & Setter ] *****/
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
