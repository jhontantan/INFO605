package  src.tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {
	
    private List<Bloc> sommets = new ArrayList<Bloc> ();


    // GETTERS ET SETTERS
    
    List<Bloc> getSommets() {

        return this.sommets;

    }

    void setSommets(List<Bloc> value) {

        this.sommets = value;

    }
    
    // METHODES 

    public int nombreBlocSurTable() {
    	return this.sommets.size();	
	}

    
    public void supprimerSommet(Bloc bloc) {
    	this.sommets.remove(bloc);

    	
    }

    public void ajouterSommet(Bloc nouveauSommet) {
    	this.sommets.add(nouveauSommet);
    }


	public void afficherTable() {
    	sommets.removeAll(Collections.singleton(null));
		if (sommets.isEmpty()) {
	    	  System.out.println("Aucun bloc n'est sur la table");
		}else {
			System.out.println("Les blocs sur la table sont: ");
			for (Bloc bloc : sommets ) {
		    	  System.out.println(bloc);
		        }	
		}
			
	}

}

