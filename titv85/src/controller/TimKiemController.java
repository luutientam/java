/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TimKiemView;

/**
 *
 * @author luuti
 */
public class TimKiemController implements ActionListener{
    private TimKiemView tkv ;

    public TimKiemController(TimKiemView tkv) {
        this.tkv = tkv;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.tkv.timKiem();
    }
    
}
