Customer Storage Project
This is a simple Java learning project that demonstrates basic object-oriented programming, exception handling, and logging configuration. The project simulates storing customer data with validation of input fields (name, email, and phone number).  
---
Customer class with immutable fields:  
name  
phone  
email  
CustomerStorage class:  
Stores Customer objects in a HashMap.  
Provides methods to:  
Add a new customer with validation.  
Remove a customer by name.  
Retrieve a customer by name.  
List all customers.  
Get the total number of stored customers.  
Custom exceptions:  
LessSetValuesException — when not enough input data is provided.
MoreSetValuesException — when too much input data is provided.
WrongFormatEmailException — when the email format is invalid.
WrongFormatPhoneException — when the phone format is invalid.
Logging configuration using log4j2:  
Console logging.  
Error logs written to logs/errors.log.  
Queries log written to logs/queries.log.  
Input Format  
To add a customer, the input string must follow this structure:  
<FirstName> <LastName> <Email> <PhoneNumber>  
Example:
storage.addCustomer("John Doe john.doe@example.com +71234567890");  
Validation Rules  
Email must match:
[A-Za-z0-9]+@[a-z]+\.[a-z]{2,3}  
Example: john.doe@example.com
Phone number must match:
[+]7[0-9]{10}
Example: +71234567890
Usage Example
public class Main {
    public static void main(String[] args) {
        CustomerStorage storage = new CustomerStorage();

        storage.addCustomer("John Doe john.doe@example.com +71234567890");
        storage.listCustomers();

        Customer customer = storage.getCustomer("John Doe");
        System.out.println("Retrieved: " + customer);

        storage.removeCustomer("John Doe");
        System.out.println("Total customers: " + storage.getCount());
    }
}
Project Structure
src/
├── Customer.java  
├── CustomerStorage.java  
├── LessSetValuesException.java  
├── MoreSetValuesException.java  
├── WrongFormatEmailException.java  
├── WrongFormatPhoneException.java  
resources/  
└── log4j2.xml  
Logging  
Console output — formatted logs for quick debugging.  
Error log — saves all error messages into logs/errors.log.  
Queries log — saves non-error logs into logs/queries.log.  
Requirements  
Java 17+ (recommended)  
Maven/Gradle (optional for dependency management)  
Purpose  
This project was created for educational purposes, focusing on:
Practicing Java fundamentals.
Working with collections (HashMap).
Implementing custom exceptions.
Configuring logging with Log4j2.
