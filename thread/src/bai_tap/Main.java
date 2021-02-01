package bai_tap;

public class Main {
    public static void main(String[] args) {
            OddThread oddThread = new OddThread();
            oddThread.start();

            EvenThread evenThread =new EvenThread();
            evenThread.start();
    }


}
