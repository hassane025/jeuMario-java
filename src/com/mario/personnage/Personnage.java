package com.mario.personnage;

import com.mario.jeu.Main;

import javax.swing.*;
import java.awt.*;

public class Personnage {

    private int largeur, hauteur;
    private int x, y;
    private boolean marche;
    private boolean versDroite;
    public int compteur;

    public Personnage(int x, int y, int largeur, int hauteur){
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.compteur = 0;
        this.marche = false;
        this.versDroite = true;
    }

    /*GETTER*/
    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isMarche() {
        return marche;
    }

    public boolean isVersDroite() {
        return versDroite;
    }

    public int getCompteur() {
        return compteur;
    }

    /*SETTER*/

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMarche(boolean marche) {
        this.marche = marche;
    }

    public void setVersDroite(boolean versDroite) {
        this.versDroite = versDroite;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    /*METHODE*/
    public Image marche(String nom, int frequence){
        String str;
        ImageIcon ico;
        Image img;

        if (this.marche == false || Main.scene.getxPos() <= 0){
            if (this.versDroite == true){
                str = "/images/" + nom + "ArretDroite.png";
            }else {
                str = "/images/" + nom + "ArretGauche.png";
            }
        }else {
            this.compteur++;

            if (this.compteur / frequence == 0) {
                if (this.versDroite==true){
                    str = "/images/" + nom + "ArretDroite.png";
                }else {
                    str = "/images/"+nom+"ArretGauche.png";
                }
            }else {
                if (this.versDroite==true){
                    str = "/images/" + nom + "MarcheDroite.png";
                }else {
                    str = "/images/"+nom+"MarcheGauche.png";
                }
            }
            if (this.compteur == 2 * frequence){
                this.compteur = 0;
            }
        }
        ico = new ImageIcon(getClass().getResource(str));
        img = ico.getImage();

        return img;
    }
}
