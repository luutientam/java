/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai44;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {
    public static String file_cm = "T:\\IT\\java\\baitaptonghop/gvcm.dat";
    public static String file_hd = "T:\\IT\\java\\baitaptonghop/gvhd.dat";

    public static void main(String[] args) {
        ArrayList<GiangVienCM> gvcm = new ArrayList<>();
        ArrayList<GiangVienHD> gvhd = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 nhap giang vien cm ");
            System.out.println("2 nhap giang vien hd ");
            System.out.println("3 xuat giang vien cm ");
            System.out.println("4 xuat giang vien hd ");
            System.out.println("5 luu giang vien  ");
            System.out.println("6 doc giang vien ");
            System.out.println("0 thoat");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    nhap_cm(gvcm);
                    break;
                case 2:
                    nhap_hd(gvhd);
                    break;
                case 3:
                    xuat_cm(gvcm);
                    break;
                case 4:
                    xuat_hd(gvhd);
                    break;
                case 5:
                    luuFile(gvcm, gvhd);
                    break;
                case 6:
                    docFile();
                    break;
                case 0:
                    System.exit(n);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void nhap_cm(ArrayList<GiangVienCM> gvcm) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ma giang vien ");
        String maGiangVien = sc.nextLine();
        System.out.println("ho ten ");
        String hoTen = sc.nextLine();
        System.out.println("ngay sinh ");
        String ngaySinh = sc.nextLine();
        System.out.println("gioi tinh ");
        String gioiTinh = sc.nextLine();
        System.out.println("he so luong ");
        double heSoLuong = sc.nextDouble();
        System.out.println("tham nien");
        double thamNien = sc.nextDouble();
        GiangVienCM cm = new GiangVienCM(hoTen, ngaySinh, gioiTinh, heSoLuong, thamNien, maGiangVien);
        gvcm.add(cm);
    }

    public static void nhap_hd(ArrayList<GiangVienHD> gvhd) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma giang vien ");
        String maGiangVien = sc.nextLine();
        System.out.println("ho ten ");
        String hoTen = sc.nextLine();
        System.out.println("ngay sinh ");
        String ngaySinh = sc.nextLine();
        System.out.println("gioi tinh ");
        String gioiTinh = sc.nextLine();
        System.out.println("he so luong ");
        double heSoLuong = sc.nextDouble();
        System.out.println("tham nien");
        double thamNien = sc.nextDouble();
        GiangVienHD hd = new GiangVienHD(hoTen, ngaySinh, gioiTinh, heSoLuong, thamNien, maGiangVien);
        gvhd.add(hd);
    }

    public static void xuat_cm(ArrayList<GiangVienCM> gvcm) {
        for (GiangVienCM cm : gvcm) {
            System.out.println(cm);
        }
    }

    public static void xuat_hd(ArrayList<GiangVienHD> gvhd) {
        for (GiangVienHD hd : gvhd) {
            System.out.println(hd);
        }
    }

    public static void luuFile(ArrayList<GiangVienCM> gvcm, ArrayList<GiangVienHD> gvhd) {
        DocGhiFile.luuFileCM(gvcm, file_cm);
        DocGhiFile.luuFileHD(gvhd, file_hd);
    }

    public static void docFile() {
        ArrayList<GiangVienCM> gvcm = DocGhiFile.docFileCM(file_cm);
        ArrayList<GiangVienHD> gvhd = DocGhiFile.docFileHD(file_hd);
        System.out.println("giang vien hd ");
        for (GiangVienCM cm : gvcm) {
            System.out.println(cm);
        }
        System.out.println("giang vien hd ");
        for (GiangVienHD hd : gvhd) {
            System.out.println(hd);
        }
    }
}
