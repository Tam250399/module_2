public class Main {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        boolean c = true;
       for(int i = number;i<100;i++){
            c = isPrime(number);
            if(c == true){
                System.out.println(number);
                count ++;
            }
            number ++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
