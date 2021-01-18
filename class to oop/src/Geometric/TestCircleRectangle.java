package Geometric;

import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp diện tích hình tròn");
        double x = sc.nextDouble();
        Circle circle = new Circle(x);
        circle.setFilled("black");
        System.out.println("the circle" + circle.toString());
        System.out.println("the radius is :"+ circle.getRadius());
        System.out.println("the area is :"+ circle.getArea());
        System.out.println("the diameter is :"+ circle.getDiameter());
        System.out.println();
        System.out.println("Nhập width");
        double w = sc.nextDouble();
        System.out.println("Nhập height");
        double h = sc.nextDouble();
        Rectangle rectangle = new Rectangle(w,h);
        System.out.println("A rectangle" + rectangle.toString());
        System.out.println("the Area is :"+ rectangle.getArea());
        System.out.println("the perimeter is " + rectangle.getPerimeter());
        System.out.println();

    }
}
