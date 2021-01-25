package Dao_nguoc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Intergerr {
    public static void main(String[] args) {
      Stack <Integer> stack = new Stack<>();
            int [] arr = new int[5];
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
        System.out.println("số chưa đảo ngược");
        Iterator iterator = stack.iterator();
        while(((Iterator<?>) iterator).hasNext()){
            Object value = iterator.next();
            System.out.print(value + "\n");
        }
        for(int i =0;i< arr.length;i++){
            arr[i] = stack.pop();
        }
        System.out.println("số đã đảo ngược");
        System.out.println(Arrays.toString(arr));

        Stack <String> reverse =new Stack<>();
       String reversee = "tôi là Công Tâm";
        for(int i = 0 ; i < reversee.length();i++){
            reverse.push(String.valueOf(reversee.charAt(i)));
        }
        System.out.println(reversee);
        String outPut = "";
        for (int j = 0; j < reversee.length(); j++) {
            outPut += reverse.pop();
        }
        System.out.println(outPut);
    }
}
