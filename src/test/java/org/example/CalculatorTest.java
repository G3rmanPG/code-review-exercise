package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding two positive numbers returns their sum")
    void addTwoPositiveNumbers() {
        // Arrange
        int a = 2;
        int b = 3;
        int expected = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Subtracting two numbers returns the difference")
    void subtractTwoNumbers() {
        // Arrange
        int a = 3;
        int b = 2;
        int expected = 1;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Test
    @DisplayName("Multiplying two numbers returns the product")
    void multiplyTwoNumbers() {
        // Arrange
        int a = 2;
        int b = 3;
        int expected = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Dividing two numbers returns the quotient")
    void divideTwoNumbers() {
        // Arrange
        int a = 5;
        int  b = 2;
        double expected = 2.5;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Dividing by zero throws IllegalArgumentException")
    void divideByZeroThrowsException() {
        // Arrange
        int a = 5;
        int b = 0;

        // Act & Assert
        // Nota: En JUnit 5, Act y Assert se combinan al probar excepciones con assertThrows
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }

    @Test
    @DisplayName("Raising a number to a power returns the correct result")
    void powerReturnsCorrectResult() {
        // Arrange
        int base = 2;
        int exponent = 3;
        int expected = 8;

        // Act
        double result = calculator.power(base, exponent);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("In case exponent is negative")
    void powerReturnsCorrectResultInCaseExponentIsNegative() {
        // Arrange
        int base = 2;
        int exponent = -1;
        double expected = 0.5;

        // Act
        double result = calculator.power(base, exponent);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("In case exponent is zero")
    void powerReturnsCorrectResultInCaseExponentIsZero() {
        // Arrange
        int base = 200;
        int exponent = 0;
        int expected = 1;

        // Act
        double result = calculator.power(base, exponent);

        // Assert
        assertEquals(expected, result);
    }

}