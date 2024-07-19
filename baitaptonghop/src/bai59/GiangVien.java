/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai59;

import java.io.Serializable;

/**
 *
 * @author luuti
 */
public class GiangVien implements Serializable{

    private String hoTen;
    private String maGiangVien;
    private String diaChi;
    private String gioiTinh;

    public GiangVien(String hoTen, String maGiangVien, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.maGiangVien = maGiangVien;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public GiangVien() {
    }

    @Override
    public String toString() {
        return "GiangVien{" + "hoTen=" + hoTen + ", maGiangVien=" + maGiangVien + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

}
