# Email List CLI  

A simple Java console application that allows you to manage a list of email addresses.  
The program validates input, stores only properly formatted emails, and can display them in a sorted list.  

---

## Features  

- **Add emails**: Validate email addresses before saving.  
- **List emails**: Display all stored emails in alphabetical order.  
- **Case insensitive**: Emails are stored in lowercase to avoid duplicates.  
- **Simple CLI**: Interactive command-line interface with basic commands.  

---

## Commands

- `ADD <email>` — Add a new email to the list.  
  - Example:  
    ```
    ADD example@mail.com
    ```
  - If the email format is invalid, the program prints:  
    ```
    Неверный формат email
    ```

- `LIST` — Show all saved emails in sorted order.  

- `0` — Exit the program.  

---

## Email Validation Rules  

The email must match the following pattern:  

[A-Za-z0-9]+@[A-Za-z0-9]+[.][A-Za-z]{2,4}  

That means:  
- Only Latin letters and digits are allowed.  
- Domain names cannot contain special symbols.  
- Top-level domain (TLD) must be 2–4 letters (like `.ru`, `.com`, `.info`).  

---

## Example Session  

введите команду или "0"  
ADD John@example.com  
введите команду или "0"  
ADD invalid@@mail  
Неверный формат email  
введите команду или "0"  
LIST  
john@example.com  
введите команду или "0"  
0  

---

## Project Structure  
```java
practice/   
├── EmailList.java # Class for storing and managing emails <br>
└── Main.java # CLI application entry point
```
---

## How to Run  

1. Clone this repository or copy the source files.  
2. Compile the project:  
   ```bash
   javac practice/*.java
Run the program:  
```java
java practice.Main
```
Notes  
This project is created for learning purposes.  
Validation is very basic and does not cover all real-world email formats.  
Can be extended with better regex or additional features.  
---
The repository exists purely as a learning and demonstration artifact.  
