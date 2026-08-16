package com.mario.jeu;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scene scene;
    public static void main(String[] args) {

        JFrame fenetre = new JFrame("jeu style de mario");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(700,360);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setAlwaysOnTop(true);

        scene = new Scene();
        fenetre.setContentPane(scene);
        fenetre.setVisible(true);

    }
}