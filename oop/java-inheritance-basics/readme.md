# Bank Account Inheritance Practice

This project is a simple **Java OOP practice** that demonstrates class inheritance, method overriding, and encapsulation using a banking system as an example.

## Project Structure

The project is located in the `practice` package and includes the following classes:

### 1. `BankAccount`
A base class representing a generic bank account.

- **Fields**:
  - `protected double sum` – current account balance.

- **Methods**:
  - `getAmount()` – returns the current balance.
  - `put(double amountToPut)` – adds funds to the account if the amount is positive.
  - `take(double amountToTake)` – withdraws funds if there is enough balance.

### 2. `CardAccount`
A subclass of `BankAccount` that simulates withdrawals with a **1% commission**.

- **Overridden Method**:
  - `take(double amountToTake)` – subtracts the requested amount plus a 1% fee if the balance is sufficient.

### 3. `DepositAccount`
A subclass of `BankAccount` that restricts withdrawals:  
money can only be withdrawn **at least one month after the last deposit**.

- **Fields**:
  - `private LocalDate lastIncome` – stores the date of the last deposit.

- **Overridden Methods**:
  - `put(double amountToPut)` – adds money and updates `lastIncome`.
  - `take(double amountToTake)` – allows withdrawal only if **at least one month** has passed since the last deposit.

### 4. `Main`
Entry point of the program.

```java
public static void main(String[] args) {
    BankAccount bankAccount = new DepositAccount();
    bankAccount.put(999.99);
    System.out.println(bankAccount.getAmount());
}
This example:
Creates a DepositAccount.
Deposits 999.99.
Prints the current balance.
Concepts Practiced
Inheritance – CardAccount and DepositAccount extend BankAccount.
Method overriding – customized behavior of take() and put().
Encapsulation – balance is managed through methods, not directly accessible.
Java Time API – LocalDate and Period for handling deposit restrictions.
How to Run
Clone or copy the project.
Compile all .java files inside the practice package:
javac practice/*.java
Run the program:
java practice.Main
Example Output
999.99

