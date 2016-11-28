package gal.cor.services.api;

import java.util.List;

import gal.cor.persistence.entities.Carte;

public interface IServiceCarte {
	Carte recupereCarte(Integer idCarte);
	List<Carte> RechercheCartesParIdClient(Integer idClient);

}
