package tp2;



public class Bloc {
	
    private String Couleur;
    private TailleBloc Taille;
    private Bloc dessous;


    // GETTERS ET SETTERS
    
    private String getCouleur() {
        return this.Couleur;
    }

    private void setCouleur(String value) {
        this.Couleur = value;
    }

   
    private TailleBloc getTaille() {
        return this.Taille;
    }

    private void setTaille(TailleBloc value) {
        this.Taille = value;
    }
    
	public Bloc getDessous() {
		return dessous;
	}

	public void setDessous(Bloc dessous) {
		this.dessous = dessous;
	}

/*
    Bloc getBloc() {

        return this.bloc;
    }

    void setBloc(Bloc value) {

        this.bloc = value;
    }
    */
    
    
    // Méthodes 

    public boolean suisJe(TailleBloc taille, String couleur) {
    	return true;

    }

    public void BlocDessous(Bloc bloc) {

    }



}
