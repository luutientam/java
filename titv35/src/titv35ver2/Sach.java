/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv35ver2;

import java.util.Objects;

/**
 *
 * @author luuti
 */
public class Sach extends TacGia {

    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    TacGia tg;

    public Sach() {
    }

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tg) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tg = tg;
    }

    public void inTenSach() {
        System.out.println(this.tenSach);
    }
// so sanh nam xuat ban 

    public boolean soSanhNXB(Sach orther) {
        return this.namXuatBan == orther.namXuatBan;
    }

    public double giamGia(int phanTram) {
        return (phanTram * this.giaBan) / 100;
    }

    public double giaSauKhiGiam(int phanTram) {
        return this.giaBan - giamGia(phanTram);
    }
}
