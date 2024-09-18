package org.example;

// Importerer Assertions-klassen fra JUnit Jupiter API til brug i test-verifikation (@Test)
import org.junit.jupiter.api.Test;
// Dette erstatter den ældre org.junit.Assert fra JUnit 4.
import org.junit.jupiter.api.Assertions;

/**
 * Denne klasse indeholder tests for Calculator-klassen, der anvender funktioner fra JUnit 5.
 * Hver testmetode tester en anden aritmetisk operation, som Calculator-klassen tilbyder.
 */

/*
ÆNDRINGER:
// I stedet for at instansiere et nyt Calculator-objekt, ved hver metode,
oprettes én instans af Calculator, som vil blive brugt i alle testmetoder.

// Tester add/subtract/multiply,divide metoderne med
foruddefinerede input og forventet output, en delta på 0,1,
og en besked hvis tests skulle fejle.
    */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        double result = calculator.add(1.0, 2.0);
        Assertions.assertEquals(3.0, result, 0.1, "Resultatet af additionen bør være 3.0");
    }

    @Test
    void subtract() {
        double result = calculator.subtract(1.0, 2.0);
        Assertions.assertEquals(-1.0, result, 0.1, "Resultatet af subtraktionen bør være -1.0");
    }

    @Test
    void multiply() {
        double result = calculator.multiply(1.0, 2.0);
        Assertions.assertEquals(2.0, result, 0.1, "Resultatet af multiplikationen bør være 2.0");
    }

    @Test
    void divide() {
        double result = calculator.divide(1.0, 2.0);
        Assertions.assertEquals(0.5, result, 0.1, "Resultatet af divisionen bør være 0.5");
    }
}


/*
ORIGINAL KODE:
import org.junit.Assert;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first,second);
        Assert.assertEquals(3.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first,second);
        Assert.assertEquals(-1.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first,second);
        Assert.assertEquals(2.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calculator = new Calculator();
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first,second);
        Assert.assertEquals(0.5, result, 0.1);
 */
