import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println((int)Math.ceil(n));
        System.out.println((int)Math.floor(n));
        System.out.println(Math.round(n));
    }
}
