/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv46;

/**
 *
 * @author luuti
 */
public class Main {

    public static void main(String[] args) {
//        System.out.println("Test câu a: ");
//        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
//        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
//
//        System.out.println("5+3=" + mfx500.cong(5, 3));
//        System.out.println("4*5=" + mvn500.nhan(4, 5));
//        System.out.println("4/0=" + mvn500.chia(4, 0));
//
//        System.out.println("Test câu b: ");
//
//        double[] arr = new double[]{5, 1, 3, 4, 5, 8, 0};
//        double[] arr2 = new double[]{6, 2, 7, 9, 2, 4, 5};
//        SapXepChen sxchen = new SapXepChen();
//        SapXepChon sxchon = new SapXepChon();
//
//        sxchen.sapXepTang(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        sxchon.sapXepGiam(arr2);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("Test câu c:");
//        PhanMemMayTinh pmmt = new PhanMemMayTinh();
//        System.out.println("3+5=" + pmmt.cong(3, 5));
//        double[] arr3 = new double[]{6, 2, 7, 9, 2, 4, 5};
//        pmmt.sapXepTang(arr3);
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + " ");
//        }

        System.out.println("test cau a : ");
        MayTinhCasioFX500 fx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 cal500 = new MayTinhVinacal500();

        System.out.println(" 10 cong 20 = " + fx500.cong(10, 20));
        System.out.println(" 10 tru 20 = " + fx500.tru(10, 20));
        System.out.println(" 10 nhan 20 = " + fx500.nhan(10, 20));
        System.out.println(" 10 chia 20 = " + fx500.chia(10, 20));

        System.out.println(" 10 cong 20 = " + cal500.cong(10, 20));
        System.out.println(" 10 tru 20 = " + cal500.tru(10, 20));
        System.out.println(" 10 nhan 20 = " + cal500.nhan(10, 20));
        System.out.println(" 10 chia 20 = " + cal500.chia(10, 20));

        System.out.println("test cau b : ");
        SapXepChen chen = new SapXepChen();
        SapXepChon chon = new SapXepChon();
        double arr[] = {2, 7, 5, 3, 7, 8};

        chen.sapXepGiam(arr);
        System.out.println("sap xep giam chen  ");
        for (double tmp : arr) {
            System.out.println(tmp);
        }
        chen.sapXepTang(arr);
        System.out.println("sap xep tang chen");
        for (double tmp : arr) {
            System.out.println(tmp);
        }

        double arr1[] = {6, 333, 4, 6, 7, 3345};
        chon.sapXepGiam(arr1);
        System.out.println("sap xep giam chon  ");
        for (double tmp : arr1) {
            System.out.println(tmp);
        }
        chon.sapXepTang(arr1);
        System.out.println("sap xep tang chon");
        for (double tmp : arr1) {
            System.out.println(tmp);
        }

        double arr2[] = {6, 333, 4, 7, 53, 7749};

        System.out.println("test cau c ");
        PhanMemMayTinh mt = new PhanMemMayTinh();
        System.out.println(" 10 cong 15 = " + mt.cong(10, 15));
        System.out.println(" 10 tru 15 = " + mt.tru(10, 15));
        System.out.println(" 10 nhan 15 = " + mt.nhan(10, 15));
        System.out.println(" 10 chia 15 = " + mt.chia(10, 15));
        
        mt.sapXepGiam(arr2);
        System.out.println("sap xep giam chon  ");
        for (double tmp : arr2) {
            System.out.println(tmp);
        }
        mt.sapXepTang(arr2);
        System.out.println("sap xep tang chon");
        for (double tmp : arr2) {
            System.out.println(tmp);
        }
    }
}
