# Transactions Simulation

This is a simple educational Java project that simulates **bank accounts** and **money transfers** between them.  
It demonstrates working with classes, object relationships, synchronization, multithreading, and basic fraud detection logic.

---

## Features

- **Account model**  
  Each account stores:
  - Account number  
  - Balance  
  - Blocked status  

- **Bank system**  
  - Transfers between accounts with synchronization  
  - Fraud detection for large transactions (randomized check)  
  - Automatic blocking of accounts if fraud is detected  
  - Calculation of the total balance across all accounts  

- **Concurrent transfers**  
  Transfers run in separate threads (`Transfer` class implements `Runnable`) to simulate simultaneous transactions.

---

## Project Structure

- `Account` — represents a bank account.  
- `Bank` — manages accounts and transfers.  
- `Transfer` — encapsulates a money transfer, executed in a separate thread.  
- `Test1` — demo class with `main()` method to run the simulation.

---

## Example Run

The demo (`Test1`) creates three accounts:

- Account **123** with balance `10000`  
- Account **234** with balance `20000`  
- Account **456** with balance `400000`  

Then it performs several transfers, showing balance updates, blocked accounts, or error messages when money is insufficient.

---

## Build & Run

### Requirements
- Java 17+  
- Maven 3+

### Compile and Run
```bash
# Compile the project
mvn clean package

# Run the demo
java -cp target/Transactions-1.0-SNAPSHOT.jar Test1
Notes
Fraud detection is intentionally randomized (Random.nextBoolean()), so results may vary from run to run.
This project is educational only and not intended for real financial use.
License
This project is provided for learning purposes without any warranty.
