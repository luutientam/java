package bai40;

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
            System.out.println("1 . nhap thong tin ");
            System.out.println("2. xuat thong tin ");
            System.out.println("3 luu thong tin ");
            System.out.println("4 doc thong tin ");
            System.out.println("0 thoat  ");
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
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void nhap(ArrayList<CanBo> dscb) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ho ten ");
        String hoTen = sc.nextLine();

        System.out.println(" ngay sinh ");
        String ngaySinh = sc.nextLine();
        System.out.println("dia chi ");
        String diaChi = sc.nextLine();
        System.out.println("gioi tinh");
        String gioiTinh = sc.nextLine();
        System.out.println("ma ngach  ");
        String maNgach = sc.nextLine();
        System.out.println("bac luong ");
        double bacLuong = sc.nextDouble();
        System.out.println("he so luong  ");
        double heSoLuong = sc.nextDouble();
        CanBo cb = new CanBo(hoTen, ngaySinh, diaChi, gioiTinh, maNgach, bacLuong, heSoLuong);
        dscb.add(cb);
    }

    public static void xuat(ArrayList<CanBo> dscb) {
        for (CanBo cb : dscb) {
            System.out.println(cb);
        }
    }

    public static void ghiFile(ArrayList<CanBo> dscb) {
        DocghiFile.ghiFile(dscb, file);
    }

    public static void docFile() {
        ArrayList<CanBo> doc_dscb = DocghiFile.docFile(file);
        for (CanBo cb : doc_dscb) {
            System.out.println(cb);
        }
    }
}
