import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        int [] arr = new int[10000];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        StopWatch abc = new StopWatch();
        abc.StartTime();
//        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        abc.EndTime();
        System.out.println(Arrays.toString(arr));
        System.out.println(abc.getElapsedTime());
    }
}
