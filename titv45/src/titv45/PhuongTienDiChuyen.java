/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv45;

/**
 *
 * @author luuti
 */
public abstract class PhuongTienDiChuyen {

    HangSanXuat hsx;
    String loaiPhuongTien;

   

    public PhuongTienDiChuyen(HangSanXuat hsx, String loaiPhuongTien) {
        this.hsx = hsx;
        this.loaiPhuongTien = loaiPhuongTien;
    }
    String layTenHangSanXuat() {

        return this.hsx.tenHangSanXuat;

    }
    public HangSanXuat getHsx() {
        return hsx;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    void batDau() {
        System.out.println("Bắt đầu ....");
    }

    void tangToc() {
        System.out.println("Tăng tốc ...");
    }

    void dungLai() {
        System.out.println("Dừng lại ...");
    }

    abstract double layVanToc();
}
