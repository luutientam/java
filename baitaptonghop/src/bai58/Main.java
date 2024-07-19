/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai58;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class Main {

    public static String file = "T:\\IT\\java\\baitaptonghop/phanso.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PS> dsps = new ArrayList<>();
        while (true) {
            System.out.println("1nhap phan  so :");
            System.out.println("2cong phan so  ");
            System.out.println("3tru phan so  ");
            System.out.println("4nhan phan so  ");
            System.out.println("5chia phan so  ");
            System.out.println("6luu phan so  ");
            System.out.println("thoat ");
            int n;
            n = sc.nextInt();
            switch (n) {
                case 1:
                    nhap(dsps);
                    break;
                case 2:
                    cong(dsps);
                    break;
                case 3:
                    tru(dsps);
                    break;
                case 4:
                    nhan(dsps);
                    break;
                case 5:
                    chia(dsps);
                    break;
                case 6:
                    luuFile(dsps);
                    break;
                case 0:
                    System.exit(n);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void nhap(ArrayList<PS> dsps) {
        PS ps = new PS();
        ps.nhap();
        dsps.add(ps);
    }

    public static void cong(ArrayList<PS> dsps) {
        if (dsps.size() >= 2) {
            PS ps1 = dsps.get(0);
            PS ps2 = dsps.get(1);
            PS ps = ps1.cong(ps2);
            ps.xuat();

        }
    }

    public static void tru(ArrayList<PS> dsps) {
        if (dsps.size() >= 2) {
            PS ps1 = dsps.get(0);
            PS ps2 = dsps.get(1);
            PS ps = ps1.tru(ps2);
            ps.xuat();

        }
    }

    public static void nhan(ArrayList<PS> dsps) {
        if (dsps.size() >= 2) {
            PS ps1 = dsps.get(0);
            PS ps2 = dsps.get(1);
            PS ps = ps1.nhan(ps2);
            ps.xuat();

        }
    }

    public static void chia(ArrayList<PS> dsps) {
        if (dsps.size() >= 2) {
            PS ps1 = dsps.get(0);
            PS ps2 = dsps.get(1);
            PS ps = ps1.chia(ps2);
            ps.xuat();

        }
    }

    public static void luuFile(ArrayList<PS> dsps) {
        DocGhiFile.luuFile(dsps, file);
    }
}
