/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv37;

/**
 *
 * @author luuti
 */
public class Mian {

    public static void main(String[] args) {
        NgaySinh ngay1 = new NgaySinh(19, 7, 2002);
        NgaySinh ngay2 = new NgaySinh(17, 2, 2001);
        NgaySinh ngay3 = new NgaySinh(19, 7, 2002);

        Lop lop1 = new Lop("DH01", "Khoa Công nghệ Thông tin");
        Lop lop2 = new Lop("DH02", "Khoa Khoa học Máy tính");
        Lop lop3 = new Lop("DH03", "Khoa An ninh mạng");

        SinhVien sv1 = new SinhVien("0001", "Tùng ITV", ngay1, 9.0, lop1);
        SinhVien sv2 = new SinhVien("0002", "Peter Le", ngay2, 4.0, lop2);
        SinhVien sv3 = new SinhVien("0003", "Lê Tùng", ngay3, 6.0, lop3);

        System.out.println("Tên khoa: ");
        System.out.println("SV1: " + sv1.layTenKhoa());
        System.out.println("SV2: " + sv2.layTenKhoa());
        System.out.println("SV3: " + sv3.layTenKhoa());
        System.out.println("Kiểm tra thi đạt: ");
        System.out.println("SV1: " + sv1.kiemTraThiDat());
        System.out.println("SV2: " + sv2.kiemTraThiDat());
        System.out.println("SV3: " + sv3.kiemTraThiDat());
        System.out.println("Kiểm tra cùng ngày sinh:");
        System.out.println("sv1 và sv2: " + sv1.kiemTraCungNgaySinh(sv2));
        System.out.println("sv1 và sv3: " + sv1.kiemTraCungNgaySinh(sv3));

    }

}
