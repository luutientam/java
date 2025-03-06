/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.MiniCalculatorController;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.MiniCalculatorModel;

/**
 *
 * @author luuti
 */
public class MiniCalculatorView extends JFrame {

    private MiniCalculatorModel mcm;
    private JTextField text_1;
    private JTextField text_2;
    private JTextField text_answer;

    public MiniCalculatorView() {
        this.mcm = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("mini calculator");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        MiniCalculatorController ac = new MiniCalculatorController(this);

        Font font = new Font("Arial", Font.BOLD, 50);
        JLabel la_firstValue = new JLabel("firstValue");
        la_firstValue.setFont(font);
        JLabel la_secondValue = new JLabel("secondValue");
        la_secondValue.setFont(font);
        JLabel la_answerValue = new JLabel("answerValue");
        la_answerValue.setFont(font);

        this.text_1 = new JTextField(50);
        this.text_1.setFont(font);

        this.text_2 = new JTextField(50);
        this.text_2.setFont(font);

        this.text_answer = new JTextField(50);
        this.text_answer.setFont(font);

        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new GridLayout(3, 2, 10, 10));
        jpanel1.add(la_firstValue);
        jpanel1.add(text_1);
        jpanel1.add(la_secondValue);
        jpanel1.add(text_2);
        jpanel1.add(la_answerValue);
        jpanel1.add(text_answer);

        JButton butCong = new JButton("+");
        butCong.setFont(font);
        butCong.addActionListener(ac);
        JButton butTru = new JButton("-");
        butTru.setFont(font);
        butTru.addActionListener(ac);
        JButton butNhan = new JButton("*");
        butNhan.setFont(font);
        butNhan.addActionListener(ac);

        JButton butChia = new JButton("/");
        butChia.setFont(font);
        butChia.addActionListener(ac);

        JButton butMu = new JButton("^");
        butMu.setFont(font);
        butMu.addActionListener(ac);

        JButton butChiaLayDu = new JButton("%");
        butChiaLayDu.setFont(font);
        butChiaLayDu.addActionListener(ac);

        JPanel JpanelButton = new JPanel();
        JpanelButton.add(butCong);
        JpanelButton.add(butTru);
        JpanelButton.add(butNhan);
        JpanelButton.add(butChia);
        JpanelButton.add(butMu);
        JpanelButton.add(butChiaLayDu);

        this.setLayout(new BorderLayout(10, 10));
        this.add(jpanel1, BorderLayout.CENTER);
        this.add(JpanelButton, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void cong() {
        double firstValue = Double.valueOf(text_1.getText());
        double secondValue = Double.valueOf(text_2.getText());
        this.mcm.setFirstValue(firstValue);
        this.mcm.setSecondValue(secondValue);
        this.mcm.cong();
        this.text_answer.setText(this.mcm.getAnswer() + "");
    }

    public void tru() {
        double firstValue = Double.valueOf(text_1.getText());
        double secondValue = Double.valueOf(text_2.getText());
        this.mcm.setFirstValue(firstValue);
        this.mcm.setSecondValue(secondValue);
        this.mcm.tru();
        this.text_answer.setText(this.mcm.getAnswer() + "");
    }

    public void nhan() {
        double firstValue = Double.valueOf(text_1.getText());
        double secondValue = Double.valueOf(text_2.getText());
        this.mcm.setFirstValue(firstValue);
        this.mcm.setSecondValue(secondValue);
        this.mcm.nhan();
        this.text_answer.setText(this.mcm.getAnswer() + "");
    }

    public void chia() {
        double firstValue = Double.valueOf(text_1.getText());
        double secondValue = Double.valueOf(text_2.getText());
        this.mcm.setFirstValue(firstValue);
        this.mcm.setSecondValue(secondValue);
        this.mcm.chia();
        this.text_answer.setText(this.mcm.getAnswer() + "");
    }

    public void mu() {
        double firstValue = Double.valueOf(text_1.getText());
        double secondValue = Double.valueOf(text_2.getText());
        this.mcm.setFirstValue(firstValue);
        this.mcm.setSecondValue(secondValue);
        this.mcm.mu();
        this.text_answer.setText(this.mcm.getAnswer() + "");
    }

    public void chiaLayDu() {
        double firstValue = Double.valueOf(text_1.getText());
        double secondValue = Double.valueOf(text_2.getText());
        this.mcm.setFirstValue(firstValue);
        this.mcm.setSecondValue(secondValue);
        this.mcm.chiaLayDu();
        this.text_answer.setText(this.mcm.getAnswer() + "");
    }
}
