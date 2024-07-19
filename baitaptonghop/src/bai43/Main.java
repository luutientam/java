/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai43;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {

    public static String file = "T:\\IT\\java\\baitaptonghop/sinhvien.dat";

    public static void main(String[] args) {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1 nhap thong tin ");
            System.out.println("2 xuat thong tin ");
            System.out.println("3 luu thong tin ");
            System.out.println("4 doc  thong tin ");
            System.out.println("0 thoat ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    nhap(dssv);
                    break;
                case 2:
                    xuat(dssv);
                    break;
                case 3:
                    luuFile(dssv);
                    break;
                case 4:
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

    public static void nhap(ArrayList<SinhVien> dssv) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ho ten ");
        String hoTen = sc.nextLine();
        System.out.println("ngay sinh");
        String ngaySinh = sc.nextLine();
        System.out.println("dia chi ");
        String diaChi = sc.nextLine();
        System.out.println("gioi tinh");
        String gioiTinh = sc.nextLine();
        System.out.println("ma sinh vien ");
        String maSinhVien = sc.nextLine();
        System.out.println("email ");
        String email = sc.nextLine();
        System.out.println("diem tong ket");
        double diemTongKet = sc.nextDouble();
        SinhVien sv = new SinhVien(hoTen, ngaySinh, diaChi, gioiTinh, maSinhVien, email, diemTongKet);
        dssv.add(sv);
    }

    public static void xuat(ArrayList<SinhVien> dssv) {
        for (SinhVien sv : dssv) {

            System.out.println(sv);
        }
    }

    public static void luuFile(ArrayList<SinhVien> dssv) {
        DocGhiFile.ghiFile(dssv, file);
    }

    public static void docFile() {
        ArrayList<SinhVien> dssv = DocGhiFile.docFile(file);
        for (SinhVien sv : dssv) {
            System.out.println(sv);
        }
    }
}
