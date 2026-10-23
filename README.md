# SpringBoot-Task-Manager

A RESTful Task Management backend API built with **Java**, **Spring Boot**, **Spring Data JPA**, and **Microsoft SQL Server**.

## Features

- **Task Lifecycle Management:** Create, retrieve, update, and delete tasks with status tracking and priority handling.
- **Layered Architecture:** Clean separation between Request/Response DTOs (`TaskRequest`, `TaskResponse`), Entities (`Task`), Service Interfaces (`TaskService`), Service Implementations (`TaskServiceImpl`), and Spring Data JPA Repositories (`TaskRepository`).
- **SQL Server & Hibernate Integration:** Automatic schema management and formatted SQL query logging via Hibernate/JPA.

## Tech Stack

| Layer | Technology |
|---|---|
| Language & Runtime | Java 17+ |
| Framework | Spring Boot, Spring Web |
| Persistence | Spring Data JPA, Hibernate |
| Database | Microsoft SQL Server (`mssql-jdbc`) |
| Build Tool | Maven (`mvnw`) |

## Project Structure

```text
src/main/java/com/virak/TaskManager/
├── TaskManagerApplication.java
├── dtos/
│   ├── TaskRequest.java
│   └── TaskResponse.java
├── models/
│   └── Task.java
├── repositories/
│   └── TaskRepository.java
├── services/
│   └── TaskService.java
└── serviceImpl/
    └── TaskServiceImpl.java
```

## Getting Started

1. Configure your SQL Server connection in `src/main/resources/application.properties` (or pass `DB_USERNAME` and `DB_PASSWORD` environment variables):

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=task_db;encrypt=true;trustServerCertificate=true
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
```

2. Run the application:

```bash
./mvnw spring-boot:run
```
