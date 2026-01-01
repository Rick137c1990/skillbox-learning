# Regex & String Java Examples  

## Overview  
This repository contains simple Java examples demonstrating the use of **regular expressions** and **string manipulation**.  
Each class solves a separate task: cleaning phone numbers, splitting text into words, and numbering words in a sentence.  

---

## Structure  

### 1. Regex Tasks  

#### **PhoneCleanerRegex**  
- Cleans a phone number input from extra characters.  
- Supports numbers in the format `8XXXXXXXXXX` or `7XXXXXXXXXX`.  
- Normalizes them to the format `7XXXXXXXXXX`.  
- Validates the result using **regex**.  
- Enter `0` to exit the program.  

**Example:**  
Input: +8 (912) 345-67-89
Output: 79123456789
Input: 0
(program terminates)


#### **SplitText**  
- Removes all characters except Latin letters and spaces.  
- Splits the text into words.  
- Prints each word on a new line.  

**Example:**  
Input: "the really cool day today"
Output:
the
really
cool
day
today

---

### 2. String Task  

#### **SequentialWordsNumbers**  
- Numbers words in a sentence sequentially.  

**Example:**  
```java
String input = "Java is fun";
String result = SequentialWordsNumbers.sequentialWordsNumbers(input);
System.out.println(result);
Output:
(1) Java (2) is (3) fun
How to Run
Compile and run with javac/java:
javac com/sergey/nazarov/app/regex/PhoneCleanerRegex.java
java com.sergey.nazarov.app.regex.PhoneCleanerRegex
Or open the project in IntelliJ IDEA / Eclipse and run the desired class.
```
---
The repository exists purely as a learning and demonstration artifact.
