package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Civilite;


public interface IDaoCivilite  {
	void creerCivilite(Civilite t);
	List<Civilite> obtenirTousCivilite();
}
