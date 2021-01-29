package tp2;

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

    public Bloc regardeBlocSurTable(Bloc b) {
    	return b;
    }

    public boolean verifierEspace() {
    	return true;
    }


    public void trouveBlocPlusGrand(TailleBloc taille) {

    }

    public void supprimerSommet(Bloc bloc) {

    }

    public void ajouterSommet(Bloc nouveauSommet) {

    }

    public Bloc regardeSommet(Bloc b) {
    	return b;
    }

    public void poserBlocSurBloc(TailleBloc taille, String couleur, Bloc blocTenu) {

    }

    public void poserBlocSurTable(Bloc bloc) {

    }

}

