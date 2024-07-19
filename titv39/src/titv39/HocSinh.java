/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv39;

/**
 *
 * @author luuti
 */
public class HocSinh extends ConNguoi {

    private String tenLop, tenTruong;

    public HocSinh() {
    }

    public HocSinh(String tenLop, String tenTruong) {
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public HocSinh(String tenLop, String tenTruong, String hoVaTen, int namSinh) {
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public void lamBaiTap() {
        System.out.println("lam bai tap");
    }
}
