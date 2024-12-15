package src.test.java;


import org.junit.jupiter.api.Test;
import src.main.java.v.medvedev.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {

    @Test
    public void testSum() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
    @Test
    public void testMethod() {
        Main main = new Main();
        int sum = main.calculate(1,2,3);
        assertEquals(6, sum);
    }
    @Test
    public void testMethod1() {
        Main main = new Main();
        int sum = main.calculate(1,7,3);
        assertEquals(11, sum);
    }
    @Test
    public void testMethod2() {
        Main main = new Main();
        int sum = main.calculate(2,7,3);
        assertEquals(12, sum);
    }
}
