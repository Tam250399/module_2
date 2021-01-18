import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] deleteArray = {10,4,6,7,8,6,0,0,0};
       for (int i = 0 ; i< deleteArray.length;i++){
           System.out.print(deleteArray[i]);
       }
       System.out.println();
       System.out.print("nhập số cần xóa");
       int xoa = sc.nextInt();

       for (int i = 0 ; i<deleteArray.length-1;i++){
           if (xoa == deleteArray[i]){
               for (int j = i;j<deleteArray.length-1;j++){
                   deleteArray[j] = deleteArray[j+1];
               }
           }
       }
       System.out.print(Arrays.toString(deleteArray));

    }
}


