# Arithmetic Operations in Java ➕

This project is a simple Java application created for practicing basic object-oriented programming concepts and arithmetic operations.

It demonstrates how to work with a custom `Arithmetic` class that encapsulates two numbers and provides methods for common operations.

---

## 📌 Features

- Addition of two numbers  
- Multiplication of two numbers  
- Determining the larger of two numbers  
- Determining the smaller of two numbers  

---

## 🧱 Project Structure

The core logic is implemented in a custom `Arithmetic` class which:
- Stores two numeric values as fields
- Provides methods to perform arithmetic and comparison operations on them

---

## 🛠️ Requirements

- Java 8 or higher

---

## ▶️ Usage Example

Below is an example of how the `Arithmetic` class can be used inside a `main` method:

```java
Arithmetic values = new Arithmetic(9, 7);

System.out.println(values.addition());       // 16
System.out.println(values.multiplication()); // 63
System.out.println(values.moreNumber());     // 9
System.out.println(values.lessNumber());     // 7
```

🎮 Example Output
```java
16
63
9
7
```
⚠️ Notes
The project is intended for educational purposes.
The class currently works with integer values.
Method names are kept simple for learning clarity.

🚀 Possible Improvements
Support for floating-point numbers
Improved method naming to better follow Java conventions
Unit tests for arithmetic operations
---
The repository exists purely as a learning and demonstration artifact.
