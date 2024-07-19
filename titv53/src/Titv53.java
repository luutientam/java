/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv53;

import java.util.Arrays;

/**
 * 
 *
 * @author luuti
 */
public class Titv53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kiểu nguyên thủy
        int[] mang1 = {1, 2, 3};

        // Copy mảng cách 1
        int[] mang1_a = mang1;
        mang1_a[0] = 100;

        System.out.println("Mảng 1: " + Arrays.toString(mang1));
        System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));

        // Copy mảng cách 2 - dùng hàm clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println("Mảng 1_b: " + Arrays.toString(mang1_b));

        // Copy mảng cách 3 - dùng hàm System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mảng 1_c: " + Arrays.toString(mang1_c));

        // Kiểu đối tượng
        String[] mang_doi_tuong = {"TITV", ".vn"};
        String[] mang_doi_tuong_c = new String[mang_doi_tuong.length];
        System.arraycopy(mang_doi_tuong, 0, mang_doi_tuong_c, 0, mang_doi_tuong.length);
        System.out.println("mang_doi_tuong_c : " + Arrays.toString(mang_doi_tuong_c));
    }
}
