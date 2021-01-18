import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius: ");
        double x = sc.nextDouble();
        TestCircle circle = new TestCircle(x);
        System.out.println("Diện tích của bạn là :" + circle.getArea());
    }
}
