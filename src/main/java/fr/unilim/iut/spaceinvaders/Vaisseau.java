package fr.unilim.iut.spaceinvaders;


public class Vaisseau {

    Position origine;
    Dimension dimension;
    int vitesse;
    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur) {
        this(longueur, hauteur, 0, 0);
    }

    public Vaisseau(int longueur, int hauteur, int x, int y) {
        this.dimension = new Dimension(longueur, hauteur);
        this.origine = new Position (x,y);
    }

    public Vaisseau(Dimension dimension, Position positionOrigine){
     this(dimension, positionOrigine, 1);
    }


    public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
        this.dimension = dimension;
        this.origine = positionOrigine;
        this.vitesse = vitesse;
    }

    public boolean occupeLaPosition(int x, int y) {
        return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

    private boolean estOrdonneeCouverte(int y) {
        return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());
    }

    private boolean estAbscisseCouverte(int x) {
        return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
    }

    public int ordonneeLaPlusBasse() {
        return origine.ordonnee() - this.dimension.hauteur() + 1;
    }

    public int ordonneeLaPlusHaute() {
        return this.origine.ordonnee();
    }

    public int abscisseLaPlusADroite() {
        return this.origine.abscisse() + this.dimension.longueur() - 1;
    }

    public int abscisseLaPlusAGauche() {
        return this.origine.abscisse();
    }

    public void seDeplacerVersLaDroite() {
        this.origine.changerAbscisse(this.origine.abscisse() + vitesse);

    }

    public void seDeplacerVersLaGauche() {
        this.origine.changerAbscisse(this.origine.abscisse() - vitesse);

    }

    public void positionner(int x, int y) {
        this.origine.changerAbscisse(x);
        this.origine.changerOrdonnee(y);
    }

}
