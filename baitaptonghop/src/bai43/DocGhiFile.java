/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai43;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author luuti
 */
public class DocGhiFile {

    public static void ghiFile(ArrayList<SinhVien> dssv, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(dssv);

            oos.close();
            System.out.println("ghi thanh cong");
        } catch (Exception e) {
        }
    }

    public static ArrayList<SinhVien> docFile(String file) {
        ArrayList<SinhVien> dssv = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            dssv = (ArrayList<SinhVien>) ois.readObject();
            ois.close();
            System.out.println("doc thanh cong");
        } catch (Exception e) {
        }
        return dssv;
    }
}
