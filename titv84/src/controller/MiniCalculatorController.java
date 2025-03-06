/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MiniCalculatorView;

/**
 *
 * @author luuti
 */
public class MiniCalculatorController implements ActionListener {

    MiniCalculatorView mcv;

    public MiniCalculatorController(MiniCalculatorView mcv) {
        this.mcv = mcv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("+")) {
            this.mcv.cong();
        } else if (src.equals("-")) {
            this.mcv.tru();
        } else if (src.equals("*")) {
            this.mcv.nhan();
        } else if (src.equals("/")) {
            this.mcv.chia();
        } else if (src.equals("^")) {
            this.mcv.mu();
        } else if (src.equals("%")) {
            this.mcv.chiaLayDu();
        }
    }

}
