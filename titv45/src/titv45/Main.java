/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv45;

/**
 *
 * @author luuti
 */
public class Main {

    public static void main(String[] args) {
        HangSanXuat hsx1 = new HangSanXuat("vietjet", "vietnam");
        HangSanXuat hsx2 = new HangSanXuat("toyota", "japan");
        HangSanXuat hsx3 = new HangSanXuat("jeep", "america");
        MayBay p1 = new MayBay(hsx1, "ten khong");
        XeOto p2 = new XeOto(hsx2, "otooooo");
        XeDap p3 = new XeDap(hsx3, "xedapppp   ");
        System.out.println("laay ten hang san xuat : ");
        System.out.println(p1.layTenHangSanXuat());

        System.out.println("bat dau : ");
        p1.batDau();

        System.out.println("cat canh : ");
        p1.catCanh();

        System.out.println("lay van toc: ");
        System.out.println(p1.layVanToc());
        System.out.println(p2.layVanToc());
        System.out.println(p3.layVanToc());

    }

}
