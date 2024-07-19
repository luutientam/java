/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai42;

/**
 * @author luuti
 */
public class NhanVien extends Nguoi {

    private String phongBan;
    private double heSoLuong;
    private double thamNien;
    private double luongCoban;

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, double heSoLuong, double thamNien, double luongCoban) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoban = luongCoban;
    }

    public float tinhluong() {
        return (float) (luongCoban * heSoLuong * (1 + thamNien / 100));
    }

    public NhanVien() {
    }

    public String string() {
        return hoTen + "|" + ngaySinh + "|" + diaChi + "|" + gioiTinh + "|" + phongBan + "|" + heSoLuong + "|" + thamNien + "|" + luongCoban;
    }

    @Override
    public String toString() {
        return "ho ten = " + hoTen + " ngay sinh = " + ngaySinh + " dia chi = " + diaChi + " gioi tinh = " + gioiTinh + " phongBan= " + phongBan + " heSoLuong= " + heSoLuong + " thamNien= " + thamNien + " luongCoban= " + luongCoban;
    }

}
