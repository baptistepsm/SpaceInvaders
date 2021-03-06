package fr.unilim.iut.spaceinvaders;

public abstract class Sprite {
    Position origine;
    Dimension dimension;
    int vitesse;
    int longueur;
    int hauteur;

    public Sprite(Dimension dimension, Position origine, int vitesse) {
        super();
        this.dimension = dimension;
        this.origine = origine;
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
        return ordonneeLaPlusHaute() - this.dimension.hauteur() + 1;
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


    public void deplacerHorizontalementVers(Direction direction) {
        this.origine.changerAbscisse(this.origine.abscisse() + direction.valeur()*vitesse);
    }

    public void deplacerVerticalementVers(Direction direction) {
        this.origine.changerOrdonnee(this.origine.ordonnee() + direction.valeur() * vitesse);
    }

    public void positionner ( int x, int y){
        this.origine.changerAbscisse(x);
        this.origine.changerOrdonnee(y);
    }

}
