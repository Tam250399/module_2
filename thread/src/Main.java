public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
            new Thread(numberGenerator).start();
        int b = (Thread.MAX_PRIORITY);
        System.out.println(b);

        NumberGenerator2 numberGenerator2 = new NumberGenerator2();
            numberGenerator2.start();
            int a =(Thread.MIN_PRIORITY);
    }
}
