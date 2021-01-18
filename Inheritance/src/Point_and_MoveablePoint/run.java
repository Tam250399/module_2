package Point_and_MoveablePoint;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập x :");
        float a = sc.nextFloat();
        System.out.print("nhập y :");
        float b = sc.nextFloat();
        Point po = new MovablePoint(a,b);
        System.out.println("kết quả x,y là :" + po.toString());

        System.out.println("nhập c :");
        float c = sc.nextFloat();
        System.out.println("nhập d :");
        float d = sc.nextFloat();
        Point pi = new MovablePoint(c,d);
        System.out.println("kết qua là :" + pi.toString());
    }
}
