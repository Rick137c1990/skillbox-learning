# Cargo & Elevator Project

This project demonstrates two separate tasks implemented in Java:

1. **Elevator Simulation**  
   - An `Elevator` class that can move between floors within specified limits (`minFloor` and `maxFloor`).  
   - The program checks if the requested floor exists, prevents invalid input, and simulates movement step by step, printing each floor passed.

2. **Cargo Management**  
   - A `Cargo` class that represents immutable cargo properties:  
     - `Dimensions` (length, width, height)  
     - `weight`  
     - `deliveryAddress`  
     - `isItPossibleToFlip` (can it be flipped or not)  
     - `registrationNumber`  
     - `isTheCargoFragile` (whether it’s fragile)  
   - Uses immutability pattern: any "setter" actually creates a new `Cargo` object with updated data.  
   - A `toString()` method displays full cargo information in human-readable form.  

## Project Structure

- `Cargo.java` — immutable cargo entity with fields and copy-setters.  
- `Dimensions.java` — stores cargo dimensions and supports immutability.  
- `Elevator.java` — simulates an elevator moving between floors, validating input.  
- `Main.java` — runs both tasks:  
  1. Creates and modifies cargo examples.  
  2. Starts an interactive console loop for elevator simulation.  

## How to Run

1. Compile the project:
   ```bash
   javac Main.java
Run the program:
java Main
In the console:
First, cargo examples are shown.
Then, the program asks for a floor number. Enter a number within the allowed range to simulate elevator movement.

## Example Output

Cargo characteristics:
dimensions = Dimensions{length=130, width=120, height=100}
weight = 100
delivery address = Moscow
can it be flipped? = yes
registration number = 12357rsdc54
fragile? = no
Enter floor number:


