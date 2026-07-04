# Factorial Calculator (Java)

This is a simple Java console program that calculates the factorial of a given number.  
The user is prompted to enter a number, and the program outputs the factorial along with the calculation steps.

## Features
- Handles negative numbers (prints a warning message).
- Special cases for `0`, `1`, and `2`.
- Shows the full multiplication chain for factorial calculation (e.g., `5! = 1 * 2 * 3 * 4 * 5 = 120`).

## Example
Enter a number to calculate its factorial:
5
5! = 1 * 2 * 3 * 4 * 5 = 120

## Requirements
- Java 17 or later (switch expressions are used).

## How to Run
1. Compile the program:
   ```bash
   javac Main.java
Run it:
java Main
Enter a number when prompted.
Notes
If you enter a negative number or 0, the program will print:
"не является натуральным числом" (Russian: "is not a natural number").
Factorial is only defined for non-negative integers, but this program explicitly treats 0 as not natural.

