package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.Categorie;


public interface IDaoCategorie  {
	void creerCategorie(Categorie t);

	Collection<Categorie> obtenirTousCategorie();
}
