import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z,t ;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        t = sc.nextInt();
        System.out.println(x + "  " + y + "  " + z + "  " + t );
        System.out.println(y + "--" + z + "--" + x + "--" + t);
        System.out.println(2*x + "," + 3*y + "," + 4*z + "," + 5*t);
        System.out.println("KET THUC !!");
    }
}
