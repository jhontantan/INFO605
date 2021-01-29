package tp2;



public class Bloc {
    private String Couleur;

    private String getCouleur() {
        return this.Couleur;
    }

    private void setCouleur(String value) {
        this.Couleur = value;
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

    public boolean suisJe(TailleBloc taille, String couleur) {

    }

    public void BlocDessous(Bloc bloc) {

    }

}
