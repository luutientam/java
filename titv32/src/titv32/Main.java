/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv32;

public class Main {

    public static void main(String[] args) {
        MyDate md = new MyDate(31, 1, 2021);
        System.out.println("Day = " + md.getDay());
        md.setDay(35);
        System.out.println("Day = " + md.getDay());
        md.setDay(30);
        System.out.println("Day = " + md.getDay());

        System.out.println("Month = " + md.getMonth());
        md.setMonth(13);
        System.out.println("Month = " + md.getMonth());
        md.setMonth(5);
        System.out.println("Month = " + md.getMonth());
        // year
        System.out.println("year = " + md.getYear());
        md.setYear(2025);
        System.out.println("year = " + md.getYear());
        md.setYear(2018);
        System.out.println("year = " + md.getYear());

    }
}
