package tp2;



public class Robot {
    
	public Bloc blocTenu;

    private Table table;

    
    // GETTERS ET SETTERS
    
    Bloc getBlocTenu() {

        return this.blocTenu;
    }

    void setBlocTenu(Bloc value) {

        this.blocTenu = value;
    }

    Table getTable() {

        return this.table;

    }

    void setTable(Table value) {

        this.table = value;
    }
    
    // METHODES 
    
    public void CreerBloc(TailleBloc taille, String couleur) {
    	Bloc b = new Bloc(couleur,taille,null);
   
    }

    public boolean tenirBloc() {
    	return false;
    }

    public void detruireBloc(Bloc blocTenu) {
    	if (tenirBloc() == true ) {
    		blocTenu = null;
    	}
    		  
    }

    public void prendreBloc(TailleBloc taille, String couleur) {

    	if (tenirBloc() == false) {    // on verifie que le robot n'a pas de bloc dans son bras
    		
    		// On regarde sur la table les caractéristiques du bloc que l'on cherche
    		//regardeBlocSurTable(Bloc(couleur, taille, null));
    		
    		// On demande au bloc s'il correspond bien
    		
    		// On met à jour le sommet
    		
    		// Le robot tient désormais un bloc dans son bras
    		//tenirBloc() = true;
    		
    	}
    
    }


    public void poserBloc(Bloc blocTenu) {

    }

    public void poserBlocSurBloc(TailleBloc taille, String couleur) {

    }

}

