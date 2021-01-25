
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

class NextDayCalculatorTest {
    NextDayCalculatorTest() {
    }

    @Test
    void check1() throws ParseException  {
        String input = "01/01/2018";
        String output = "02/01/2018";
        String result = NextDayCalculator.getNextDate(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void check2() throws ParseException {
        String input = "31/01/2018";
        String output = "01/02/2018";
        String result = NextDayCalculator.getNextDate(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void check3() throws ParseException {
        String input = "30/04/2018";
        String output = "01/05/2018";
        String result = NextDayCalculator.getNextDate(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void check4() throws ParseException {
        String input = "28/02/2018";
        String output = "01/03/2018";
        String result = NextDayCalculator.getNextDate(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void check5() throws ParseException {
        String input = "29/02/2020";
        String output = "01/03/2020";
        String result = NextDayCalculator.getNextDate(input);
        Assertions.assertEquals(output, result);
    }

    @Test
    void check6() throws ParseException {
        String input = "31/12/2018";
        String output = "01/01/2019";
        String result = NextDayCalculator.getNextDate(input);
        Assertions.assertEquals(output, result);
    }
}



