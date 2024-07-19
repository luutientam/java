/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv38;

/**
 *
 * @author luuti
 */
public class MayTinh {

    double giaBan;
    int thoiGianBaoHanh;
    HangSanXuat hsx;
    NgaySanXuat nsx;

    public MayTinh() {
    }

    public MayTinh(HangSanXuat hsx, NgaySanXuat nsx, double giaBan, int thoiGianBaoHanh) {
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.hsx = hsx;
        this.nsx = nsx;
    }

    boolean kiemTraGiaThapHon(MayTinh oth) {
        return this.giaBan < oth.giaBan;
    }
    String layTenQuocGia(){
        return this.hsx.quocGia.tenQuocGia;
    }
}
