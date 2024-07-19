/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv43;

/**
 *
 * @author luuti
 */
public class Main {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("min(5,5) = " + mm.timMin(5, 5));
        System.out.println("min(5.5, 6.0) = " + mm.timMin(5.5, 6.0));
        System.out.println("tinhTong(5,6)= " + mm.tinhTong(5.0, 6.0));
        double arr[] = new double[]{1, 2, 3, 4, 5};
        System.out.println("tinhTong(arr)= " + mm.tinhTong(arr));
    }
}
