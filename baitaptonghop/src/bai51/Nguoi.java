/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai51;

import java.io.Serializable;

/**
 *
 * @author luuti
 */
public class Nguoi implements Serializable{

    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String gioiTinh;

    public Nguoi(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }



}