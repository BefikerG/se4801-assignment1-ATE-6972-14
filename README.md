# 🚀 SE 4801: Enterprise Application Development — Assignment 1

**Addis Ababa University**  
Department of Software Engineering  

- **Student Name:** Befiker Gezahegn  
- **Student ID:** ATE/6972/14  
- **Academic Year:** 2026  
- **Instructor:** Abel Tadesse

---

## 📌 Project Overview

This repository contains the full implementation of **Assignment 1**, focusing on advanced **Java 21 concepts** and the development of the **ShopWave-Starter** enterprise backend using **Spring Boot 3.x**.

### 🔍 Key Demonstrations

- **Enterprise Design Patterns**
  - Layered Architecture
  - DTO (Data Transfer Object) Pattern

- **SOLID Principles**
  - Clean, maintainable, and loosely coupled code

- **Modern Java Features**
  - Streams API
  - Generics
  - Java 21 Records

- **Automated Testing**
  - Unit & Integration Testing with JUnit 5 and Mockito

---

## 🛠️ Tech Stack

| Component     | Technology              |
|--------------|------------------------|
| Language      | Java 21 (OpenJDK)      |
| Framework     | Spring Boot 3.5.12     |
| Build Tool    | Apache Maven           |
| Database      | H2 (In-Memory)         |
| Testing       | JUnit 5, Mockito, AssertJ |
| Dev Tools     | Lombok, Spring Boot Actuator |

---

## 📁 Repository Structure

```bash
se4801-assignment1-ATE697214/
│
├── src/
│   ├── main/
│   │   └── java/com/shopwave/
│   │       ├── controller/     # REST API endpoints (Section C4)
│   │       ├── service/        # Business logic layer (Section C2)
│   │       ├── repository/     # Data access layer (Section C1)
│   │       ├── dto/            # Data Transfer Objects
│   │       └── model/          # JPA entity classes
│   │
│   └── test/
│       └── java/com/shopwave/
│           └── ...             # Unit & integration tests (Section C5)
│
├── pom.xml                     # Maven configuration & dependencies
└── README.md                  # Project documentation
```

## ⚙️ Build the Project

```bash
./mvnw clean package
```
- Compiles all source code
-	Runs all tests
-	Generates a .jar file in the target/ directory


## ▶️ Run the Application

```bash
./mvnw spring-boot:run
```
- Default Port: 8080
- H2 Console: http://localhost:8080/h2-console

## 🧪 Run Tests

```bash
./mvnw test
```
- Runs unit tests and integration tests

## 📊 Testing Coverage

- **Test Modules**
  - ProductServiceTest
  - Tests business logic
	-	Uses mocked repository layer
	-	ProductControllerTest
	-	Validates REST endpoints
	-	Checks HTTP status codes and responses
	-	ShopwaveStarterApplicationTests
	-	Verifies Spring Boot application context loads successfully

---

- **Coverage Focus** 
  -	Business logic validation
	-	API contract correctness
	-	Application startup integrity

---

## 🤖 AI Assistance Disclosure

This project was primarily designed and implemented independently, with AI tools used selectively to support productivity and improve code quality where appropriate.

### Scope of AI Assistance

AI was utilized in the following areas:

- **Technical Documentation**
  - Assisted in structuring and refining the written report (PDF)
  - Improved clarity, grammar, and professional tone  

- **Code Refactoring & Optimization**
  - Suggested improvements for readability and maintainability  
  - Assisted with Java Stream operations and clean code practices  

- **Repetitive / Boilerplate Code**
  - Supported generation of standard or repetitive class structures  
  - Reduced manual effort for routine implementation patterns  

---

### Author Contribution

- All **core architecture decisions** (system design, layering, and logic flow) were made independently  
- All **key components** (entities, services, controllers) were implemented and validated by the author  
- AI was used strictly as a **supporting tool**, not as a replacement for understanding or development  

---

### Statement of Integrity

The use of AI in this project aligns with academic guidelines and was limited to enhancing efficiency, documentation quality, and code refinement, while maintaining full ownership and understanding of the final implementation.
