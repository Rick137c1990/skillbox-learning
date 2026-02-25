# 🏫 Hibernate Course Management System  

A **Java + Hibernate** educational project that demonstrates working with **relational databases**, **composite primary keys**, and **entity  relationships**.  
The project models a simple **online learning platform**, including entities for students, teachers, courses, subscriptions, and purchase lists.  

---

## 🚀 Features  

- Entity mapping using **JPA annotations**  
- Composite keys with `@Embeddable` and `@EmbeddedId`  
- Database schema auto-generation from SQL dump files  
- Linking tables (`LinkedPurchaseList`) created programmatically  
- Data import via SQL scripts using Hibernate sessions  
- Configuration and session management via `hibernate.cfg.xml`  
 
---

## 🧩 Project Structure  
```java
src/  
└── groupId/  
├── Main.java # Entry point  
├── FactoryBuildTablesAndAddInfo # Utility for table creation & data import  
├── Course.java # Course entity  
├── Student.java # Student entity  
├── Teacher.java # Teacher entity  
├── Subscription.java # Subscription entity  
├── PurchaseList.java # Purchase list (with composite key)  
├── LinkedPurchaseList.java # Link between subscriptions and purchases  
├── Type.java # Enum for course types  
└── keyIdClass/  
├── PurchaselistKey.java  
├── SubscriptionKey.java  
└── KeyLinkedPurchaseList.java  
config/  
├── hibernate.cfg.xml # Hibernate configuration  
├── getStatements.txt # SQL statements for schema creation  
└── skillbox_dump_wfk.sql # Data dump for table population  
```
---

## ⚙️ Technologies Used  

| Component | Technology |  
|------------|-------------|  
| Language | Java 17+ |  
| ORM | Hibernate 5.x |  
| Database | MySQL 8.x |  
| Build Tool | Maven |  
| JPA | javax.persistence annotations |  

---

## 🧠 How It Works

1. **Schema Initialization:**  
   The class `FactoryBuildTablesAndAddInfo` reads SQL statements from `config/getStatements.txt` and executes them using Hibernate sessions.

2. **Data Population:**  
   The data from `config/skillbox_dump_wfk.sql` is inserted into the database. Duplicate entries are ignored using `INSERT IGNORE`.

3. **Link Table Generation:**  
   The method `addInfoToLinkedPurchaseList()` scans the `Subscription` table and automatically fills the `LinkedPurchaseList` table with unique pairs of `(student_id, course_id)`.

4. **Entity Mapping:**  
   - Each entity corresponds to a database table.
   - Composite keys are defined via `@EmbeddedId` and `@Embeddable` classes.
   - Relationships (`@ManyToOne`, `@JoinColumn`, `@Enumerated`) are used where applicable.

---

## 🧰 Setup & Run Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/hibernate-course-management.git
cd hibernate-course-management
```
2. Configure Database
Create a MySQL database:
```
CREATE DATABASE my_shema CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
Update credentials in:
src/main/resources/hibernate.cfg.xml
<property name="connection.username">root</property>
<property name="connection.password">your_password</property>
<property name="connection.url">jdbc:mysql://localhost:3306/my_shema?useSSL=false&amp;serverTimezone=UTC</property>
```
4. Build and Run
Compile and execute using Maven or directly from your IDE:
```bash
mvn clean compile exec:java -Dexec.mainClass="groupId.Main"
```
🧮 Example Output
After successful execution, Hibernate will:
Create the tables defined in getStatements.txt
Insert all data from the SQL dump
Generate entries in the linkedpurchaselist table
Log SQL operations to the console
Example console output:
```bash
Hibernate: insert into linkedpurchaselist (student_id, course_id) values (?, ?)
Hibernate: select * from courses
Hibernate: commit
```
🧠 Educational Purpose
This project was created as part of a Java persistence and Hibernate learning module.
It helps understand:
How ORM maps Java objects to database tables
How to use composite primary keys
How to automate linking tables using programmatic logic
📜 License
This project is distributed for educational purposes only.
No license restrictions apply for non-commercial use.
---
The repository exists purely as a learning and demonstration artifact.
