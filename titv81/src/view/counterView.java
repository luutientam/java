/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.counterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.counterModel;

/**
 *
 * @author luuti
 */
public class counterView extends JFrame {
    
    private counterModel ctm;
    private JButton up;
    private JButton down;
    private JLabel dem;
    private JButton reset;
    
    public counterView() {
        this.ctm = new counterModel();
        this.init();
        this.setVisible(true);
    }
    
    public void init() {
        this.setTitle("counter ");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        counterListener ctl = new counterListener(this);
        
        JButton up = new JButton("UP");
        up.addActionListener(ctl);
        JButton down = new JButton("DOWN");
        down.addActionListener(ctl);
        JLabel dem = new JLabel(this.ctm.getValue() + "", JLabel.CENTER);
        JButton reset = new JButton("RESET");
        reset.addActionListener(ctl);
        
        JPanel j_ok = new JPanel();
        j_ok.setLayout(new BorderLayout());
        j_ok.add(up, BorderLayout.EAST);
        j_ok.add(dem, BorderLayout.CENTER);
        j_ok.add(down, BorderLayout.WEST);
        j_ok.add(reset,BorderLayout.SOUTH);
        
        this.setLayout(new BorderLayout());
        this.add(j_ok, BorderLayout.CENTER);
        
    }
    
    public void tang() {
        this.ctm.tang();
        this.dem.setText(this.ctm.getValue() + "");
    }
    
    public void giam() {
        this.ctm.giam();
        this.dem.setText(this.ctm.getValue() + "");
    }
     public void reset() {
        this.ctm.reset();
        this.dem.setText(this.ctm.getValue() + "");
    }
    
}
