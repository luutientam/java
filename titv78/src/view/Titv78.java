/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author luuti
 */
public class Titv78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // tạo cửa sổ 
        JFrame jf = new JFrame();
        // kích cỡ 
        jf.setSize(600, 400);
        // gán tên cửa sổ 
        jf.setTitle("vidu jframe");
        // gán vị trí cửa sổ 
        jf.setLocation(300, 300);
        // thoáy khỏi chương trình khi đóng jframe
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // cho phép hiển thị cứa sổ  
        jf.setVisible(true);
    }

}
