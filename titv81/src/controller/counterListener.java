/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import view.counterView;

/**
 *
 * @author luuti
 */
public class counterListener implements ActionListener {

    private counterView ctv;

    public counterListener(counterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        System.out.println("ban da nhan nut");
        String src = e.getActionCommand();
        System.out.println("ban da nhan nut " + src);
        if (src.equals("UP")) {
            this.ctv.tang();
        } else if (src.equals("DOWN")) {
            this.ctv.giam();
        } else if (src.equals("RESET")) {
            this.ctv.reset();
        }
    }

}
