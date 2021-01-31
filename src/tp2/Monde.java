package  src.tp2;


import in.keyboard.Keyboard;

public class Monde {
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
		Table tab = new Table();
		Robot D2R2 = new Robot(tab);
		char c = ' ';
		do {
		System.out.println("1 - creer un bloc");
		System.out.println("2 - d�truire un bloc");
		System.out.println("3 - prendre un bloc");
		System.out.println("4 - poser un bloc sur la table");
		System.out.println("5 - poser un bloc sur un autre bloc");
		System.out.println("6 - Afficher Monde");

		System.out.println("f - fin du monde");
		System.out.println("9 - Bloc grand - rouge");

		System.out.print("Votre choix : ");
		c = Keyboard.getChar();
		switch (c) {
		case '1': 
			System.out.print("Couleur du bloc : ");
			String couleur = Keyboard.getString();
			System.out.print("Taille (grand/moyen/petit) : ");
			TailleBloc tailleBloc = TailleBloc.getTaille(Keyboard.getString());		
			D2R2.creerBloc(tailleBloc, couleur);
			break;
		case '2':
			System.out.println("Le bloc tenu par le robot va �tre d�truit ");
			D2R2.detruireBloc();
			break;
		
		case '3':
			System.out.print("Couleur du bloc : ");
			String couleur1 = Keyboard.getString();
			System.out.print("Taille (grand/moyen/petit) : ");
			TailleBloc tailleBloc1 = TailleBloc.getTaille(Keyboard.getString());		
			D2R2.prendreBloc(tailleBloc1, couleur1);
			break;
		
		case '4':
			D2R2.poserBlocSurtable();
		
		break;
		case '5':
			System.out.println("Vous voulez poser votre bloc sur un bloc :\n");
			System.out.print("Couleur : ");
			String couleur2 = Keyboard.getString();
			System.out.print("Taille (grand/moyen/petit) : ");
			TailleBloc tailleBloc2 = TailleBloc.getTaille(Keyboard.getString());	
			D2R2.poserBlocSurBloc(tailleBloc2, couleur2);
			
			break;
		case '6':
			afficherMonde(D2R2, tab);			
			break;
		case '9':
			System.out.println(" ");
			D2R2.creerBloc(TailleBloc.getTaille("grand"), "rouge");
		break;
		}
		
		afficherMonde(D2R2, tab);
		} while (c != 'f');
	}

	private static void afficherMonde(Robot R, Table T) {
		System.out.printf("\n Etat du monde : \n ");
		R.afficherRobot();
		T.afficherTable();
	
	}
	

	
	
	
}
