package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(4,calc.add(2,2));
        assertEquals(10,calc.add(4,6));
    }

    @Test
    void testMultiply() {
        assertEquals(4,calc.multiply(2,2));
        assertEquals(10,calc.multiply(2,5));
    }

    @Test
    void testAddPositiveNumbers() {
        assertEquals(4,calc.addPositiveNumbers(2,2));
        assertThrows(IllegalArgumentException.class,()-> calc.addPositiveNumbers(-2,2));
    }

}