package titv31;

class HoaDonCaPhe {

    private String tenCaPhe;
    private double giaTien1kg;
    private double khoiLuong;

    public HoaDonCaPhe() {
    }

    public HoaDonCaPhe(String tenCaPhe, double giaTien1kg, double khoiLuong) {
        this.tenCaPhe = tenCaPhe;
        this.giaTien1kg = giaTien1kg;
        this.khoiLuong = khoiLuong;
    }

    public String getTenCaPhe() {
        return this.tenCaPhe;
    }

    public void setTenCaPhe(String tenCaPhe) {
        this.tenCaPhe = tenCaPhe;
    }

    public double getGiaTien1kg() {
        return giaTien1kg;
    }

    public void setGiaTien1kg(double giaTien1kg) {
        this.giaTien1kg = giaTien1kg;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public double tinhTongTien() {
        return this.giaTien1kg * this.khoiLuong;
    }

    boolean kiemTraKhoiLuongLonHon(int k) {
//        if(k < this.khoiLuong ){
//            return true;
//        }else {
//            return false;
//        }
        return this.khoiLuong > k;
    }

    boolean kiemTraTongTienLonHon500K() {
        return this.tinhTongTien() > 500000;
    }

    double giamGia(double i) { // nho eps kieu
        if (this.tinhTongTien() > 500000) {
            return (i / 100) * this.tinhTongTien();
        } else return 0;

    }

    double giaSauKhiGiam(int i) {
        return this.tinhTongTien() - this.giamGia(i);
    }

}
