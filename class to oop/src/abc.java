
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.print("nhập số a :");
            double a = abc.nextDouble();
        System.out.print("nhập số b :");
            double b = abc.nextDouble();
        System.out.print("nhập số c :");
        double c = abc.nextDouble();
        QuadraticEquation tinh = new QuadraticEquation(a,b,c);
        double ccc = tinh.getDiscriminant();
        if(tinh.getDiscriminant() > 0){
            System.out.println("phương trình có 2 nghiệm là :");
            System.out.println("x1 = " + tinh.getRoot1());
            System.out.println("x2 = " + tinh.getRoot2());
        }else if(tinh.getDiscriminant() == 0){
            System.out.println("phương trình có nghiệm kép :");
            System.out.println("x1 = x2 = " + tinh.getRoot1());
        }else {
            System.out.println("phương trình vô nghiệm");
        }

    }
}
