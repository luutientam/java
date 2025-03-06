/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author luuti
 */
public class MyCalculator extends JFrame {

    public MyCalculator() {
        this.setTitle("calculator");
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jt = new JTextField(50);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new BorderLayout());
        jp1.add(jt, BorderLayout.CENTER);

        JButton j0 = new JButton("0");
        JButton j1 = new JButton("1");
        JButton j2 = new JButton("2");
        JButton j3 = new JButton("3");
        JButton j4 = new JButton("4");
        JButton j5 = new JButton("5");
        JButton j6 = new JButton("6");
        JButton j7 = new JButton("7");
        JButton j8 = new JButton("8");
        JButton j9 = new JButton("9");
        JButton jcong = new JButton("+");
        JButton jtru = new JButton("-");
        JButton jnhan = new JButton("*");
        JButton jchia = new JButton("/");
        JButton jbang = new JButton("=");

        JPanel jp_button = new JPanel();
        jp_button.setLayout(new GridLayout(5, 3));
        jp_button.add(j0);
        jp_button.add(j1);
        jp_button.add(j2);
        jp_button.add(j3);
        jp_button.add(j4);
        jp_button.add(j5);
        jp_button.add(j6);
        jp_button.add(j7);
        jp_button.add(j8);
        jp_button.add(j9);
        jp_button.add(jcong);
        jp_button.add(jtru);
        jp_button.add(jnhan);
        jp_button.add(jchia);
        jp_button.add(jbang);

        this.setLayout(new BorderLayout());
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp_button, BorderLayout.CENTER);
//        this.setLayout(new FlowLayout());
//        this.add(jt);
//        this.add(j0);
//        this.add(j1);
//        this.add(j2);
//        this.add(j3);
//        this.add(j4);
//        this.add(j5);
//        this.add(j6);
//        this.add(j7);
//        this.add(j8);
//        this.add(j9);
//        this.add(jcong);
//        this.add(jtru);
//        this.add(jnhan);
//        this.add(jchia);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MyCalculator myCalculator = new MyCalculator();
            
        } catch (Exception e) {
        }
        
    }
}
