/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv45;

/**
 *
 * @author luuti
 */
public class XeOto extends PhuongTienDiChuyen {

    String loaiNhienLieu;

    public XeOto(HangSanXuat hsx, String loaiPhuongTien) {
        super(hsx, loaiPhuongTien);
    }

    public XeOto(String loaiNhienLieu, HangSanXuat hsx, String loaiPhuongTien) {
        super(hsx, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    double layVanToc() {
        return 1;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
