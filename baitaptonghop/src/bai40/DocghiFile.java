/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai40;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author luuti
 */
public class DocghiFile {

    public static void ghiFile(ArrayList<CanBo> dscb, String path) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)))) {
            for (CanBo cb : dscb) {
                bw.write(cb.string());
                bw.newLine();
            }
        } catch (Exception e) {
        }
    }

    public static ArrayList<CanBo> docFile(String path) {
        ArrayList<CanBo> doc_dscb = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] a = line.split("-");
                if (a.length == 7) {
                    CanBo cb = new CanBo(a[0], a[1], a[2], a[3], a[4], Double.parseDouble(a[5]), Double.parseDouble(a[6]));
                    doc_dscb.add(cb);
                }
            }

        } catch (Exception e) {
        }
        return doc_dscb;
    }

}
