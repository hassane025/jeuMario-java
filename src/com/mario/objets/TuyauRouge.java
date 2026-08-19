package com.mario.objets;

import javax.swing.*;
import java.awt.*;

public class TuyauRouge extends Objet{
    private Image imgTuyauRouge;
    private ImageIcon icoTuyauRouge;

    public TuyauRouge(int x, int y){
        super(x, y, 43, 65);
        icoTuyauRouge = new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
        this.imgTuyauRouge = this.icoTuyauRouge.getImage();
    }
    /*GETTERS*/

    public Image getImgTuyauRouge() {
        return imgTuyauRouge;
    }
}
