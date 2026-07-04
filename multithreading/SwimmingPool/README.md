# SwimmingPool  
---
This project demonstrates a simple simulation written in Java: calculating the time required to fill a swimming pool, given the filling speed of water and the drainage  (devastation) speed.  
Description  
The program models a pool with the following conditions:  
Total pool volume: 1200 liters  
Filling speed: 30 liters per minute  
Drainage speed: 10 liters per minute  
The simulation calculates how many minutes are required to completely fill the pool while accounting for the simultaneous drainage process.  
When the pool is full, the program prints the result:  
время наполнения бассейна составит: X мин.  
How It Works  
The program starts with an empty pool  

```java
(volumeNow = 0).
```
On each iteration (representing one minute):  
Water is added at the filling speed.  
Water is drained at the devastation speed.  
The time counter is incremented until the pool reaches its maximum volume.  
The total time is displayed in minutes.  
Usage  
Requirements  
Java Development Kit (JDK) 8 or higher  
Run  
Compile and run the program from the terminal:  
```java
javac Main.java  
java Main  
```
---
The repository exists purely as a learning and demonstration artifact.
