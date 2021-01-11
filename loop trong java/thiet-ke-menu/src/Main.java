import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int chose;
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("0 exit");
        System.out.println("enter your choise");

        while (true){
            chose = sc.nextInt();
        switch (chose) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
                break;
        }

    }
}
}

