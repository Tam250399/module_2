package bai_tap;

public class OddThread extends Thread{
    @Override
    public void run() {
            int n = 10;
        for (int i =1; i <= n;i++ ){
            if(i % 2 ==1){
                System.out.println(i);
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
