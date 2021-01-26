package tp2;


public class Bloc {
	
	  private static Couleur Couleur;
	  
	  public enum Couleur
	  {
	   rouge, vert, jaune, bleu, violet, cyan, gris, noir;
	   
	   public static Couleur getCouleur(String coulSaisie) {
	  		for (Couleur c:Couleur.values())
	  			if (c.name().equalsIgnoreCase(coulSaisie))
	  				return c;		
	  		return Couleur.rouge;
	  	}

	   
	  public static void testCouleur() {
	  	for (Couleur c:Couleur.values())
	  		Monde.ecrire(c,"test couleur");	
	      }
	  


	    private TailleBloc Taille;

	    private TailleBloc getTaille() {
	        return this.Taille;
	    }

	    private void setTaille(TailleBloc value) {
	        this.Taille = value;
	    }

	    private Bloc dessous;

	    Bloc getBloc() {

	        return this.bloc;
	    }

	    void setBloc(Bloc value) {
	        this.bloc = value;
	    }

	    public Bloc attraperBloc(Bloc blocSouhaite) {
	
	    }

	    public void lacherBloc(Bloc blocTenu) {

	    }


}
