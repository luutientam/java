/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author luuti
 */
public class gridlayout extends JFrame {

    /**
     * @param args the command line arguments
     */
    public gridlayout() {
        this.setTitle("chicaho");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        //set layout 
        GridLayout gridlayout = new GridLayout();
        GridLayout gridlayout_1 = new GridLayout(4, 4);
        GridLayout gridlayout_2 = new GridLayout(4, 4, 25, 25);

//        this.setLayout(flowlayout);
//        this.setLayout(flowlayout_1);
        this.setLayout(gridlayout_2);

        for (int i = 0; i < 10; i++) {
            JButton jbutton = new JButton(i+"");
            this.add(jbutton    );
        }
//        JButton jbutton_1 = new JButton("1");
//        JButton jbutton_2 = new JButton("2");
//        JButton jbutton_3 = new JButton("3");
        // add thanh phan 
//        this.add(jbutton_1);
//        this.add(jbutton_2);
//        this.add(jbutton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        gridlayout vd = new gridlayout();
    }

}
