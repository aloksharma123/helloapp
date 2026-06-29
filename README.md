# Spring Boot Greeting & Authentication App

## Overview
This is a beginner-friendly Spring Boot project built to learn Spring Boot development from scratch. The project is being developed incrementally, with each feature added to understand the underlying concepts instead of relying on ready-made templates.

## Tech Stack
- Java 21
- Spring Boot
- Spring MVC
- Thymeleaf
- Maven
- HTML & CSS
- VS Code

## Features Implemented
- Spring Boot project setup using Spring Initializr
- Maven project configuration
- Greeting page using Spring MVC
- Thymeleaf template rendering
- HTML form submission
- GET and POST request handling
- Dynamic greeting with user input
- Simple login page
- Hardcoded authentication (`admin` / `12345`)
- Welcome page after successful login

## Current Project Structure

```
src/
 └── main/
      ├── java/
      │     └── com.example.helloapp/
      │            └── HelloController.java
      └── resources/
            ├── templates/
            │      ├── index.html
            │      ├── hello.html
            │      └── welcome.html
            └── static/
```

## Current Flow

```
Application
     │
     ▼
Login Page
     │
     ▼
User enters credentials
     │
     ▼
POST /login
     │
     ▼
HelloController
     │
     ├── Valid → Welcome Page
     └── Invalid → Login Page + Error
```

## Concepts Learned
- Spring Boot project structure
- Maven & `pom.xml`
- Controllers
- Spring MVC
- Routing
- Thymeleaf
- Model
- HTML Forms
- GET vs POST
- Basic Authentication

## Current Limitations
- Credentials are hardcoded.
- No database.
- No session management.
- No logout.
- No Spring Security.

## Next Steps
- Improve UI with CSS/Bootstrap
- User Registration
- MySQL Integration
- Spring Data JPA
- Spring Security
- Dashboard
- Deployment (Render)

## Notes
This project is primarily a learning project. Every feature is implemented step-by-step to understand how Spring Boot applications are built before moving to production-level practices.
