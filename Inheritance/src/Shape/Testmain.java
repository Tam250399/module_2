package Shape;

import java.util.Scanner;

public class Testmain {
    public static void main(String[] args) {
//        Shape sh = new Shape();
//        System.out.println(sh);
//        sh = new Shape("red",false);
//        System.out.println(sh);
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5,"indigo",false);
//        System.out.println(circle);
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3,5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.5,3.8,"orange",true);
//        System.out.println(rectangle);
//
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(2.3);
//        System.out.println(square);
//        square = new Square(5.8,"yellow", true);
//        System.out.println(square);

        Triangle ab = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập x :");
        double a = sc.nextDouble();
        System.out.print("nhập y :");
        double b = sc.nextDouble();
        System.out.print("nhập z :");
        double c = sc.nextDouble();
        Triangle tr = new Triangle(a,b,c);
        System.out.println(tr.toSring());
        System.out.println("diện tích là :"+ tr.getArea());
        System.out.println("chu vi là :" + tr.getPerimeter());

    }
}
