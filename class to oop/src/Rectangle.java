import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        test_rectangle rectangle = new test_rectangle(width,height);
        System.out.println("You rectangle \n" + rectangle.Display());
        System.out.println("Perimeter of the Rectangle:" + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle:" + rectangle.getArea());

    }
}
