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

    }

    public boolean tenirBloc() {
    	return false;
    }

    public void detruireBloc(Bloc blocTenu) {

    }

    public void prendreBloc(TailleBloc taille, String couleur) {

    }


    public void poserBloc(Bloc blocTenu) {

    }

    public void poserBlocSurBloc(TailleBloc taille, String couleur) {

    }

}

