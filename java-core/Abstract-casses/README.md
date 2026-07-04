# Company Salary Simulation  

This is a simple educational Java project that simulates a company with different types of employees. It demonstrates object-oriented programming  principles, use of collections, and basic sorting/comparison of data.  
Project Overview  
The project models a company with three types of employees:
Operator — receives a fixed salary in the range of 45,000–50,000.
Manager — (implementation not shown here, but typically generates company income and has a base salary).
TopManager — receives a high base salary, with a bonus if the company income exceeds 10,000,000.
The company keeps track of:
Total number of employees
Number of operators, managers, and top managers
Company income
Employee salaries
The system supports hiring, mass hiring, firing, and retrieving lists of employees with the highest or lowest salaries.
Key Features
Hire employees individually or in bulk
Fire employees randomly
Track company statistics (total staff, employee categories, company income)
Get top salary staff (list of highest salaries)
Get lowest salary staff (list of lowest salaries)
Print employee salaries by role
Classes
Company — manages employees and income.
Employee (interface) — defines the getMonthSalary() method and comparison logic.
Operator — simple employee with a fixed salary.
Manager — generates income for the company (implementation assumed).
TopManager — salary depends on company income.
Main — entry point with example usage.
Example Output
java.example.sergeynazarov.Company: Tinkoff Bank
---------------------------
Staff: 270
Including:
Top managers: 10
Managers: 80
Operators: 180
---------------------------
Company income: 100000000.0 RUB
---------------------------

Top salaries:
top manager -> 380000.0 dollars
...

Lowest salaries:
operator -> 45000.0 dollars
...

Firing 50 employees...
How to Run
Clone or download the project.
Compile all .java files in the my.example.sergeynazarov package.
Run the Main class:
javac my/example/sergeynazarov/*.java
java my.example.sergeynazarov.Main
Purpose
This project is created for educational purposes. It demonstrates:
Basic OOP concepts (inheritance, interfaces, polymorphism)
Use of ArrayList for storing employees
Sorting and comparing objects
Random number generation
Working with class methods and fields
License
This project is for learning purposes only. No license is attached.
