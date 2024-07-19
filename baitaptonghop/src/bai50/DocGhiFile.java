/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

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
public class DocGhiFile {

    public static void ghiFile(ArrayList<CanBo> dscb, String path) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)))) {
            for (CanBo cb : dscb) {
                bw.write(cb.string());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<CanBo> docFile(String path) {
        ArrayList<CanBo> dscb = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] a = line.split("\\*");
                if (a.length == 9) {
                    CanBo cb = new CanBo(a[0], a[1], a[2], a[3], a[4], Double.parseDouble(a[5]), Double.parseDouble(a[6]), Double.parseDouble(a[7]), Double.parseDouble(a[8]));
                    dscb.add(cb);
                }
            }
            br.close();

        } catch (Exception e) {
        }
        return dscb;
    }
}
