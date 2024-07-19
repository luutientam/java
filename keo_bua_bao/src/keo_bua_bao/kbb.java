/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keo_bua_bao;

import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class kbb {
// lua chon  cua may 

    String luaChonMay() {
        String lc;
        int temp = (int) (Math.random() * 3 + 1);
        if (temp == 1) {
            lc = "keo";
        } else if (temp == 2) {
            lc = "bua";
        } else {
            lc = "bao";
        }
        return lc;
    }
// lua chon cua nguoi 

    String luaChonNguoi() {
        Scanner sc = new Scanner(System.in);
        String lc = sc.nextLine();
        lc.toLowerCase();
        return lc;
    }
// so sanh ket qua 

    String ketQua(String luaChonMay, String luaChonNguoi) {
        if (luaChonMay.equals(luaChonNguoi)) {
            return "hoa";
        } else if (luaChonNguoi.equals("bao") && luaChonMay.equals("bua")) {
            return "thang";
        } else if (luaChonNguoi.equals("bua") && luaChonMay.equals("keo")) {
            return "thang";
        } else if (luaChonNguoi.equals("keo") && luaChonMay.equals("bao")) {
            return "thang";
        } else {
            return "thua";
        }
    }

    public static void main(String[] args) {
        kbb obj = new kbb();
        // nhap sao cho dung 
        // lay du lieu nguoi dung  
        String luaChonNguoi;
        while (true) {
            luaChonNguoi = obj.luaChonNguoi();
            if (luaChonNguoi.equals("keo") || luaChonNguoi.equals("bua") || luaChonNguoi.equals("bao")) {
                break;
            }
        }

        // lua chon may 
        String luaChonMay = obj.luaChonMay();
        // so sanh
        String lmao = obj.ketQua(luaChonMay, luaChonNguoi);
        // output 
        System.out.println("nguoi dung : " + luaChonNguoi);
        System.out.println("may : " + luaChonMay);
        System.out.println(lmao);
    }

}
