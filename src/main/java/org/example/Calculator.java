package org.example;

public class Calculator {

    // ÆNDRINGER:
    // Ændret parameter navne fra fx. 'a' til 'førsteTal' for klarhed.
    // Lille fejlhåndtering ved division med 0, l. 20.
    public double add(double førsteTal, double andetTal) {
        return førsteTal + andetTal;
    }

    public double subtract(double førsteTal, double andetTal) {
        return førsteTal - andetTal;
    }

    public double multiply(double førsteTal, double andetTal) {
        return førsteTal * andetTal;
    }

    public double divide(double førsteTal, double andetTal) {
        if (andetTal == 0) {
            throw new IllegalArgumentException("Division med 0 er ikke muligt");
        }
        return førsteTal / andetTal;
    }
}
