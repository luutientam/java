/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv39;

/**
 *
 * @author luuti
 */
public class Main {

    public static void main(String[] args) {
        ConNguoi cn1 = new ConNguoi("nguyen van a", 2004);
        ConNguoi cn2 = new ConNguoi("nguyen van b", 2002);
        ConNguoi cn3 = new ConNguoi("nguyen van b", 2002);

        HocSinh hs1 = new HocSinh("nguyen khuyen", "73dcht23", "nguyen van a", 2004);
        HocSinh hs2 = new HocSinh("nguysdndfd", "73dcht23", "nguyen van b", 2002);
        HocSinh hs3 = new HocSinh("nguydfgdfyen", "73dcht23", "nguyen van b", 2002);
        System.out.println(hs1.getHoVaTen());
        hs1.an();
        hs1.ngu();
        hs1.uong();
        hs2.lamBaiTap();
        hs2.an();
        hs2.ngu();
        hs2.uong();
        hs3.lamBaiTap();
        hs3.an();
        hs3.ngu();
        hs3.uong();

    }

}
