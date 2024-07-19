/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv56;

import java.util.Arrays;

/**
 *
 * @author luuti
 */
public class Titv56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "hi anh em minh la,lUU TIEN TAM!";
        String arr1[] = s.split(" ");
        System.out.println(Arrays.toString(arr1));
        
        String arr2[] = s.split("\\,");
        System.out.println(Arrays.toString(arr2));
        
        
        
        String s2 = "Xin chào, mình là Peter. Mình là lập trình viên!";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
                
        String s3 = "LUU TIEN TAM" ;
        String[] s33 = s3.split(" ");
        System.out.println(Arrays.toString(s33));
        System.out.println("TÊn " + s33[s33.length -1]);
                
    }

}
