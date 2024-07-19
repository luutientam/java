/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv45;

/**
 *
 * @author luuti
 */
public class MayBay extends PhuongTienDiChuyen {

    String loaiNhienLieu;

    public MayBay(HangSanXuat hsx, String loaiPhuongTien) {
        super(hsx, loaiPhuongTien);
    }

    public MayBay(String loaiNhienLieu, HangSanXuat hsx, String loaiPhuongTien) {
        super(hsx, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    void catCanh() {
        System.out.println("cat canh");
    }

    void haCanh() {
        System.out.println("ha canh");

    }

    @Override
    double layVanToc() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 1;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

}
