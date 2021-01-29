package src.tp2;

import java.util.Iterator;

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
    		b.afficherBloc(b);
		}
    	else {
			System.out.println("Le robot tient déjà un bloc, par conséquent aucune action n'est effectuée.\n");

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
    //Changer diagrame de classe @param bloc
    public void detruireBloc() {
    	if (tenirBloc() == true ) {
    		this.blocTenu = null;
			System.out.println("Le bloc tenu a bien été détruit ");
    	}
    	else {
			System.out.println("Le robot ne tient aucun bloc, par conséquent aucune action n'est effectuee\n");
		}	  
    }

    public void prendreBloc(TailleBloc taille, String couleur) {
		// on verifie que le robot n'a pas de bloc dans son bras
    	if (tenirBloc() == false) {   
    		
    		// On regarde sur la table les caractéristiques du bloc que l'on cherche
    		for(int i=0;i<=this.table.getSommets().size();i++) {
    			if (this.table.getSommets().get(i)) {
					
				}
    			
    		}
    		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
				type type = (type) iterator.next();
				
			}
    		//regardeBlocSurTable(Bloc(couleur, taille, null));
    		
    		// On demande au bloc s'il correspond bien
    		
    		// On met à jour le sommet
    		
    		// Le robot tient désormais un bloc dans son bras
    		//tenirBloc() = true;
    		
    	}
    
    }

    //Changer diagrame de classe @param bloc

    public void poserBloc() {
    	if (tenirBloc() == true ) {
        	this.table.ajouterSommet(this.blocTenu);
    		this.blocTenu = null;
			System.out.println("Le bloc tenu a bien été posé sur la table ");
			System.out.println("\nLa table contient " + this.table.nombreBlocSurTable() + "bloc(s)");

			
    	}
    	else {
			System.out.println("Le robot ne tient aucun bloc, par conséquent aucune action n'est effectuee\n");
		}
    	

    }

    public void poserBlocSurBloc(TailleBloc taille, String couleur) {

    }

}

