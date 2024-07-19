/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai42;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * @author luuti
 */
public class DocGhiFile {

    public static void ghiFile(ArrayList<NhanVien> dsnv, String path) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)))) {
            for (NhanVien nv : dsnv) {
                bw.write(nv.string());
                bw.newLine();
            }
            System.out.println("ghi thanh cong");
        } catch (Exception e) {
        }
    }

    public static ArrayList<NhanVien> docFile(String path) {
        ArrayList<NhanVien> ds = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] aString = line.split("\\|");
                if (aString.length == 8) {
                    NhanVien nv = new NhanVien(aString[0], (aString[1]), (aString[2]), (aString[3]), aString[4], Double.parseDouble(aString[5]), Double.parseDouble(aString[6]), Double.parseDouble(aString[7]));
                    ds.add(nv);
                }
            }
            System.out.println("doc thanh cong");
        } catch (Exception e) {
        }
        return ds;
    }
}
