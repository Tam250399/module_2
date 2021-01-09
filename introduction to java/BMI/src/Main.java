import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width,height,bmi;
        System.out.print("nhập width :");
        width = sc.nextDouble();
        System.out.print("nhập height :");
        height = sc.nextDouble();
        bmi = width / Math.pow(height,2);
        System.out.print("BMI :");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
