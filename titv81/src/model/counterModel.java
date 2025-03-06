/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luuti
 */
public class counterModel {

    private int value;

    public counterModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void tang() {
        this.value++;
    }

    public void giam() {
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }
}
