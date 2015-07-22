package gal.cor.persistence.dao.apis;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import gal.cor.persistence.entities.CommandeFournisseur;

public interface IDaoCommandeFournisseur extends IDaoGeneric<CommandeFournisseur> {
	void creerCommandeFournisseur(CommandeFournisseur t);
	void supprimerCommandeFournisseur(CommandeFournisseur t);
	CommandeFournisseur mettreAjourCommandeFournisseur(CommandeFournisseur t);
	CommandeFournisseur rechercherParId(CommandeFournisseur t);

	//Requetes personnalisées
	List<CommandeFournisseur> rechercherParRequeteNommee(String requeteNommee);
	List<CommandeFournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres,int nbreMaxElements);
	List<CommandeFournisseur> rechercherParRequeteNommee(String requeteNommee, Map<String,Object> parametres);
	List<CommandeFournisseur> rechercherParRequeteNommee(String requeteNommee, int nbreMaxElements);

	Collection<CommandeFournisseur> obtenirTousCommandeFournisseur();
}
