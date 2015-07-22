package gal.cor.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import gal.cor.persistence.dao.apis.IDaoPersonne;
import gal.cor.persistence.entities.Personne;
import gal.cor.services.api.IServiceUtilisateur;

@Stateful
public class GestionUtilisateur implements IServiceUtilisateur {

	@EJB //injection de dependance
	private IDaoPersonne daoPersonne;
	
	@EJB //
	//private 
	
	@Override
	public List<Personne> listeUtilisateurs() throws Exception {
		return daoPersonne.obtenirTous();
	}

	@Override
	public String ajouteClient() throws Exception {
		Personne t = null;//TODO !!
		daoPersonne.creerPersonne(t);
		return null;
	}

	@Override
	public String ajouteMilitaire() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne recherche(String nom, String motDePasse) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne creer() {
		// TODO Auto-generated method stub
		return null;
	}
}
