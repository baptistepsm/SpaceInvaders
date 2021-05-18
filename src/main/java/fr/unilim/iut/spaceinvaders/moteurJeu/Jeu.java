package fr.unilim.iut.spaceinvaders.moteurJeu;

public interface Jeu {

    public void evoluer(Commande commandeUser);

    public boolean etreFini();
}
