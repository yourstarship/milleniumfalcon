package gal.cor.services.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import gal.cor.persistence.dao.apis.IDaoCarte;
import gal.cor.persistence.entities.Carte;
import gal.cor.services.api.IServiceCarte;

@Stateless
@Remote(IServiceCarte.class)
public class CarteServiceImpl implements IServiceCarte {
	
	@EJB
	private IDaoCarte proxyCarte;

	@Override
	public Carte recupereCarte(Integer idCarte) {
		
		return proxyCarte.rechercherParId(idCarte);
	}

	public IDaoCarte getProxyCarte() {
		return proxyCarte;
	}

	public void setProxyCarte(IDaoCarte proxyCarte) {
		this.proxyCarte = proxyCarte;
	}

	@Override
	public List<Carte> RechercheCartesParIdClient(Integer idClient) {
		// TODO Auto-generated method stub
		return proxyCarte.RechercheCartesParIdClient(idClient);
	}
	
	
	
	

}
