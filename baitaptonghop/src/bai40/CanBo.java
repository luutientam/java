/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai40;

/**
 *
 * @author luuti
 */
public class CanBo extends Nguoi {

    private String maNgach;
    private double bacLuong;
    private double heSoLuong;

    public CanBo(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maNgach, double bacLuong, double heSoLuong) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNgach = maNgach;
        this.bacLuong = bacLuong;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + "maNgach=" + maNgach + ", bacLuong=" + bacLuong + ", heSoLuong=" + heSoLuong + '}';
    }

    public String string() {
        return  hoTen + "-" + ngaySinh + "-" + diaChi + "-" + gioiTinh + "-" + maNgach + "-" + bacLuong + "-" + heSoLuong ;
    }
}
