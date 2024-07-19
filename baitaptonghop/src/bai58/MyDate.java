/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai58;

import java.util.Scanner;

/**
 *
 * @author luuti
 */
public class MyDate {

    private int date;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    // nhap 
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap date : ");
        this.date = sc.nextInt();
        System.out.println("nhap thang : ");
        this.month = sc.nextInt();
        System.out.println("nhap nam : ");
        this.year = sc.nextInt();
    }
    // in man hinh 
    @Override
    public String toString() {
        return "MyDate{" + "date=" + date + ", month=" + month + ", year=" + year + '}';
    }

}
