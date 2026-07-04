# 📊 MySQL Course Statistics (Java JDBC Example)

This simple Java program demonstrates how to connect to a **MySQL database** using **JDBC** and perform a SQL query to analyze course purchase statistics.

The example focuses on retrieving data about the number of purchased courses per month in **2018**, along with a calculated average, from a table named `purchaselist`.

---

## 🧠 Purpose

This educational task demonstrates:
- Establishing a connection to a MySQL database using JDBC.
- Executing SQL queries and processing results.
- Using `ResultSet` to read and print query results.
- Practicing basic SQL aggregation (`COUNT`, `GROUP BY`, `MONTH`, `YEAR`).

---

## 🧩 SQL Query Logic

The query calculates:
1. The **month** of the subscription (`MONTH(subscription_date)`).
2. The **total number of courses** purchased that month (`COUNT(*)`).
3. The **average number of courses** per month in 2018  
   (a simple demonstration of calculated columns).

```sql
SELECT 
    MONTH(subscription_date) AS month,
    COUNT(*) AS total_courses,
    COUNT(*) / COUNT(DISTINCT MONTH(subscription_date)) AS average_courses
FROM purchaselist
WHERE YEAR(subscription_date) = 2018
GROUP BY MONTH(subscription_date);
⚙️ How to Run
Configure your database:
Create a MySQL database named skillboxx.
Add a table purchaselist with fields including subscription_date.
Update connection details in Main.java:
String url = "jdbc:mysql://localhost:3306/skillboxx";
String user = "root";
String password = "your_password_here";
Run the program:
javac Main.java
java -cp .:mysql-connector-j-<version>.jar groupId.Main
(Replace <version> with your MySQL Connector/J version.)
🪶 Output Example
1 | 320 | 26.6
2 | 280 | 23.3
3 | 310 | 25.8
...
Each line represents:
month_number | total_courses | average_courses
🧰 Requirements
Java 8+
MySQL Server
MySQL Connector/J (JDBC driver)
🧑‍💻 Author
Rick
Student programmer exploring Java, databases, and backend development.
Focused on mastering the fundamentals of Spring, SQL, and data analysis.
🪐 License
This project is created for educational purposes and released under the MIT License.
