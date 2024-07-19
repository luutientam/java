/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai52;

/**
 *
 * @author luuti
 */
public class HocSinh extends Nguoi {

    private String maHocSinh;
    private String lop;
    private double diemTongKet;

    public HocSinh(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maHocSinh, String lop, double diemTongKet) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maHocSinh = maHocSinh;
        this.lop = lop;
        this.diemTongKet = diemTongKet;
    }

    @Override
    public String toString() {
        return "HocSinh{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + "maHocSinh=" + maHocSinh + ", lop=" + lop + ", diemTongKet=" + diemTongKet + '}';
    }

    public String string() {
        return  hoTen + "&" + ngaySinh + "&" + diaChi + "&" + gioiTinh + "&" + maHocSinh + "&" + lop + "&" + diemTongKet;
    }
}
