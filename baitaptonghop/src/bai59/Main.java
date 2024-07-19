/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai59;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {

    public static String file = "T:\\IT\\java\\baitaptonghop/giangvien.dat";
    public static String file_back = "T:\\IT\\java\\baitaptonghop/giangvien_back.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        while (true) {
            System.out.println("1 . nhap thong tin ");
            System.out.println("2 . xuat thong tin ");
            System.out.println("3 . luu thong tin ");
            System.out.println("4 . doc thong tin ");
            System.out.println("5. xoa thong tin ");

            System.out.println("0 . thoat ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    nhap(dsgv);
                    break;
                case 2:
                    xuat(dsgv);
                    break;
                case 3:
                    luuFile(dsgv);
                    break;
                case 4:
                    docFile();
                    break;
                case 5:
                    xoaFile();
                case 0:
                    System.exit(n);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void nhap(ArrayList<GiangVien> dsgv) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ho ten ");
        String hoTen = sc.nextLine();
        System.out.println("ma giang vien ");
        String maGiangVien = sc.nextLine();
        System.out.println("dia chi  ");
        String diaChi = sc.nextLine();
        System.out.println("gioi tinh");
        String gioiTinh = sc.nextLine();
        GiangVien gv = new GiangVien(hoTen, maGiangVien, diaChi, gioiTinh);
        dsgv.add(gv);

    }

    public static void xuat(ArrayList<GiangVien> dsgv) {
        for (GiangVien gv : dsgv) {
            System.out.println(gv);
        }
    }

    public static void luuFile(ArrayList<GiangVien> dsgv) {
        DocGhiFile.ghiFile(dsgv, file);
    }

    public static void xoaFile() {
        File file = new File(Main.file);
        

    }

    public static void docFile() {
        ArrayList<GiangVien> dsgv = DocGhiFile.docFile(file);
        for (GiangVien gv : dsgv) {
            System.out.println(gv);
        }
    }

}
