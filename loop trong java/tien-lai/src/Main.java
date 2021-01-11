import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 0;
        int month = 1;
        double laisuat = 1.0;
        System.out.println("nhập số tiền");
        money = sc.nextDouble();
        System.out.println("nhập tháng gửi");
        month = sc.nextInt();
        System.out.println("lãi suất");
        laisuat = sc.nextDouble();

        double total = 0;
        for (int i = 0; i< month ; i++){
            total = money * (laisuat/100/12)*month;

        }
        System.out.println("total " + total);
    }
}
