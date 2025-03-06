/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MyColorView;

/**
 *
 * @author luuti
 */
public class MyColorController implements ActionListener {

    MyColorView mcv;

    public MyColorController(MyColorView mcv) {
        this.mcv = mcv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("do text")) {
            this.mcv.thayMauChu(Color.RED);
        } else if (src.equals("xanh text")) {
            this.mcv.thayMauChu(Color.GREEN);
        } else if (src.equals("da_troi text")) {
            this.mcv.thayMauChu(Color.BLUE);
        } else if (src.equals("do nen")) {
            this.mcv.thayMauNen(Color.RED);
        } else if (src.equals("xanh nen")) {
            this.mcv.thayMauNen(Color.GREEN);
        } else if (src.equals("da_troi nen")) {
            this.mcv.thayMauNen(Color.BLUE);
        }
    }

}
