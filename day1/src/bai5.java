import java.util.Scanner;

public class bai5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f\n",Math.sqrt(n));
        System.out.printf("%.3f",Math.cbrt(n));
    }
}
