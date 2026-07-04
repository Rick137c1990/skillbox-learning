# Todo List CLI Application  

This is a simple **command-line Todo List application** written in Java.  
It was created as a practice project to learn about **collections**, **basic input parsing**, and **command handling**.  

## Features  

- **LIST** – show all tasks in the todo list.  
- **ADD \<text\>** – add a new task to the end of the list.  
- **ADD \<index\> \<text\>** – add a task at a specific position in the list.  
- **EDIT \<index\> \<text\>** – replace an existing task at the given index with new text.  
- **DELETE \<index\>** – remove a task from the list by its index.  

## Example Usage  

```bash
> ADD Buy groceries
> ADD 0 Call mom
> LIST
[Call mom, Buy groceries]

> EDIT 1 Buy groceries and fruits
> LIST
[Call mom, Buy groceries and fruits]

> DELETE 0
> LIST
[Buy groceries and fruits]
Implementation Notes
Uses ArrayList<String> to store tasks.
Reads input from the console with Scanner.
Commands are parsed by splitting the input string with whitespace.
Invalid commands return "команда не найдена" (Russian: command not found).
Project Structure
practice/
 ├── TodoList.java   # Business logic for managing the list
 └── Main.java       # CLI interface and command parsing
How to Run
Compile the code:
javac practice/*.java
Run the program:
java practice.Main
Type commands into the console.
