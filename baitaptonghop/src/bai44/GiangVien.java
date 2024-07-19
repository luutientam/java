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
public class GiangVien implements Serializable{

    protected String maGiangVien;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;

    public GiangVien(String maGiangVien, String hoTen, String ngaySinh, String gioiTinh) {
        this.maGiangVien = maGiangVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
}
