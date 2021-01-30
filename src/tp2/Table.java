package  src.tp2;

import java.util.ArrayList;
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
    
    public Bloc prendreBloc(Bloc b) {
    	return b;
    	
    }

    public int nombreBlocSurTable() {
    	return this.sommets.size();	
	}
    public Bloc regardeBlocSurTable(Bloc b) {
    	
    	
    	return b;
    }

    public boolean verifierEspace() {
    	return true;
    }


    public void trouveBlocPlusGrand(TailleBloc taille) {

    }

    public void supprimerSommet(Bloc bloc) {
    	//this.sommets.remove(bloc.getNumero());
    }

    public void ajouterSommet(Bloc nouveauSommet) {
    	this.sommets.add(nouveauSommet);
    }

    public Bloc regardeSommet(Bloc b) {
    	return b;
    }

    public void poserBlocSurBloc(TailleBloc taille, String couleur, Bloc blocTenu) {

    }

    public void poserBlocSurTable(Bloc bloc) {

    }

	public void afficherTable() {
		
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

