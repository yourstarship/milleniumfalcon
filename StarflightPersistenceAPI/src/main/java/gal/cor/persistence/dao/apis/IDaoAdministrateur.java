package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Administrateur;


public interface IDaoAdministrateur  {
	void creerAdministrateur(Administrateur t);
	Administrateur mettreAjourAdministrateur(Administrateur t);
	Administrateur rechercherParId(Administrateur t);


}
