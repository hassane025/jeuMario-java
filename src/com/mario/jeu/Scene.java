package com.mario.jeu;

import com.mario.personnage.Mario;

import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {

    private ImageIcon icoFond;
    private Image imgFond1;
    private Image imgFond2;

    private ImageIcon icoChateau;
    private final Image imgChateau;
    private final ImageIcon icoDepart;
    private Image imgDepart;

    private int xFond1;
    private int xFond2;
    private int dx;

    private int xPos;

    public Mario mario;

    public Scene(){
        super();

        this.xFond1 = -50;
        this.xFond2 = 750;
        this.dx = 0;
        this.xPos = -1;

        icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
        this.imgFond1 = this.icoFond.getImage();
        this.imgFond2 = this.icoFond.getImage();

        icoChateau = new ImageIcon(getClass().getResource("/images/chateau1.png"));
        this.imgChateau = this.icoChateau.getImage();
        icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
        this.imgDepart = this.icoDepart.getImage();

        mario = new Mario(300, 245);

        this.setFocusable(true);
        this.requestFocusInWindow(true);
        this.addKeyListener(new Clavier());

        Thread chronoEcran = new Thread(new Chrono());
        chronoEcran.start();
    }

    public void deplacementFond(){
        if (this.xPos>=0){
            this.xPos = this.xPos + this.dx;

            this.xFond1 = this.xFond1 - this.dx;
            this.xFond2 = this.xFond2 - this.dx;

        }

        if (this.xFond1 == -800){this.xFond1 = 800;}
        else if (this.xFond2 == -800) {
            this.xFond2 = 800;
        } else if (this.xFond1 == 800) {
            this.xFond1 = -800;
        } else if (this.xFond2 == 800) {
            this.xFond2 = -800;
        }
    }

    /***Getters**/
    public int getDx() {
        return dx;
    }
    public int getxPos() {
        return xPos;
    }

    public int getxFond1() {
        return xFond1;
    }

    public int getxFond2() {
        return xFond2;
    }


    /***setters***/
    public void setDx(int dx) {
        this.dx = dx;
    }
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setxFond1(int xFond1) {
        this.xFond1 = xFond1;
    }
    public void setxFond2(int xFond2) {
        this.xFond2 = xFond2;
    }

    /** Paint component **/
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        this.deplacementFond();
        g2.drawImage(this.imgFond1, this.xFond1, 0, null);
        g2.drawImage(this.imgFond2, this.xFond2, 0, null);
        g2.drawImage(this.mario.marche("mario", 25), 300, 245, null);
        g2.drawImage(imgChateau, 10 - this.xPos, 95, null);
        g2.drawImage(imgDepart, 220 - this.xPos, 234, null);
    }

}
