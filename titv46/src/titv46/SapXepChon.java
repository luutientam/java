/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv46;

/**
 *
 * @author luuti
 */
public class SapXepChon implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }
            }
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
