/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai59;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author luuti
 */
public class DocGhiFile {
    
    public static void ghiFile(ArrayList<GiangVien> dsgv, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(dsgv);
            oos.close();
        } catch (Exception e) {
        }
    }
    
    public static ArrayList<GiangVien> docFile(String file) {
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            dsgv = (ArrayList<GiangVien>) ois.readObject();
            ois.close();
        } catch (Exception e) {
        }
        return dsgv;
    }

    public void backup_file(String file) throws IOException {
        File f = new File(file);
        if (f.exists()) {
            File file_back = new File("back_up" + file);
            Files.copy(f.toPath(), file_back.toPath());
            
        }
    }
}
