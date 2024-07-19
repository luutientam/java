/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai58;

import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class PS {

    private int tu;
    private int mau;

    public PS() {
    }

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so ");
        this.tu = sc.nextInt();
        System.out.println("nhap  mau so ");
        this.mau = sc.nextInt();
    }

    public void xuat() {
        System.out.println(this.tu + "/" + this.mau);
    }

    public PS cong(PS oth) {
        int tuMoi = this.tu * oth.mau + this.mau * oth.tu;
        int mauMoi = this.mau * oth.mau;
        return new PS(tuMoi, mauMoi);
    }

    public PS nhan(PS oth) {
        int tuMoi = this.tu * oth.tu;
        int mauMoi = this.mau * oth.mau;
        return new PS(tuMoi, mauMoi);
    }

    public PS chia(PS oth) {
        int tuMoi = this.tu * oth.mau;
        int mauMoi = this.mau * oth.tu;
        return new PS(tuMoi, mauMoi);
    }

    public PS tru(PS oth) {
        int tuMoi = this.tu * oth.mau - this.mau * oth.tu;
        int mauMoi = this.mau * oth.mau;
        return new PS(tuMoi, mauMoi);
    }
}
