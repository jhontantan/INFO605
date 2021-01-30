package src.tp2;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

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
    	List<Bloc> sommets = this.table.getSommets();
		// on verifie que le robot n'a pas de bloc dans son bras
    	if (tenirBloc() == false) {   
    		
    
    		     for (Bloc bloc : sommets ) {
    		        // Probleme sur la couleur à regarder apres
    		        if (bloc.getTaille()==taille) {
    		        	sommets.add(bloc.getDessous());
    		        	bloc.setDessous(null);
    		        	this.blocTenu=bloc;
    		        	sommets.remove(bloc);
    		        	break;
    		        }      
    		   }
    		     	//aficher info 
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
    	List<Bloc> sommets = this.table.getSommets();

    	if (tenirBloc() == true ) {
    		
    		 for (Bloc bloc : sommets ) {
 		        // Probleme sur la couleur à regarder apres
 		        if (bloc.getTaille()==taille) {
 		        	if (validerTaille(bloc.getTaille())) {
 		        		
						this.blocTenu.BlocDessous(bloc);
						sommets.remove(bloc);
						sommets.add(blocTenu);
						this.blocTenu=null;
						System.out.println("Le bloc tenu a bien été posé sur le bloc");
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

