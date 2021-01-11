import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<8;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0;i<=5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 6;i>=1;i--){
            for (int j= 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
