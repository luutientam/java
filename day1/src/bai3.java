import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z,t;
        x = sc.nextInt();y = sc.nextInt();z = sc.nextInt();t = sc.nextInt();
        System.out.println(x + "," + y + "," + z + "," + t);
        System.out.println(z +  y + x +t);
        System.out.println(x - y + (long)z*t);

    }
}
