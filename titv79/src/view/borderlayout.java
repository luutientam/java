/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author luuti
 */
public class borderlayout extends JFrame {

    /**
     * @param args the command line arguments
     */
    public borderlayout() {
        this.setTitle("chicaho");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        //set layout 
        BorderLayout borderlayout = new BorderLayout();
        BorderLayout borderlayout_2 = new BorderLayout(10, 10);

//        this.setLayout(borderlayout);
        this.setLayout(borderlayout_2);

        JButton jbutton_1 = new JButton("1");
        JButton jbutton_2 = new JButton("2");
        JButton jbutton_3 = new JButton("3");
        JButton jbutton_4 = new JButton("4");
        JButton jbutton_5 = new JButton("5");
        // add thanh phan 
        this.add(jbutton_1,BorderLayout.CENTER);
        this.add(jbutton_2,BorderLayout.WEST);
        this.add(jbutton_3,BorderLayout.NORTH);
        this.add(jbutton_4,BorderLayout.SOUTH);
        this.add(jbutton_5,BorderLayout.EAST);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        borderlayout vd = new borderlayout();
    }

}
