# Spring Boot Learning Project

## Overview

This project is a beginner-friendly Spring Boot application created to learn the fundamentals of Spring Boot, Spring MVC, Thymeleaf, and web application development.

The project is being developed incrementally, with each feature added to understand a new Spring Boot concept rather than simply using pre-built solutions.

---

## Technology Stack

- Java 21 (LTS)
- Spring Boot 3.x
- Maven
- Spring Web
- Thymeleaf
- HTML
- CSS
- VS Code

---

## Objectives

The purpose of this project is to learn:

- Spring Boot project structure
- Controllers
- HTTP Requests (GET & POST)
- Thymeleaf Template Engine
- MVC Architecture
- Form Handling
- Basic Authentication
- Deployment
- Database Integration (Upcoming)
- Spring Security (Upcoming)

---

## Project Structure

```
src
 └── main
      ├── java
      │      └── com.example.helloapp
      │              HelloappApplication.java
      │              HelloController.java
      │
      └── resources
             ├── static
             └── templates
                    index.html
                    welcome.html
```

---

## Features Implemented

### 1. Spring Boot Setup

Created the project using Spring Initializr.

Dependencies:

- Spring Web
- Thymeleaf

---

### 2. Hello Endpoint

Initial controller:

```
GET /hello?name=Alok
```

Response:

```
Hello Alok
```

Concepts Learned:

- @RestController
- @GetMapping
- @RequestParam

---

### 3. Thymeleaf Integration

Replaced plain text responses with HTML templates.

Created:

- index.html
- hello.html

Concepts Learned:

- MVC Pattern
- @Controller
- Model
- Thymeleaf Expressions
- Dynamic HTML

---

### 4. Interactive Form

Instead of passing parameters in the URL, users now submit a form.

Example:

```
Name
Age
Favorite Language

Generate Greeting
```

The controller receives the submitted data and renders a dynamic response page.

Concepts Learned:

- HTML Forms
- POST Requests
- @PostMapping
- Form Submission

---

### 5. Basic Authentication

Implemented a simple login system.

Current credentials:

Username:

```
admin
```

Password:

```
12345
```

Flow:

```
Login Page
        ↓
POST /login
        ↓
Controller
        ↓
Credential Validation
        ↓
Welcome Page
```

Files:

- index.html
- welcome.html
- HelloController.java

Concepts Learned:

- Authentication Flow
- Model Attributes
- Login Validation

---

## Current Status

Current authentication is hardcoded.

```
if(username.equals("admin") &&
   password.equals("12345"))
```

No database is currently used.

Passwords are not encrypted.

No session management exists.

No logout functionality exists.

This implementation is for learning purposes only.

---

## Concepts Learned So Far

- Spring Boot
- Maven
- Project Structure
- Java Packages
- Controllers
- Request Mapping
- HTTP GET
- HTTP POST
- Request Parameters
- HTML Forms
- Thymeleaf
- Model
- MVC Architecture
- Simple Authentication

---

## Pending Improvements

### Short Term

- Improve UI
- Better CSS
- Bootstrap
- Dashboard
- Logout Button
- Validation Messages

---

### Medium Term

- Registration Page
- User Class
- In-memory User Storage
- Multiple Users

---

### Long Term

- MySQL Database
- Spring Data JPA
- Hibernate
- CRUD Operations
- User Repository

---

### Advanced

- Spring Security
- BCrypt Password Encoding
- Session Management
- Role-Based Authentication
- Admin Dashboard
- REST APIs
- JWT Authentication

---

## Running the Project

Requirements:

- Java 21
- Maven

Run:

```
mvn spring-boot:run
```

Application URL:

```
http://localhost:8080
```

---

## Future Development Plan

1. Improve UI
2. Registration System
3. MySQL Integration
4. User Repository
5. Login using Database
6. Session Management
7. Spring Security
8. CRUD Application
9. REST APIs
10. Deployment (Render)

---

## Notes for Future Development

This repository is intended as a structured learning project.

Features should be implemented incrementally.

Whenever adding a new feature:

- Explain the concept.
- Explain why it is needed.
- Explain how Spring Boot processes it internally.
- Keep the code beginner-friendly.
- Avoid using advanced abstractions until the underlying concept is understood.

The objective is to understand Spring Boot deeply rather than only producing a working application.
