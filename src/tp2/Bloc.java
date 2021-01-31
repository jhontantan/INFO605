package src.tp2;

public class Bloc {
	
	private Integer numero;
    private String couleur;
    private TailleBloc taille;
    private Bloc dessous;

    public static Integer NUMERO = 0;
    
    // CONSTRUCTEUR
    
    public Bloc(TailleBloc pTaille, String pCouleur, Bloc pdessous ) {
    	this.numero = NUMERO++;
    	this.couleur = pCouleur;
    	this.taille = pTaille;
    	this.dessous = pdessous;
    }
    

    // GETTERS ET SETTERS
    
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String value) {
        this.couleur = value;
    }

   
    public TailleBloc getTaille() {
        return this.taille;
    }

    public void setTaille(TailleBloc value) {
        this.taille = value;
    }
    
	public Bloc getDessous() {
		return dessous;
	}

	public void setDessous(Bloc dessous) {
		this.dessous = dessous;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public boolean equals(Object obj) {
        if(obj != null) {
              if(obj instanceof Bloc) {
            	  Bloc bloc = (Bloc) obj;
            	  return this.numero == bloc.numero; 
            	  
              }
        }
        return false;
    }

    // METHODES 

    public boolean suisJe(TailleBloc taille, String couleur) {
    	if (this.couleur == couleur && this.taille == taille)
    		return true;
    	else
    		return false;
    	
    }

    public void BlocDessous(Bloc bloc) {
    	this.dessous=bloc;
    }

    
	@Override
	public String toString() {
		return "Bloc [couleur=" + couleur + ", taille=" + taille + ", dessous=" + dessous + "]";
	}


}
