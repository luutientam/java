/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv44;

/**
 *
 * @author luuti
 */
public class HinhTron extends Hinh {

    private double banKinh;

    public HinhTron(ToaDo toaDo, double banKinh) {
        super(toaDo);
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    @Override
    public double tinhDienTich() {
        return this.banKinh*this.banKinh;

    }

}
