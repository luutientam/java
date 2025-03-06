/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LastButtonView;

/**
 *
 * @author luuti
 */
public class LastbuttonController implements ActionListener {

    private LastButtonView lbv;

    public LastbuttonController(LastButtonView orther) {
        this.lbv = orther;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("1")) {
            this.lbv.thayDoi_1();
        } else if (src.equals("2")) {
            this.lbv.thayDoi_2();
        } else if (src.equals("3")) {
            this.lbv.thayDoi_3();
        } else if (src.equals("4")) {
            this.lbv.thayDoi_4();
        }
    }

}
