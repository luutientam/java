/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv39;

/**
 *
 * @author luuti
 */
public class ConNguoi {

    protected String hoVaTen;
    protected int namSinh;

    public ConNguoi() {
    }

    public ConNguoi(String hoVaTen, int namSinh) {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void an() {
        System.out.println("mam mam");
    }

    public void uong() {
        System.out.println("uc uc");
    }

    public void ngu() {
        System.out.println("kho kho");
    }

}
