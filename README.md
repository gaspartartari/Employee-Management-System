# Employee Management System

This Java application serves as a simple Employee Management System, showcasing basic CRUD operations (Create, Read, Update, Delete) for both departments and employees. As a student eager to demonstrate programming skills and attract potential recruiters, this project offers a practical example of Java development.

## Overview

The repository contains two main classes: `App` and `App2`. The `App` class illustrates employee-related operations (sellers), while the `App2` class focuses on department-related operations. The structure includes DAO (Data Access Object) classes for sellers and departments, complemented by JDBC implementations for efficient database interactions.

## Getting Started

Follow these steps to run the application:

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Compile the Java files:
   ```bash
   javac -cp .:<path-to-jdbc-driver-jar> application/*.java db/*.java model/dao/*.java model/dao/impl/*.java model/entities/*.java
   ```

3. Run the `App` class:
   ```bash
   java -cp .:<path-to-jdbc-driver-jar> application.App
   ```

4. Run the `App2` class:
   ```bash
   java -cp .:<path-to-jdbc-driver-jar> application.App2
   ```

## Tests

The application includes various tests demonstrating different functionalities:

- Test 1: Find a seller by ID
- Test 2: Find sellers by department
- Test 3: Find all sellers
- Test 4: Insert a new seller
- Test 5: Update seller information
- Test 6: Delete a seller

For departments:

- Test 1: Insert a new department
- Test 2: Update department information
- Test 3: Delete a department
- Test 4: Find a department by ID
- Test 5: Find all departments

## Database Configuration

Configure the database connection in the `db.properties` file. Update it with your database details:

```properties
dburl=jdbc:mysql://localhost:3306/your_database_name
user=your_username
password=your_password
```

## Feedback

For any inquiries or feedback, feel free to contact me:

- Email: gaspartartari@gmail.com


Explore and use this application as a testament to your programming skills. Thank you for checking out my project!
