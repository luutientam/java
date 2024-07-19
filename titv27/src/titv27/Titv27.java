/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv27;

import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Titv27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("nhap n : ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("chuong trinh bi loi !");
        } finally {
            System.out.println("hi anh em  finally nhe !");
        }
        System.out.println("n = " + n);
        
    }

}
