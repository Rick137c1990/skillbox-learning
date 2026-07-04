# Java Practice Exercises with Arrays  

This repository contains several practice exercises for learning core Java concepts, including **arrays**, **strings**, and **two-dimensional data structures**.  

## Exercises  

### 1. Hospital – Working with Numbers (Patient Temperatures)  

**Description:**  
The program simulates patient temperatures in a hospital, calculates the average temperature, and counts the number of healthy patients.  

**Classes:**  
- `Hospital` – contains methods:  
  - `generatePatientsTemperatures(int patientsCount)` – generates an array of patient temperatures.  
  - `getReport(float[] temperatureData)` – generates a report listing temperatures, average temperature, and number of healthy patients.  
- `Main` – example usage of the `Hospital` class.  

**Example:**  
```java
float[] temperatureData = Hospital.generatePatientsTemperatures(30);
System.out.println(Hospital.getReport(temperatureData));
Translated Hospital report generation:
String report =
        "Patient temperatures: " + listTemperature.trim() +
        "\nAverage temperature: " + result2 +
        "\nNumber of healthy patients: " + numberOfHealthy;
2. ReverseArray – Reversing an Array of Strings
Description:
The program reverses an array of words.
Classes:

ReverseArray – method reverse(String[] strings) returns the array in reverse order.
Main – demonstrates reversing the string "Every hunter wants to know where the pheasant sits".
Example:
String line = "Every hunter wants to know where the pheasant sits";
String[] words = line.split(" ");
ReverseArray.reverse(words);
System.out.println(Arrays.toString(words));
3. TwoDimensionalArray – Two-Dimensional Array with Symbols
Description:
Creates a square two-dimensional array of a given size with the symbol 'X' along the diagonals.
Classes:

TwoDimensionalArray – method getTwoDimensionalArray(int size) creates the array and fills the diagonals with 'X'.
Example:
char[][] array = TwoDimensionalArray.getTwoDimensionalArray(5);
for (char[] row : array) {
    System.out.println(Arrays.toString(row));
}
Requirements
Java 8 or higher
Any Java IDE or compiler
