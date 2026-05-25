# 🏨 Hotel Reservation System (Java + JDBC + MySQL)

## 📌 Project Overview

Hotel Reservation System is a console-based Java application that allows users to manage hotel room reservations. The project uses **Java**, **JDBC**, and **MySQL** to perform database operations such as creating, viewing, updating, and deleting reservations.

This project is being developed to strengthen practical skills in:

* Object-Oriented Programming (OOP)
* JDBC (Java Database Connectivity)
* MySQL Database Management
* CRUD Operations
* Real-world Java Application Development

---

## 🚀 Features

### ✅ Current Features

* Reserve a Room
* View Reservations
* Get Room Number
* Update Reservation
* Delete Reservation
* Database Connectivity using JDBC

### 🔄 Features Under Development

* Input Validation
* Better Error Handling
* Room Availability Checking
* Search Reservation by Guest Name
* Improved User Interface
* Additional Reports and Statistics

---

## 🛠 Technologies Used

* Java
* JDBC
* MySQL
* VS Code

---

## 📂 Project Structure

```text
HotelReservationSystem/
│
├── src/
│   └── HotelReservation.java
│
├── lib/
│   └── mysql-connector-j.jar
│
├── bin/
│
└── README.md
```

---

## 🗄 Database

### Database Name

```sql
hotel_db
```

### Example Table Structure

```sql
CREATE TABLE reservations (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_name VARCHAR(100),
    room_number INT,
    contact_number VARCHAR(20),
    reservation_date DATE
);
```

---

## ⚙️ Setup Instructions

### 1. Clone Repository

```bash
git clone <repository-link>
```

### 2. Open Project in VS Code

```bash
code .
```

### 3. Add MySQL JDBC Driver

Download MySQL Connector/J and place it inside the `lib` folder.

### 4. Configure Database Credentials

```java
private static final String url =
    "jdbc:mysql://localhost:3306/hotel_db";

private static final String username = "root";

private static final String password = "your_password";
```

### 5. Run the Project

Compile and run the application from VS Code.

---

## 📋 Menu

```text
HOTEL MANAGEMENT SYSTEM

1. Reserve a Room
2. View Reservations
3. Get Room Number
4. Update Reservation
5. Delete Reservation
0. Exit
```

---

## 🎯 Learning Objectives

Through this project, I am learning:

* JDBC Driver Management
* Database Connections
* SQL Queries in Java
* CRUD Operations
* Exception Handling
* Building Real-World Java Applications

---

## 👨‍💻 Author

**Asad Ullah**

Computer Science Student | Java Developer | Learning JDBC & MySQL

GitHub: [asadullahdev5](https://github.com/asadullahdev5?utm_source=chatgpt.com)

---

## 📌 Project Status

🚧 **Currently Under Development**

This project is actively being developed and new features will be added over time as part of my Java + JDBC + MySQL learning journey.

