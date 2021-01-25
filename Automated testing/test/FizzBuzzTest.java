import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void number() {
        int a = 5;
        String b = "Buzz";
        String result = FizzBuzz.number(a);
        assertEquals(b,result);
    }
    @Test
    void number1() {
        int a = 9;
        String b = "Fizz";
        String result = FizzBuzz.number(a);
        assertEquals(b,result);
    }
    @Test
    void number2() {
        int a = 35;
        String b = "FizzBuzz";
        String result = FizzBuzz.number(a);
        assertEquals(b,result);
    }
    @Test
    void number3() {
        int a = 53;
        String b = "FizzBuzz";
        String result = FizzBuzz.number(a);
        assertEquals(b,result);
    }
    @Test
    void number4() {
        int a = 9;
        String b = "chín";
        String result = FizzBuzz.number(a);
        assertEquals(b,result);
    }
}