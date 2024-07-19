/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv36;

/**
 *
 * @author luuti
 */
public class BoPhim {

    private String tenPhim;
    private int namSanXuat;
    private double giaVe;
    HangSanXuat hsx;
    NgayChieu nc;

    public BoPhim() {
    }

    public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hsx, double giaVe, NgayChieu nc) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.giaVe = giaVe;
        this.hsx = hsx;
        this.nc = nc;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public HangSanXuat getHsx() {
        return hsx;
    }

    public void setHsx(HangSanXuat hsx) {
        this.hsx = hsx;
    }

    public NgayChieu getNc() {
        return nc;
    }

    public void setNc(NgayChieu nc) {
        this.nc = nc;
    }

    boolean kiemTraGiaVeReHon(BoPhim oth) {
        return this.giaVe < oth.giaVe;
    }

    public String layTenHangSanXuat() {
        return this.hsx.tenHangSanXuat;
    }

    public double giamGia(int phanTram) {
        return phanTram / 100 * this.giaVe;
    }

    public double giaSauKhuyenMai(int phanTram) {
        return this.giaVe - giamGia(phanTram);
    }
}
