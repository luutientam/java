/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {

    public static String file = "T:\\IT\\java\\baitaptonghop/canbo.dat";

    public static void main(String[] args) {
        ArrayList<CanBo> dscb = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 . Nhap  thong tin ");
            System.out.println("2. xuat  thong tin ");
            System.out.println("3. ghi   thong tin ");
            System.out.println("4 . doc  thong tin ");
            System.out.println("0 . thoat ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap(dscb);
                    break;
                case 2:
                    xuat(dscb);
                    break;

                case 3:
                    ghiFile(dscb);
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

    public static void nhap(ArrayList<CanBo> dscb) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ho ten ");
        String hoTen = sc.nextLine();
        System.out.println("nhap ngay sinh");
        String ngaySinh = sc.nextLine();
        System.out.println("nhap dia chi");
        String diaChi = sc.nextLine();
        System.out.println("nhap gioi tinh  ");
        String gioiTinh = sc.nextLine();
        System.out.println("nhap phong ban  ");
        String phongBan = sc.nextLine();
        System.out.println("nhap he so luong ");
        double heSoLuong = sc.nextDouble();
        System.out.println("nhap luong co ban  ");
        double luongCoBan = sc.nextDouble();
        System.out.println("luong thuong");
        double thuong = sc.nextDouble();
        System.out.println("luong phat  ");
        double phat = sc.nextDouble();
        CanBo cb = new CanBo(hoTen, ngaySinh, diaChi, gioiTinh, phongBan, heSoLuong, luongCoBan, thuong, phat);
        dscb.add(cb);
    }

    public static void xuat(ArrayList<CanBo> dscb) {
        for (CanBo cb : dscb) {
            System.out.println(cb);
        }
    }

    public static void ghiFile(ArrayList<CanBo> dscb) {
        DocGhiFile.ghiFile(dscb, file);
    }

    public static void docFile() {
        ArrayList<CanBo> dscb = DocGhiFile.docFile(file);
        for(CanBo cb : dscb){
            System.out.println(cb);
        }
    }
}
