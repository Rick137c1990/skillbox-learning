# Number Guessing Game 🎲  

This is a simple **Java console game** where the computer generates a random number, and you try to guess it.  
The program gives hints whether the secret number is higher or lower than your guess.  

---

## 📌 Features  

- Generates a random number between **0 and 99**.  
- Asks the player to guess the number.  
- Provides hints:  
  - `"lower"` if your guess is too high.  
  - `"higher"` if your guess is too low.  
- Ends when you guess correctly.  

---

## 🛠️ Requirements  

- **Java 8+** installed on your machine.  

---

## ▶️ How to Run  

1. Save the code into a file named `Main.java`.  
2. Compile the program:  
   ```bash
   javac Main.java
Run the game:  
java Main  

🎮 Example Gameplay  
```
Hello!  
I have chosen a number.  
Enter your guess: 50  
Incorrect, try again.  
Hint: the number is lower than 50  
Enter your guess: 25  
Incorrect, try again.  
Hint: the number is higher than 25  
...
Congratulations! You guessed it.  
The number was 37
```
🚀 Future Improvements  
Add a maximum number of attempts.  
Allow the user to set difficulty levels.  
Enhance the UI with colored console output.  

---
The repository exists purely as a learning and demonstration artifact.  
