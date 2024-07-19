/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai52;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {

    public static String file = "T:\\IT\\java\\baitaptonghop/hocsinh.dat";

    public static void main(String[] args) {
        ArrayList<HocSinh> dshs = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . nhap thong tin ");
            System.out.println("2. xuat thong tin ");
            System.out.println("3 . ghi  thong tin ");
            System.out.println("4 . doc thong tin ");
            System.out.println("0 . thoat ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap(dshs);
                    break;
                case 2:
                    xuat(dshs);
                    break;
                case 3:
                    ghiFile(dshs);

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

    public static void nhap(ArrayList<HocSinh> dshs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hoc ten : ");
        String hoTen = sc.nextLine();
        System.out.println("ngay sinh : ");
        String ngaySinh = sc.nextLine();
        System.out.println("dia chi : ");
        String diaChi = sc.nextLine();
        System.out.println("gioi tinh : ");
        String gioiTinh = sc.nextLine();
        System.out.println("ma hoc sinh");
        String maHocSinh = sc.nextLine();
        System.out.println("lop");
        String lop = sc.nextLine();
        System.out.println("diem tong ket");
        double diemTongKet = sc.nextDouble();
        HocSinh hs = new HocSinh(hoTen, ngaySinh, diaChi, gioiTinh, maHocSinh, lop, diemTongKet);
        dshs.add(hs);
    }

    public static void xuat(ArrayList<HocSinh> dshs) {
        for (HocSinh hs : dshs) {
            System.out.println(hs);
        }
    }

    public static void ghiFile(ArrayList<HocSinh> dshs) {
        DocGhiFile.ghiFile(dshs, file);
    }

    public static void docFile() {
        ArrayList<HocSinh> dshs = DocGhiFile.docFile(file);
        for (HocSinh hs : dshs) {
            System.out.println(hs);
        }
    }
}
