/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai43;

import java.io.Serializable;

/**
 *
 * @author luuti
 */
public class SinhVien extends Nguoi implements Serializable{

    private String maSinhVien;
    private String email;
    private double diemTongKet;

    public SinhVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maSinhVien, String email, double diemTongKet) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }


    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + "maSinhVien=" + maSinhVien + ", email=" + email + ", diemTongKet=" + diemTongKet + '}';
    }

}
