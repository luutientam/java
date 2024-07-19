/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv44;

/**
 *
 * @author luuti
 */
public abstract class Hinh {

    protected  ToaDo toaDo;

    public Hinh() {
    }

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }
    public abstract double tinhDienTich();
}
