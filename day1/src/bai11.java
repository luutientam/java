import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*2 + "\n" + n*10 + "\n" + n / 2  );
        System.out.printf("%.3f",(double)n/2);
    }
}
