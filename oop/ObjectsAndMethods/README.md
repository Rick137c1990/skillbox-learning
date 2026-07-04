# ObjectsAndMethods

This is a Java class that represents a **shopping basket**.  
You can add items, track total price and weight, and print the basket contents.  

---

## 📌 Features
- Tracks total number of baskets created.
- Add items with optional quantity and weight.
- Prevents adding duplicate items or exceeding price limit.
- Clear the basket.
- Get total price and total weight.
- Print the basket contents.

---

## 🛠️ Requirements
- **Java 8+** installed on your system.

---

## ▶️ How to Use

```java
Basket basket = new Basket();
basket.add("Apple", 50, 2, 0.3);
basket.add("Banana", 30);
basket.print("My Shopping Basket");
System.out.println("Total price: " + basket.getTotalPrice());
System.out.println("Total weight: " + basket.getTotalWeight());
🎮 Example Output
My Shopping Basket
Item list:
Apple - 2 pcs - 50
Banana - 1 pcs - 30
Total price: 130
Total weight: 0.6
