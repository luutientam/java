/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MyColorController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MyColorModel;

/**
 *
 * @author luuti
 */
public class MyColorView extends JFrame {
    
    private MyColorModel mcm;
    private JLabel jlabel;
    
    public MyColorView() {
        this.mcm = new MyColorModel();
        this.init();
        
    }
    
    private void init() {
        this.setTitle("MY COLOR ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        MyColorController ac = new MyColorController(this);
        Font font_text = new Font("Arial", Font.BOLD, 100);
        
        Font font = new Font("Arial", Font.BOLD, 40);
        this.jlabel = new JLabel("TEXT......");
        jlabel.setFont(font_text);
        
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(2, 3));
        
        JButton button_text_do = new JButton("do text");
        button_text_do.setFont(font);
        button_text_do.setForeground(Color.red);
        button_text_do.addActionListener(ac);
        
        JButton button_text_xanh = new JButton("xanh text");
        button_text_xanh.setFont(font);
        button_text_xanh.setForeground(Color.GREEN);
        button_text_xanh.addActionListener(ac);
        
        JButton button_text_da_troi = new JButton("da_troi text");
        button_text_da_troi.setFont(font);
        button_text_da_troi.setForeground(Color.BLUE);
        button_text_da_troi.addActionListener(ac);
        
        JButton button_nen_do = new JButton("do nen");
        button_nen_do.setFont(font);
        button_nen_do.setBackground(Color.red);
        button_nen_do.addActionListener(ac);
        
        JButton button_nen_xanh = new JButton("xanh nen");
        button_nen_xanh.setFont(font);
        button_nen_xanh.setBackground(Color.GREEN);
        button_nen_xanh.addActionListener(ac);
        
        JButton button_nen_datroi = new JButton("da_troi nen");
        button_nen_datroi.setFont(font);
        button_nen_datroi.setBackground(Color.BLUE);
        button_nen_datroi.addActionListener(ac);
        
        jpanel.add(button_text_do);
        jpanel.add(button_text_xanh);
        jpanel.add(button_text_da_troi);
        jpanel.add(button_nen_do);
        jpanel.add(button_nen_xanh);
        jpanel.add(button_nen_datroi);
        
        this.setLayout(new BorderLayout());
        this.add(jlabel, BorderLayout.NORTH);
        this.add(jpanel, BorderLayout.CENTER);
        this.setVisible(true);
        
    }
    
    public void thayMauChu(Color cl) {
        this.mcm.setMauChu(cl);
        this.jlabel.setForeground(this.mcm.getMauChu());
    }
    
    public void thayMauNen(Color cl) {
        this.mcm.setMauNen(cl);
        this.jlabel.setBackground(this.mcm.getMauNen());
        this.mcm.setOpaque(true);
        this.jlabel.setOpaque(this.mcm.isOpaque());
    }
    
}
