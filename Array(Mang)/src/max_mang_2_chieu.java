import java.util.Scanner;

public class max_mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m ;
        int n ;
        System.out.println("nhập số dòng của mảng");
        m = sc.nextInt();
        System.out.println("nhập số cột của mảng");
        n = sc.nextInt();
        int[][] max= new int [m][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                max[i][j] = sc.nextInt();
            }
        }
        int c = max[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (c < max[i][j]) {
                    c = max[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + c);
    }
    }

