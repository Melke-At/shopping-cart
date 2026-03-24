package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartCalculatorTest {

    CartCalculator calculator = new CartCalculator();

    @Test
    void testItemTotal() {
        assertEquals(20.0, calculator.calculateItemTotal(10.0, 2));
    }

    @Test
    void testCartTotal() {
        double[] items = {20.0, 30.0};
        assertEquals(50.0, calculator.calculateCartTotal(items));
    }
}