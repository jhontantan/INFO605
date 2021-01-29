package tp2;



public class Bloc {
	
	private Integer Numero;
    private String Couleur;
    private TailleBloc Taille;
    private Bloc dessous;

    public static Integer NUMERO = 0;
    
    // CONSTRUCTEUR
    
    public Bloc(String pCouleur, TailleBloc pTaille, Bloc pdessous ) {
    	this.Numero = NUMERO++;
    	this.Couleur = pCouleur;
    	this.Taille = pTaille;
    	this.dessous = pdessous;
    }
    

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
	
	public Integer getNumero() {
		return Numero;
	}


/*
    Bloc getBloc() {

        return this.bloc;
    }

    void setBloc(Bloc value) {

        this.bloc = value;
    }
    */
    
    
    // METHODES 

    public boolean suisJe(TailleBloc taille, String couleur) {
    	if (this.Couleur == couleur && this.Taille == taille)
    		return true;
    	else
    		return false;
    	

    }

    public void BlocDessous(Bloc bloc) {

    }





}
