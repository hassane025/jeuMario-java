package com.mario.personnage;

import javax.swing.*;
import java.awt.*;

public class Mario extends Personnage{
    private ImageIcon icoMario;
    private Image imgMario;

    public Mario(int x, int y){

        super(x, y, 28, 50);

        icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
        this.imgMario = this.icoMario.getImage();
    }

    public ImageIcon getIcoMario() {
        return icoMario;
    }

    public void setIcoMario(ImageIcon icoMario) {
        this.icoMario = icoMario;
    }

    public Image getImgMario() {
        return imgMario;
    }

    public void setImgMario(Image imgMario) {
        this.imgMario = imgMario;
    }
}
