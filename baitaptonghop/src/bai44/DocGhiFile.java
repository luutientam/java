/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai44;

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

    public static void luuFileCM(ArrayList<GiangVienCM> gvcm, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(gvcm);
            oos.close();
        } catch (Exception e) {
        }
    }

    public static void luuFileHD(ArrayList<GiangVienHD> gvhd, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(gvhd);
            oos.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<GiangVienCM> docFileCM(String file) {
        ArrayList<GiangVienCM> gvcm = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            gvcm = (ArrayList<GiangVienCM>) ois.readObject();
            ois.close();
        } catch (Exception e) {
        }
        return gvcm;
    }

    public static ArrayList<GiangVienHD> docFileHD(String file) {
        ArrayList<GiangVienHD> gvhd = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            gvhd = (ArrayList<GiangVienHD>) ois.readObject();
            ois.close();
        } catch (Exception e) {
        }
        return gvhd;
    }
}
