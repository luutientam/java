/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author luuti
 */
public class MyWindow extends JFrame {

    public MyWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showit() {
        this.setVisible(true);
    }

    public void showit(String title) {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showit(String title, int x, int y) {
        this.setTitle(title);
        this.setLocation(x, y);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showit();

        MyWindow m2 = new MyWindow();
        m2.showit("hi anh em ");
        
        MyWindow m3 = new MyWindow();
        m3.showit("hi anh em ",300,300);
    }
}
