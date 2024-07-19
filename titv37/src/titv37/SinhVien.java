/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv37;

/**
 *
 * @author luuti
 */
public class SinhVien {

    private String maSinhVien;
    private String hoTen;
    private double diemTrungBinh;
    NgaySinh ns;
    Lop lop;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, NgaySinh ns, double diemTrungBinh, Lop lop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
        this.ns = ns;
        this.lop = lop;
    }

    String layTenKhoa() {
        return this.lop.getTenKhoa();
    }

    boolean kiemTraDiem() {
        return this.diemTrungBinh >= 5;
    }

    String kiemTraThiDat() {
        if (kiemTraDiem()) {
            return "DAT";
        } else {
            return "ko dat";
        }
    }
    boolean kiemTraCungNgaySinh(SinhVien oth){
        return this.ns.equals(oth.ns);
    }
}
