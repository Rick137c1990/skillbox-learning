# ✈️ Airport Data Analyzer (Java Stream API & Time API)

A small **Java training project** that demonstrates the use of **Streams API**, **Collections**, and **Optional** while working with the [Skillbox Airport](https://github.com/Rik137/StreamAPI/tree/master/lib) library.

The goal is to practice functional-style programming and data processing using an airport simulation model that includes **terminals**, **aircraft**, and **flights**.

---

## 🧩 Features

This project provides utility methods to:

1. **Count aircraft** with a specific model name.
2. **List parked aircraft** for each terminal.
3. **Find all departing flights** within a given number of hours.
4. **Find the earliest arriving flight** for a specific terminal.

---

## 🛠️ Technologies

- **Java 17+**
- **Skillbox Airport library**
- **Java Stream API**
- **Java Time API (Instant)**

---

## 📦 Example Methods

### 1. Count Aircraft by Model
```java
public static long findCountAircraftWithModelAirbus(Airport airport, String model)
Counts all aircraft whose model name starts with a given prefix (e.g. "Airbus").
2. Map of Parked Aircraft per Terminal
public static Map<String, Integer> findMapCountParkedAircraftByTerminalName(Airport airport)
Returns a map where the key is the terminal name and the value is the number of parked aircraft.
3. Flights Departing Soon
public static List<Flight> findFlightsLeavingInTheNextHours(Airport airport, int hours)
Finds all flights scheduled to depart within the next N hours.
4. Earliest Arrival by Terminal
public static Optional<Flight> findFirstFlightArriveToTerminal(Airport airport, String terminalName)
Returns the earliest arriving flight for a given terminal (if any).
▶️ Usage Example
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        long airbusCount = Main.findCountAircraftWithModelAirbus(airport, "Airbus");
        System.out.println("Airbus aircraft count: " + airbusCount);

        List<Flight> upcomingFlights = Main.findFlightsLeavingInTheNextHours(airport, 2);
        upcomingFlights.forEach(f -> System.out.println("Flight: " + f));
    }
}
📚 Learning Objectives
This project demonstrates:
Effective use of the Stream API (map, filter, collect, flatMap).
Handling Optionals safely.
Applying functional programming concepts in Java.
Working with time-based filtering using Instant.
🧠 Author
Created by Rick as part of Java practice and functional programming exercises.
📄 License
This project is distributed for educational purposes only.
