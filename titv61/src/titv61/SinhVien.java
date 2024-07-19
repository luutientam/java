/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv61;

import java.util.Objects;

/**
 *
 * @author luuti
 */
public class SinhVien {

    private String maSinhVien;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maSinhVien);
        hash = 79 * hash + Objects.hashCode(this.hoTen);
        hash = 79 * hash + this.namSinh;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.diemTrungBinh) ^ (Double.doubleToLongBits(this.diemTrungBinh) >>> 32));
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
        final SinhVien other = (SinhVien) obj;
        if (this.namSinh != other.namSinh) {
            return false;
        }
        if (Double.doubleToLongBits(this.diemTrungBinh) != Double.doubleToLongBits(other.diemTrungBinh)) {
            return false;
        }
        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
            return false;
        }
        return Objects.equals(this.hoTen, other.hoTen);
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemTrungBinh=" + diemTrungBinh + '}';
    }

    
    
    
}
