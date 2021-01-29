package src.tp2;

import java.io.*;

public enum TailleBloc
{
 grand, moyen, petit;
 
 public static TailleBloc getTaille(String taille) {
		for (TailleBloc t:TailleBloc.values())
			if (t.name().equalsIgnoreCase(taille))
				return t;		
		return TailleBloc.grand;
	}
	
}

