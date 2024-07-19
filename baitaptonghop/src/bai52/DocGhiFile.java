/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai52;

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

    public static void ghiFile(ArrayList<HocSinh> dshs, String file) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            for (HocSinh hs : dshs) {
                bw.write(hs.string());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<HocSinh> docFile(String file) {
        ArrayList<HocSinh> dshs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] a = line.split("\\&");
                if (a.length == 7) {
                    HocSinh hs = new HocSinh(a[0], a[1], a[2], a[3], a[4], a[5], Double.parseDouble(a[6]));
                    dshs.add(hs);
                }
            }
        } catch (Exception e) {
        }
        return dshs;
    }
}
