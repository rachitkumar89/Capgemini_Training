package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(7, c.add(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, c.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, c.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            c.divide(5, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}