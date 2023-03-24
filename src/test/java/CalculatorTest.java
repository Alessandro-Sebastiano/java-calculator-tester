import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(5, -5));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.subtract(32, 20));
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        try {
            assertEquals(2, calculator.divide(12, 6));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(6, 2));
    }

}
