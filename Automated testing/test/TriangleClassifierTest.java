import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkcase1() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 2;
        String abc = "đây là tam giác đều";
        String result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
        assertEquals(abc,result);
    }
    @Test
    void checkcase2() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 3;
        String abc = "đây là tam giác cân";
        String result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
        assertEquals(abc,result);
    }
    @Test
    void checkcase3() {
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;
        String abc = "tam giác thường";
        String result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
        assertEquals(abc,result);
    }
    @Test
    void checkcase4() {
        double sideA = 8;
        double sideB = 2;
        double sideC = 3;
        String abc = "đây không phải tam giác";
        String result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
        assertEquals(abc,result);
    }
    @Test
    void checkcase5() {
        double sideA = -1;
        double sideB = 2;
        double sideC = 1;
        String abc = "đây không phải tam giác";
        String result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
        assertEquals(abc,result);
    }
    @Test
    void checkcase6() {
        double sideA = 0;
        double sideB = 1;
        double sideC = 1;
        String abc = "đây không phải tam giác";
        String result = TriangleClassifier.checkTriangle(sideA,sideB,sideC);
        assertEquals(abc,result);
    }
}