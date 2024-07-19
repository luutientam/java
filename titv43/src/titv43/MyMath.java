/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv43;

/**
 *
 * @author luuti
 */
public class MyMath {

    public int timMin(int a, int b) {
        return a < b ? a : b;
    }

    public double timMin(double a, double b) {
        return a < b ? a : b;
    }

    public int tinhTong(int a, int b) {
        return a + b;
    }

    public double tinhTong(double a, double b) {
        return a + b;
    }

    public double tinhTong(double arr[]) {
        int len = arr.length;
        double tong = 0;
        while (len > 1) {
            tong = tong + arr[len -1];
            len--;
        }
        return tong;
    }
}
