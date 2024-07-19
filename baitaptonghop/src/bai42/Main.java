/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai42;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author luuti
 */
public class Main {

    public static String FILE = "T:\\IT\\java\\baitaptonghop/nhanvien.dat";

    public static void main(String[] args) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. nhap nhan vien ");
            System.out.println("2. xuat nhan vien ");
            System.out.println("3. ghi file ");
            System.out.println("4. doc file");
            System.out.println("0. thoat ");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("sai cu phap!!!");
                    break;
            }
        }

    }

    public static void nhap(ArrayList<NhanVien> dsnv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten : ");
        String hotTen = sc.nextLine();
        System.out.println("ngay sinh : ");
        String ngaySinh = sc.nextLine();

        System.out.println("dia chi : ");
        String diaChi = sc.nextLine();

        System.out.println("nhap gioi tinh : ");
        String gioiTinh = sc.nextLine();

        System.out.println("nhap phong ban : ");
        String phongBan = sc.nextLine();

        System.out.println("nhap he so luong : ");
        double hsl = sc.nextDouble();

        System.out.println("nhap tham nien : ");
        double thamnien = sc.nextDouble();

        System.out.println("nhap luong co ban: ");
        double luoncb = sc.nextDouble();
        NhanVien lmao = new NhanVien(hotTen, ngaySinh, diaChi, gioiTinh, phongBan, hsl, thamnien, luoncb);
        dsnv.add(lmao);
    }

    public static void xuat(ArrayList<NhanVien> nv) {
        for (NhanVien temp : nv) {
            System.out.println(temp);
        }
    }

    public static void ghiFile(ArrayList<NhanVien> dsnv) {
        DocGhiFile.ghiFile(dsnv, FILE);
    }

    public static void docFile() {
        ArrayList<NhanVien> doc_dsnv = new ArrayList<>();

        doc_dsnv = DocGhiFile.docFile(FILE);
        for (NhanVien t : doc_dsnv) {
            System.out.println(t);
        }
    }
}
