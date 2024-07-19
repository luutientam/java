import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.4f\n",2*PI*r);
        System.out.printf("%.4f", PI*r*r);
    }
}
