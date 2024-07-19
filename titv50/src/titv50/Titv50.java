/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titv50;

/**
 *
 * @author luuti
 */
public class Titv50  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "lmao";
        String s2 = "LMAO";
        String s3 = "lmao";
        // equals so sánh 2 chuỗi giống nhau k
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        // equalsIgnoreCase  // so sánh 2 chuỗi giống nhau ko bỏ qua viết hoa 
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        // hàm compareTo() so sánh lớn hơn , bằng , nhỏ hơn theo 
        // Hàm compareTo => so sánh > < =
        String sv3 = "Nguyễn Văn";
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv4 = "Nguyễn Văn a";

        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
        
        
// Hàm compareToIgnoreCase => Tường tự hàm compareTo, không biệt chữ hoa chữ thường

        // Hàm regionMatches => so sánh một đoạn
        String r1 = "TITV.vn";
        String r2 = "TV.v";
        boolean check = r1.regionMatches(2, r2, 0, 4);
        System.out.println(check);

        // 0937 456 789
        // 0937 455 765
        // Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
        String sdt = "037456789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));

        // Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
        String tenFile = "I love you.JPG";
        String tenFile2 = "Hoc Java.PDF";

        if (tenFile.endsWith(".JPG")) {
            System.out.println("File 1 là hình ảnh!");
        } else if (tenFile.endsWith(".PDF")) {
            System.out.println("File 1 là file PDF!");
        }

        if (tenFile2.endsWith(".JPG")) {
            System.out.println("File 2 là hình ảnh!");
        } else if (tenFile2.endsWith(".PDF")) {
            System.out.println("File 2 là file PDF!");
        }
    }

}
