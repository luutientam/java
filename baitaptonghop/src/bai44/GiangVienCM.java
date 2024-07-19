/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai44;

import java.io.Serializable;

/**
 *
 * @author luuti
 */
public class GiangVienCM extends GiangVien implements Serializable{

    private double heSoLuong;
    private double thamNien;

    public GiangVienCM(String hoTen, String ngaySinh, String gioiTinh, double heSoLuong, double thamNien, String maGiangVien) {
        super(maGiangVien, hoTen, ngaySinh, gioiTinh);
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    @Override
    public String toString() {
        return "GiangVienCM{" + "maGiangVien=" + maGiangVien + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + "heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + '}';
    }

}
