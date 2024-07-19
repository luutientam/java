/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

/**
 *
 * @author luuti
 */
public class CanBo extends Nguoi {

    private String phongBan;
    private double heSoLuong;
    private double luongCoBan;
    private double thuong;
    private double phat;

    public CanBo(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, double heSoLuong, double luongCoBan, double thuong, double phat) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.thuong = thuong;
        this.phat = phat;
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", luongCoBan=" + luongCoBan + ", thuong=" + thuong + ", phat=" + phat + '}';
    }

    public String string() {
        return hoTen + "*" + ngaySinh + "*" + diaChi + "*" + gioiTinh + "*" + phongBan + "*" + heSoLuong + "*" + luongCoBan + "*" + thuong + "*" + phat;
    }

    public double luongThucLinh() {
        return this.luongCoBan * this.heSoLuong + this.thuong - this.phat;
    }
}
