import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a = sc.nextDouble();
        System.out.print("b :");
        b = sc.nextDouble();
        System.out.print("c :");
        c = sc.nextDouble();
        if (a != 0){
            double are = (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n" , are);

        }else {
            if (b == 0){
                System.out.printf("The solution is \n");

            }else {
                System.out.println("No solution");
            }
        }
    }
}
