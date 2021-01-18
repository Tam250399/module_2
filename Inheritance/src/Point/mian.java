package Point;

import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x :");
        float a = sc.nextFloat();
        System.out.println("nhập y :");
        float b = sc.nextFloat();
        Point2D p = new Point2D(a,b);
        System.out.println("kết qua là :" + p.toString());

        System.out.println("nhập c :");
        float c = sc.nextFloat();
        System.out.println("nhập d :");
        float d = sc.nextFloat();
        System.out.println("nhập e :");
        float e = sc.nextFloat();
        Point3D h = new Point3D(c,d,e);
        System.out.println("kết qua là :" + h.toString());
    }
}
