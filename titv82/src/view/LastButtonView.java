/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.LastbuttonController;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.LastButtonModel;

/**
 *
 * @author luuti
 */
public class LastButtonView extends JFrame {

    private LastButtonModel lbm;
    private JLabel jlabel;

    public  LastButtonView() {
        this.lbm = new LastButtonModel();
        this.init();
    }

    public void init() {
        this.setTitle("nut bam cuoi cung");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);

        JPanel jpanel_button = new JPanel();
        jpanel_button.setLayout(new GridLayout(2,2));
        Font font = new Font("Arial", Font.BOLD, 40);
        LastbuttonController ac = new LastbuttonController(this);

        JButton b1 = new JButton("1");
        b1.setFont(font);
        b1.addActionListener(ac);
        
        
        JButton b2 = new JButton("2");
        b2.setFont(font);
        b2.addActionListener(ac);

        JButton b3 = new JButton("3");
        b3.setFont(font);
        b3.addActionListener(ac);

        JButton b4 = new JButton("4");
        b4.setFont(font);
        b4.addActionListener(ac);

        jpanel_button.add(b1);
        jpanel_button.add(b2);
        jpanel_button.add(b3);
        jpanel_button.add(b4);

        JPanel j_footer = new JPanel();
        jlabel = new JLabel("------");
        jlabel.setFont(font);
        j_footer.add(jlabel);

        this.setLayout(new BorderLayout());
        this.add(jpanel_button, BorderLayout.CENTER);
        this.add(j_footer, BorderLayout.SOUTH);
        this.setVisible(true);

    }

    public void thayDoi_1() {
        this.lbm.setValue_1();
        this.jlabel.setText("Last button: " + this.lbm.getValue());
    }

    public void thayDoi_2() {
        this.lbm.setValue_2();
        this.jlabel.setText("Last button: " + this.lbm.getValue());
    }

    public void thayDoi_3() {
        this.lbm.setValue_3();
        this.jlabel.setText("Last button: " + this.lbm.getValue());
    }

    public void thayDoi_4() {
        this.lbm.setValue_4();
        this.jlabel.setText("Last button: " + this.lbm.getValue());
    }

}
