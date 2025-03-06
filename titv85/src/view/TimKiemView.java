/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.TimKiemController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.TimKiemModel;

/**
 *
 * @author luuti
 */
public class TimKiemView extends JFrame {

    private TimKiemModel tkm;
    private JTextArea jTextArea_vanBan;
    private JTextField jTextField_tuKoa;
    private JLabel jLabel_ketQua;

    public TimKiemView() {
        this.tkm = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("tim kiem");
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 50);
        //Center
        JLabel jLabel_vanBan = new JLabel("Văn bản");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);

        // Footer
        TimKiemController timKiemListener = new TimKiemController(this);
        JLabel jLabel_tuKhoa = new JLabel("Từ khóa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKoa = new JTextField();
        jTextField_tuKoa.setFont(font);

        JButton jButton_thongKe = new JButton("Thống kê");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.BLUE);
        jButton_thongKe.setBorderPainted(false);
        jButton_thongKe.setOpaque(true);

        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setBackground(Color.YELLOW);
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setOpaque(true);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void timKiem() {
        this.tkm.setVanBan(this.jTextArea_vanBan.getText());
        this.tkm.setTuKhoa(this.jTextField_tuKoa.getText());
        this.tkm.timKiem();
        this.jLabel_ketQua.setText(this.tkm.getKetQua());
    }

}
