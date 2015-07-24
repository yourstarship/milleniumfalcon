package gal.cor.web.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

//Bean controller

@ManagedBean(name = "headerManagedBean")
@SessionScoped
public class HeaderManagedBean
{

	private Logger log = Logger.getLogger(HeaderManagedBean.class);

	@ManagedProperty(value = "#{informationsLogin}")
	private InformationsLogin infosLogin;

	public String retourAccueil()
	{
		return ("accueil.xhtml");
	}

	public String pasDeCompte()
	{
		return ("formulaireInscription.xhtml");
	}

	public String validerLogin()
	{

		log.info("HeaderManagerBean.validerLogin : Tentative de validation de la connexion de l'utilisateur : " + infosLogin.getLogin());

		if (infosLogin.getLogin().equals("admin") && infosLogin.getMotDePasse().equals("azerty"))
		{
			return ("compteAdministrateur.xhtml");
		} else
		{
			return ("compteUtilisateur.xhtml");
		}
	}

}
