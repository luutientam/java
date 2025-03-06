/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;

/**
 *
 * @author luuti
 */
public class MyColorModel {

    private Color mauChu;
    private Color mauNen;
    private boolean opaque;

    public MyColorModel() {
        this.mauChu = Color.BLACK;
        this.mauNen = Color.WHITE;
        this.opaque = true;
    }

    public Color getMauChu() {
        return mauChu;
    }

    public void setMauChu(Color mauChu) {
        this.mauChu = mauChu;
    }

    public Color getMauNen() {
        return mauNen;
    }

    public void setMauNen(Color mauNen) {
        this.mauNen = mauNen;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

}
