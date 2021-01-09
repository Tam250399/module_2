import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("nhập số tiền cần đổi");
        usd = sc.nextDouble();
        double doitien = usd * vnd;
        System.out.println("Gía VND :" + doitien);

    }
}
