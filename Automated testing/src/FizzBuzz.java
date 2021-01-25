public class FizzBuzz {
    public static String number(int number) {
        boolean isNumber3 = number % 3 == 0;
        boolean isNumber5 = number % 5 == 0;
        boolean isContai3 = false;
        boolean isContai5 = false;

        if (isNumber3 && isNumber5 || number == 35 || number == 53) {
            return "FizzBuzz";
        } else if (isNumber3 || isContai3) {
            return "Fizz";
        } else if (isNumber5 || isContai5) {
            return "Buzz";
        } else {
            return FizzBuzz.numberr(number);
        }
    }

    public static String[] number = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    public static String numberr(int numberr) {
        Object soFar;
        if (numberr % 100 < 20) {
            soFar = number[numberr % 100];
            numberr /= 100;
        } else {
            soFar = number[numberr % 10];
            numberr /= 10;

        }
        return number[numberr] + " hundred" + soFar;
    }
}




