/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai41;

/**
 *
 * @author luuti
 */
public class NhanVien extends Nguoi {

    private String phongBan;
    private double heSoLuong;
    private double thamNien;
    private double luongcoBan;

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
    }

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, double heSoLuong, double thamNien, double luongcoBan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongcoBan = luongcoBan;
    }

    public double luongThucLinh() {
        return this.luongcoBan * this.heSoLuong * (1 + this.thamNien / 100);
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongcoBan=" + luongcoBan + '}';
    }

    public String string() {
        return  hoTen + "|" + ngaySinh + "|" + diaChi + "|" + gioiTinh + "|" + phongBan + "|" + heSoLuong + "|" + thamNien + "|" + luongcoBan;
    }
}
