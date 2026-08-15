# 🎓 Student Management System (JDBC)

## 📌 Overview

This project is a **Student Management System** built using **Java JDBC** that performs core database operations such as inserting, updating, deleting, and retrieving student records.
It demonstrates how Java applications interact with relational databases using low-level JDBC APIs.

## 🛠️ Tech Stack

* Java
* JDBC (Java Database Connectivity)
* MySQL (or any relational database)
* IDE: IntelliJ / Eclipse
* HTML,CSS,JS

## ✨ Features

* Add new student records
* View all students
* Update existing student details
* Delete student records
* Database connectivity using JDBC
* Structured and modular code

## 📂 Project Structure

```
Student-Jdbc/
│── src/
│   ├── model/        # Student entity class
│   ├── dao/          # Database operations (CRUD)
│   ├── util/         # DB connection utility
│   └── main/         # Main execution class
│── README.md
```

## ⚙️ Installation & Setup

### 1. Clone Repository

```bash
git clone https://github.com/Vinayak7788722/Student-Jdbc.git
cd Student-Jdbc
```

### 2. Configure Database

* Create a database (e.g., `student_db`)
* Create table:

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);
```

### 3. Update DB Credentials

Update your database username & password in the connection class:

```java
String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "your_password";
```

### 4. Run the Project

* Compile and run the main class

```bash
javac Main.java
java Main
```

## 🔗 CRUD Operations

* Insert Student
* Fetch All Students
* Update Student
* Delete Student

## 🧪 Sample Output

```
1  |  Vinayak  |  22  |  Computer Science
2  |  Rahul    |  21  |  IT
```

## 📌 Key Learnings

* Understanding of JDBC workflow
* Database connection handling
* PreparedStatement usage
* CRUD operations in Java
* Exception handling in DB operations

## 🚀 Future Improvements

* Add GUI (JavaFX / Swing)
* Integrate Spring Boot
* Add validation and logging
* Use connection pooling

## 👨‍💻 Author

Vinayak
