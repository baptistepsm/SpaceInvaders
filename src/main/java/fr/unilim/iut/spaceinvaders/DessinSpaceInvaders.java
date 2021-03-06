package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurJeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

    private SpaceInvaders jeu;

    public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
        this.jeu = spaceInvaders;
    }

    @Override
    public void dessiner(BufferedImage im) {
        if (this.jeu.aUnVaisseau()) {
            Vaisseau vaisseau = this.jeu.recupererVaisseau();
            this.dessinerUnVaisseau(vaisseau, im);
        }

        if (this.jeu.aUnMissile()) {
            Missile missile = this.jeu.recupererMissile();
            this.dessinerUnMissile(missile, im);
        }
    }

    private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
        Graphics2D crayon = (Graphics2D) im.getGraphics();

        crayon.setColor(Color.gray);
        crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(), vaisseau.dimension.longueur(),
                vaisseau.dimension.hauteur());

    }

    private void dessinerUnMissile(Missile missile, BufferedImage im) {
        Graphics2D crayon = (Graphics2D) im.getGraphics();

        crayon.setColor(Color.blue);
        crayon.fillRect(missile.abscisseLaPlusAGauche(), missile.ordonneeLaPlusBasse(), missile.dimension.longueur(),
                missile.dimension.hauteur());

    }

}