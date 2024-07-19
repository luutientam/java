/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai51;

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

    public static void ghiFile(ArrayList<CanBo> dscb, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(dscb);
            oos.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<CanBo> docFile( String file) {
         ArrayList<CanBo> dscb = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            dscb = (ArrayList<CanBo>) ois.readObject();
        } catch (Exception e) {
        }
        return dscb;
    }
}
