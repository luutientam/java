/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author luuti
 */
public class flowlayout extends JFrame {

    /**
     * @param args the command line arguments
     */
    public flowlayout() {
        this.setTitle("chicaho");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        //set layout 
        FlowLayout flowlayout = new FlowLayout();
        FlowLayout flowlayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowlayout_2 = new FlowLayout(FlowLayout.LEFT, 50, 10);

//        this.setLayout(flowlayout);
//        this.setLayout(flowlayout_1);
        this.setLayout(flowlayout_2);

        JButton jbutton_1 = new JButton("1");
        JButton jbutton_2 = new JButton("2");
        JButton jbutton_3 = new JButton("3");
        // add thanh phan 
        this.add(jbutton_1);
        this.add(jbutton_2);
        this.add(jbutton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        flowlayout vd = new flowlayout();
    }

}
