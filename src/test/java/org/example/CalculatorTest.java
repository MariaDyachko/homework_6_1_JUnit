package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @DisplayName("Сравнение")
    @Test
    void isItWork() {
        int a = 8;

        Calculator calc = new Calculator();
        int actual = calc.plus.apply(1, 7);
        assertEquals(a, actual);

    }

    @DisplayName("Ловит ошибку")
    @Test
    void catchError() {
        int a = 8;

        Calculator calc = new Calculator();

        var exception = assertThrows(RuntimeException.class, () -> calc.divide.apply(1, 0));

    }

    @DisplayName("Потдверждение ожидаемого")
    @Test
    void catchTruth() {

        Calculator calc = new Calculator();
        int a = 1;
        int actual = calc.divide.apply(1, 1);
        assertTrue(a==actual);
    }

}