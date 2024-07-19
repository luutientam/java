/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv35ver2;

/**
 *
 * @author luuti
 */
public class TacGia extends Ngay {

    private String Ten;
    Ngay ngaySinh;

    public TacGia() {
    }

    public TacGia(String Ten, Ngay ngaySinh) {
        this.Ten = Ten;
        this.ngaySinh = ngaySinh;
    }

    public TacGia(String Ten, Ngay ngaySinh, int ngay, int thang, int nam) {
        super(ngay, thang, nam);
        this.Ten = Ten;
        this.ngaySinh = ngaySinh;
    }

}
