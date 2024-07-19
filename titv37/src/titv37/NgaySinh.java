/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv37;

/**
 *
 * @author luuti
 */
public class NgaySinh {

    private int ngay;
    private int thang;
    private int nam;

    public NgaySinh() {
    }

    public NgaySinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NgaySinh other = (NgaySinh) obj;
        if (this.ngay != other.ngay) {
            return false;
        }
        if (this.thang != other.thang) {
            return false;
        }
        return this.nam == other.nam;
    }

}
