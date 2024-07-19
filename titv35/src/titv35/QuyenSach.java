/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv35;

/**
 *
 * @author luuti
 */
public class QuyenSach extends TacGia {

    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tg;

    public QuyenSach(String tenSach, double giaBan, int namXuatBan, TacGia tg) {
        super("T\u00f9ng TITV", ngay1);
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tg = tg;
    }
// in ten sach 

    void inTenSach() {
        System.out.println(this.tenSach);
    }

    //kiemTraCungNamXuatBan
    boolean kiemTraCungNamXuatBan(QuyenSach orther) {
        return this.namXuatBan == orther.namXuatBan;
    }

    // giam gia 
    double giamGia(double x) {
        return (double) (x / 100) * this.giaBan;
    }

    // sau khi giam gia 
    double giaSauKhiGiam(double x) {
        return this.giaBan - (this.giamGia(x));
    }

    @Override
    public String toString() {
        return "QuyenSach{" + "tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan + ", tg=" + tg + '}';
    }
}
