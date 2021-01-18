import java.util.Arrays;
import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        int [] arr1 = new int[3];
        int [] arr2= new int[6];
        int [] arr3 = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr1.length;i++){
            System.out.println("Mảng-1 nhap thu tu " + (i+1) + ":");
            int value = sc.nextInt();
            arr1[i]= value;
        }
        for (int i = 0;i<arr2.length;i++){
            System.out.println("Mảng-2 nhap thu tu " + (i+1) + ":");
            int value = sc.nextInt();
            arr2[i]= value;
        }
        for (int i = 0;i < arr1.length;i++){
           arr3[i] = arr1[i];
        }
        for (int i = 0;i < arr2.length;i++){
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng gộp là :" + Arrays.toString(arr3));
    }
}
