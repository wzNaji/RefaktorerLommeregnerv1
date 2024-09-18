# Java Calculator Refactoring Project

## Projektbeskrivelse

Dette repository indeholder en refaktoreret version af en simpel Java-baseret lommeregner. Projektet fokuserer på at forbedre og optimere koden i overensstemmelse med Java Style Guide for at forbedre læsbarheden, vedligeholdelsen og generel kodestandard.

## Refaktorering Detaljer

### Main Klasse
1. **Variabelnavne Forbedret:** Variablerne `a` og `b` er blevet omdøbt til `firstNumber` og `secondNumber` for bedre at beskrive deres anvendelse.
2. **Forbedret Brugerinteraktion:** Tekster i bruger prompts er gjort mere beskrivende for at forbedre brugeroplevelsen.
3. **Fejlhåndtering Tilføjet:** Tilføjet fejlhåndtering for at fange ugyldige matematiske operatorer indtastet af brugeren.

### Calculator Klasse
1. **Metode Dokumentation:** Tilføjede Javadoc kommentarer til hver metode for at forklare deres funktionalitet og anvendelse af parametre.
2. **Fejlhåndtering i Division:** Implementeret fejlkontrol i `divide` metoden for at undgå division med nul.

### CalculatorTest Klasse
1. **JUnit 5 Opdatering:** Opdateret alle test til at bruge JUnit 5 biblioteket, hvilket indebærer brug af `Assertions` klassen i stedet for `Assert`.

## Teknologier
- Java 20
- JUnit 5
- IntelliJ IDEA
