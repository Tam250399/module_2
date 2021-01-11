import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhập a :");
        a = sc.nextInt();
        System.out.println("nhập b :");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b == 0){
            System.out.println("No greatest common factor");
            while (a != b){
                if(a>b){
                    a = a-b;
                }else {
                    b = b-a;
                }
                System.out.println("factor" + a);
            }
        }
    }
}
