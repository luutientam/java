import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while (true){

            n = n /10 ;
            cnt++;
            if(cnt == 3){
                break;
            }
        }
        System.out.println(n);
    }
}
