import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void add() {
        assertEquals(0, 5 + -5);
    }

    @Test
    void subtract() {
        assertEquals(12, 32 - 20);
    }

    @Test
    void divide() {
        try {
            assertEquals(2, 12 / 6);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void multiply() {
        assertEquals(12, 6 * 2);
    }

}
