package src.tp2;


public class Robot {
    
	public Bloc blocTenu;

    private Table table;
    
    
    
    // CONSTRUCTEUR

    public Robot(Table tab) {
    	this.table = tab;
    	
	}
    
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
    
    public void creerBloc(TailleBloc taille, String couleur) {
    	if (tenirBloc() == false ) {
    		Bloc b = new Bloc(taille,couleur,null);
        	this.blocTenu = b;
    	
		}
    	else {
			System.out.println("Le robot tient deja un bloc, par consequent  aucune action n'est effectuee.\n");

		}

    }

    public boolean tenirBloc() {
    	
    	if (this.blocTenu==null) {
    		return false;
		}
    	else {
			return true;
		}
    }
    public void detruireBloc() {
    	if (tenirBloc() == true ) {
    		this.blocTenu = null;
			System.out.println("Le bloc tenu a bien ete detruit ");
    	}
    	else {
			System.out.println("Le robot ne tient aucun bloc, par consequent aucune action n'est effectuee.\n");
		}	  
    }

    public void prendreBloc(TailleBloc taille, String couleur) {

    	
		// on verifie que le robot n'a pas de bloc dans son bras
    	if (tenirBloc() == false) {   
    		
    
    		     for (Bloc bloc : this.table.getSommets() ) {
    		    
    		        if (bloc.getTaille()==taille&&bloc.getCouleur().equals(couleur)) {		        	
    		        	this.table.ajouterSommet(bloc.getDessous());
    		        	bloc.setDessous(null);
    		        	this.blocTenu=bloc;
    		        	this.table.getSommets().remove(bloc);
    					System.out.println("Le robot a bien reussi a prendre le bloc souhaite\n");
    		        	break;
    		        }      
    		   }
 		     
    	}else {
			System.out.println("Le robot tient deja un bloc, par consequent aucune action n'est effectuee.\n");
		}   
    }

    public void poserBlocSurtable() {
    	if (tenirBloc() == true ) {
        	this.table.ajouterSommet(this.blocTenu);
    		this.blocTenu = null;
			System.out.println("Le bloc tenu a bien �t� pos� sur la table ");
			System.out.println("\nLa table contient " + this.table.nombreBlocSurTable() + "bloc(s)");
			
    	}
    	else {
			System.out.println("Le robot ne tient aucun bloc, par consequent aucune action n'est effectuee\n");
		}
    	

    }

    public void poserBlocSurBloc(TailleBloc taille, String couleur) {

    	if (tenirBloc() == true ) {
    		
    		 for (Bloc bloc : this.table.getSommets() ) {
 		        if (bloc.getTaille()==taille&&bloc.getCouleur().equals(couleur)) {
 		        	if (validerTaille(bloc.getTaille())) {
 		        		
						this.blocTenu.BlocDessous(bloc);
						this.table.supprimerSommet(bloc);
						this.table.ajouterSommet(this.blocTenu);
						this.blocTenu=null;
						System.out.println("Le bloc tenu a bien ete pose sur le bloc");
	 		        	break;
					}else {
						System.out.println("Le bloc tenu ne peut pas etre pose sur un bloc plus petit ou de meme taille");
					}
 		        	
 		        	
 		        }      
 		   }
    	
    	}

    }
    
    public boolean validerTaille(TailleBloc tailleBlocTable) {
    	
    	if (this.blocTenu.getTaille()==TailleBloc.petit && (tailleBlocTable==TailleBloc.moyen || tailleBlocTable==TailleBloc.grand)) {
			return true;
		}
    	else if (this.blocTenu.getTaille()==TailleBloc.moyen && tailleBlocTable==TailleBloc.grand ) {
			return true;
		}else {
			return false;
		}
    	
    	
    }

	public void afficherRobot() {
		if (blocTenu ==null) {
			System.out.println("Robot ne tient pas de bloc");
		}else {
			System.out.println("Robot tient: "+blocTenu);
		}
		

		
	}

}

