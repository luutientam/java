/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai41;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {

    public static String file = "T:\\IT\\java\\baitaptonghop/nhanvien.dat";

    public static void main(String[] args) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . nhap thong tin ");
            System.out.println("2 . xuat thong tin ");
            System.out.println("3 . ghi thong tin ");
            System.out.println("4 . doc  thong tin ");
            System.out.println("0 .  thoat");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap(dsnv);
                    break;
                case 2:
                    xuat(dsnv);
                    break;
                case 3:
                    ghiFile(dsnv);
                    break;
                case 4:
                    docFile();
                    break;
                case 0:
                    System.exit(chon);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void nhap(ArrayList<NhanVien> dsnv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ho ten");
        String hoTen = sc.nextLine();
        System.out.println("ngay sinh ");
        String ngaySinh = sc.nextLine();
        System.out.println("dia chi ");
        String diaChi = sc.nextLine();
        System.out.println("gioiTinh");
        String gioiTinh = sc.nextLine();
        System.out.println("phong ban ");
        String phongBan = sc.nextLine();
        System.out.println("he so luong");
        double heSoLuong = sc.nextDouble();
        System.out.println("tham nien ");
        double thamNien = sc.nextDouble();
        System.out.println("ho ten");
        double luongCoBan = sc.nextDouble();
        NhanVien nv = new NhanVien(hoTen, ngaySinh, diaChi, gioiTinh, phongBan, heSoLuong, thamNien, luongCoBan);
        dsnv.add(nv);
    }

    public static void xuat(ArrayList<NhanVien> dsnv) {
        for (NhanVien nv : dsnv) {
            System.out.println(nv);
        }
    }

    public static void ghiFile(ArrayList<NhanVien> dsnv) {
        DocGhiFile.ghiFile(dsnv, file);
    }

    public static void docFile() {
        ArrayList<NhanVien> dsnv = DocGhiFile.docFile(file);
        for(NhanVien nv : dsnv){
            System.out.println(nv);
        }
    }

}
