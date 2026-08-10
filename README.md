# Second-Hand Electronics Trading Platform

##  Project Overview

The **Second-Hand Electronics Trading Platform** is a web-based application designed to provide a convenient and reliable platform for users to buy and sell used electronic products. The system allows users to register, log in, list their used electronics for sale, browse available products, and manage their listings.

The platform aims to make second-hand electronics trading easier, more organized, and accessible while promoting the reuse of electronic devices.

---

##  Problem Statement

Buying and selling second-hand electronic products through informal platforms can be difficult due to limited product information, lack of organization, and trust-related issues.

The proposed system provides a centralized online platform where users can securely list, browse, and manage second-hand electronic products.

---

##  Objectives

* Provide an online platform for buying and selling used electronics.
* Allow users to create accounts and securely log in.
* Allow sellers to add and manage electronic product listings.
* Allow buyers to browse available products.
* Store user and product information in a structured database.
* Provide a simple and user-friendly interface.
* Reduce electronic waste by encouraging reuse of electronic devices.

---

##  Main Features

### User Module

* User registration
* User login
* User account management

### Product Module

* Add electronic products
* View available products
* Update product details
* Delete product listings
* Search and browse products

### Database Module

* User data management
* Product information storage
* MySQL database integration

### Future Features

* Product search and filtering
* Product images
* Seller ratings and reviews
* Wishlist
* Buyer-seller messaging
* Online payment integration
* Order and transaction management

---

##  Technology Stack

| Technology  | Purpose                 |
| ----------- | ----------------------- |
| Java        | Backend programming     |
| Spring Boot | Backend framework       |
| HTML        | Frontend structure      |
| CSS         | Frontend styling        |
| JavaScript  | Frontend functionality  |
| MySQL       | Database                |
| Postman     | API testing             |
| VS Code     | Development environment |
| GitHub      | Version control         |

---

##  System Architecture

The application follows a layered architecture:

```text
User
  ↓
Frontend
(HTML / CSS / JavaScript)
  ↓
REST API
  ↓
Spring Boot Backend
  ↓
Service Layer
  ↓
Repository Layer
  ↓
MySQL Database
```

---

##  Database

The project uses **MySQL** as the relational database.

The database stores information such as:

* User details
* Product details
* Product listings
* Other transaction-related information

Database schema files will be maintained in the `database` directory.

---

##  Project Structure

```text
Capstone-Project-
│
├── README.md
│
├── docs/
│   ├── problem-statement.md
│   ├── domain-study.md
│   ├── architecture-diagram.png
│   ├── er-diagram.png
│   └── class-diagram.png
│
├── database/
│   └── schema.sql
│
└── secondhand-electronics/
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    ├── .mvn/
    └── src/
        ├── main/
        │   ├── java/
        │   └── resources/
        └── test/
```

---

##  Security

The application will implement basic security practices such as:

* User authentication
* Input validation
* Secure database configuration
* Protection of sensitive configuration information

Passwords and other sensitive credentials should not be stored directly in the GitHub repository.

---

##  API Testing

The backend APIs are tested using **Postman**.

Current testing includes:

* User registration
* User login
* Product-related API operations

---

##  How to Run the Project

### Prerequisites

Install the following:

* Java JDK 21
* MySQL 8.0
* VS Code
* Postman

### Step 1: Clone the repository

```bash
git clone https://github.com/Manickavasagam-00/Capstone-Project-.git
```

### Step 2: Open the backend project

Open the `secondhand-electronics` folder in VS Code.

### Step 3: Configure MySQL

Create the required database in MySQL and configure the database connection in:

```text
src/main/resources/application.properties
```

### Step 4: Run the application

Using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

The application will run at:

```text
http://localhost:8080
```

---

##  Current MVP Status

### Completed

*  Project setup
*  Spring Boot backend
*  MySQL database connection
*  User registration
*  User login
*  REST API implementation
*  API testing using Postman
*  Basic frontend pages
*  GitHub repository setup

### In Progress

*  Complete product CRUD
*  Product search and filtering
*  Unit testing
*  GitHub Actions CI
*  Cloud deployment
*  Additional security features

---

##  Development Plan

| Week   | Development Activity                                                |
| ------ | ------------------------------------------------------------------- |
| Week 1 | Problem statement, domain study, technology stack and project setup |
| Week 2 | Architecture, ER/Class diagrams, database schema and MVP            |
| Week 3 | Core backend APIs and frontend integration                          |
| Week 4 | Authentication and remaining CRUD modules                           |
| Week 5 | Unit testing and GitHub Actions CI                                  |
| Week 6 | Cloud deployment and security checks                                |
| Week 7 | Enhancement research and proof of concept                           |
| Week 8 | Enhancement implementation, testing and integration                 |

---

##  Future Enhancements

The platform can be extended with:

* AI-based product recommendations
* Advanced product search
* Price comparison
* Seller verification
* Ratings and reviews
* Buyer-seller chat
* Online payment
* Order tracking
* Image-based product search
* Cloud deployment

---

##  Project

**Project Title:** Second-Hand Electronics Trading Platform

**Project Type:** Capstone Project

**Technology:** Java, Spring Boot, MySQL, HTML, CSS, JavaScript

**Development Environment:** Visual Studio Code

**Version Control:** GitHub
