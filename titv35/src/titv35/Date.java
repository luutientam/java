/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv35;

/**
 *
 * @author luuti
 */
public class Date {

    private int ngay;
    private int thang;
    private int nam;

    public Date() {
    }

    public Date(int ngay, int thang, int nam) {
        if (ngay >= 1 && thang <= 31) {
            this.ngay = ngay;
        } else {
            this.ngay = 1;
        }
        if (thang >= 1 && thang <= 12) {
            this.thang = thang;
        } else {
            this.thang = 1;
        }
        if (nam >= 1 && nam <= 2024) {
            this.nam = nam;
        } else {
            this.nam = 1;
        }
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }
    
}
