package com.example.calculatrice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatriceTests {

    private final Calculatrice calculatrice = new Calculatrice();

    @Test
    void addsTwoNumbers() {
        assertEquals(7, calculatrice.add(3, 4));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(2.5, calculatrice.divide(5, 2));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculatrice.divide(5, 0));
    }
}
