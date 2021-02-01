package bai_tap;

public class EvenThread extends Thread{
    @Override
    public void run() {
        int n = 10;
        for (int i = 0 ; i< n ; i++){
            if(i %2 ==1)
                System.out.println(i);
        }
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
