/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai66;

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

    public static void ghiFile(ArrayList<NhanVien> dsnv, String path) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)))) {
            for (NhanVien nv : dsnv) {
                bw.write(nv.string());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<NhanVien> docFile(String file) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] a = line.split("\\$");
                if (a.length == 8) {
                    NhanVien nv = new NhanVien(a[0], a[1], a[2], a[3], a[4], Double.parseDouble(a[5]), Double.parseDouble(a[6]), Double.parseDouble(a[7]));
                    dsnv.add(nv);
                }
            }
            br.close();
        } catch (Exception e) {
        }
        return dsnv;
    }
}
