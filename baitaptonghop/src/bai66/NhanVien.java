/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai66;

/**
 *
 * @author luuti
 */
public class NhanVien extends Nguoi {

    private String phongBan;
    private double heSoLuong;
    private double thamNien;
    private double luongCoBan;

    public NhanVien(String hoTen, String diaChi, String ngaySinh, String gioiTinh, String phongBan, double heSoLuong, double thamNien, double luongCoBan) {
        super(hoTen, diaChi, ngaySinh, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan + '}';
    }

    public String string() {
        return hoTen + "$" + diaChi + "$" + ngaySinh + "$" + gioiTinh + "$" + phongBan + "$" + heSoLuong + "$" + thamNien + "$" + luongCoBan;
    }

    public double luongThucLinh() {
        return this.luongCoBan * this.heSoLuong * (1 + this.thamNien / 100);
    }
}
