/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv35;

import titv35ver2.Ngay;

/**
 *
 * @author luuti
 */
public class TacGia extends Date {

    private String tenTacGia;
    private Date ngaySinh;

    public TacGia(String tùng_TITV, Ngay ngay1) {
    }

    public TacGia(String tenTacGia, Date ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

}
