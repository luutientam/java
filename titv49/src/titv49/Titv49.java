/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv49;

import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Titv49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ");
        String s = sc.nextLine();
        // hàm length lấy độ dài chuỗi 
        System.out.println("do dai chuoi s ls : " + s.length());
        int doDai = s.length();
        // hàm charAt(x); lấy ra 1 ký tự tạo vi tri x 
        for (int i = 0; i <= doDai - 1; i++) {
            System.out.println(s.charAt(i));

        }
        // hàm getChars (vị trí bắt đầu , vt kết thúc , mảng dữ liệu ,vị trí bắt đầu lưu vào  mảng)
        char[] arrChar = new char[100];
        s.getChars(2, 6, arrChar, 0);
        for (int i = 0; i < arrChar.length; i++) {
            System.out.println(arrChar[i]);
        }
    }

}
