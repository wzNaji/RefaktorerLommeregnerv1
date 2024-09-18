// Walid Z. Naji
package org.example;

import java.util.Scanner;

/*
ÆNDRINGER:
Mere beskrivende opfordring. Gælder for samtlige 'prints'. l.19
// Omdøbt variabel-navn for klarhed. l.21.
// Viser brugeren de specifikke matematiske operatorer. l.25
// Refaktoreret switch-udtryk for læsbarhed ved brug af IntelliJ forslag om 'enhanced switch-statement' l.29
 // Tilføjet for at håndtere ugyldige indtastninger l.34
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast det første tal: ");

        double førsteTal = scanner.nextDouble();
        System.out.print("Indtast det andet tal: ");
        double andetTal = scanner.nextDouble();

        System.out.println("Vælg operator (+, -, *, /):");

        String operator = scanner.next();
        double resultat;
        switch (operator) {
            case "+" -> resultat = calculator.add(førsteTal, andetTal);
            case "-" -> resultat = calculator.subtract(førsteTal, andetTal);
            case "*" -> resultat = calculator.multiply(førsteTal, andetTal);
            case "/" -> resultat = calculator.divide(førsteTal, andetTal);
            default -> {
                System.out.println("Ugyldig operator");
                return;
            }
        }
        System.out.println("Resultat: " + resultat);


    }
}
/*
ORIGINAL KODE:

Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("skriv første tal: ");
        double a = scanner.nextDouble();
        System.out.print("skriv andet tal: ");
        double b = scanner.nextDouble();
        System.out.println("vælg operator");
        switch (scanner.next()) {
            case "+":System.out.println(calculator.add(a, b)); break;
            case "-":System.out.println(calculator.subtract(a, b)); break;
            case "*":System.out.println(calculator.multiply(a, b)); break;
            case "/":System.out.println(calculator.divide(a, b)); break;
 */
