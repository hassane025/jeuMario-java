package com.mario.objets;

import javax.swing.*;
import java.awt.*;

public class Bloc extends Objet{
    private Image imgBloc;
    private ImageIcon icoBloc;

    public Bloc(int x, int y){
        super(x, y, 43, 65);
        icoBloc = new ImageIcon(getClass().getResource("/images/bloc.png"));
        this.imgBloc = this.icoBloc.getImage();
    }
    /*GETTERS*/
    public Image getImgBloc() {
        return imgBloc;
    }
}
