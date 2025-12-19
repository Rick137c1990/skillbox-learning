# Booleans — Recipe Ingredients Checker

## Goal
Practice writing conditional statements with multiple boolean expressions.

## Task
In the given project, write code that checks whether there are enough ingredients to prepare certain dishes.

You are given six variables representing the quantities of different ingredients.  
Write `if` statements that verify the amount of ingredients for each recipe.  
If the ingredients are sufficient, print the name of the dish.

## Variables
```java
int milkAmount = 2000;   // ml
int powderAmount = 300;  // g
int eggsCount = 5;       // items
int sugarAmount = 10;    // g
int oilAmount = 30;      // ml
int appleCount = 8;      // items
Examples
1. Apple Juice
Requires at least 5 apples:
if (appleCount >= 5) {
    System.out.println("Apple juice");
}
2. Pancakes
Requires powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml:
if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
    System.out.println("Pancakes");
}
3. Omelette
Requires milk - 300 ml, powder - 5 g, eggs - 5:
if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
    System.out.println("Omelette");
}
4. Apple Pie
Requires apples - 3, milk - 100 ml, powder - 300 g, eggs - 4:
if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
    System.out.println("Apple pie");
}
How It Works
Each recipe uses a separate if statement with multiple conditions connected by the boolean AND (&&) operator.
If all the conditions for a dish are satisfied, its name is printed to the console.
You can change the ingredient quantities to test different scenarios.
```
The repository exists purely as a learning and demonstration artifact.
