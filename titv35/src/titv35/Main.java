/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv35;

public class Main {

    public static void main(String[] args) {
        Date ngay1 = new Date(15, 5, 2021);
        Date ngay2 = new Date(15, 9, 2030);
        Date ngay3 = new Date(15, 9, 2025);

        TacGia tacGia1 = new TacGia("Tùng TITV", ngay1);
        TacGia tacGia2 = new TacGia("Tùng Lê", ngay2);
        TacGia tacGia3 = new TacGia("Peter Le", ngay3);

        QuyenSach sach1 = new QuyenSach("Lập trình C", 5000, 2023, tacGia1);
        QuyenSach sach2 = new QuyenSach("Lập trình Java", 10000, 2029, tacGia2);
        QuyenSach sach3 = new QuyenSach("Lập trình Mạng", 15000, 2029, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sanh NXB sach 1 va 3:"
                + sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("So sanh NXB sach 2 va 3:"
                + sach2.kiemTraCungNamXuatBan(sach3));

        System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10));
        System.out.println("Sach 2 giam 20%: " + sach2.giaSauKhiGiam(20));
        System.out.println("Sach 3 giam 50%: " + sach3.giaSauKhiGiam(50));
    }
}
