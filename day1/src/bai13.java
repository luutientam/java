import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y ,z, t;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        t = sc.nextInt();
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(z,t));
        System.out.println(Math.max(Math.max(x,y),z) + "\n" + Math.min(Math.min(z,t) , Math.min(x,y)));
    }
}
