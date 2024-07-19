import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long  y = sc.nextLong();
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        float f = sc.nextFloat();
        double  d = sc.nextDouble();
        System.out.println(x + "\n" + y + "\n" + c + "\n" + f + "\n" + d );
    }
}
