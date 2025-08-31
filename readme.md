Here’s a clean README.md draft in English for your project:
# PhoneBook Application

A simple **Java console application** that implements a phone book.  
Users can add, search, and list contacts by entering either a phone number, a name, or a command.

---

## Features

- Add new contacts by entering a **phone number** and then a **name** (or vice versa).
- Validate input:
  - Phone numbers must be exactly **11 digits**.
  - Names must start with an uppercase Russian letter and contain only Russian characters.
- Search:
  - Find a contact by **phone number**.
  - Find a contact by **name** (supports multiple numbers per person).
- Display all contacts using the `LIST` command.
- Automatically update or merge contacts if the same name or number is reused.

---

## Commands

- `LIST`  
  Prints all contacts in the format:
Name - PhoneNumber

- `<PhoneNumber>`  
If the number exists, prints the associated contact.  
If not, prompts to enter a name for the new contact.

- `<Name>`  
If the name exists, prints all numbers associated with it.  
If not, prompts to enter a phone number for the new contact.

---

## Example Usage

Введите номер, имя или команду:
89161234567
Такого номера нет в телефонной книге.
Введите имя абонента для номера "89161234567" :
Иван
контакт сохранен!
Введите номер, имя или команду:
LIST
Иван - 89161234567

---

## Project Structure

- **Main.java**  
  Handles user input, manages interaction logic, and connects to the `PhoneBook`.

- **PhoneBook.java**  
  Implements the phone book logic:
  - Contact storage (`TreeMap`)
  - Input validation (regex checks for names and phone numbers)
  - Contact addition, merging, and retrieval

---

## How to Run

1. Clone this repository or copy the files.
2. Compile the project:
   ```bash
   javac practice/*.java
Run the application:
java practice.Main
Possible Improvements
Support English names and flexible name formats.
Better handling of multiple numbers (store as a collection instead of string concatenation).
Persist contacts in a file or database instead of memory.
Add unit tests.
Requirements
Java 11 or higher
Console environment

