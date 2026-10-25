# Student Portal Management

A Spring Boot REST API for managing student records using MySQL. The application follows a layered architecture that separates request handling, business logic, and database operations.

## Technology Stack

- Java 25
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA / Hibernate
- MySQL
- Maven
- Lombok
- Spring Boot DevTools
- Postman

## Features

- Create a student record
- Retrieve all students
- Retrieve a student by ID
- Find a student by first name
- Store student records in MySQL

## Student Fields

| Field | Java Type | Description |
|---|---|---|
| Sid | Integer | Student identifier |
| FirstName | String | First name |
| LastName | String | Last name |
| Email | String | Email address |
| Dept | String | Department |
| Salary | double | Salary value |
| City | String | City |

## Project Structure

```text
src/main/
├── java/com/karthikeya/StudentPortal/
│   ├── StudentPortalApplication.java
│   ├── Controller/
│   │   └── StudentController.java
│   ├── Service/
│   │   ├── StudentService.java
│   │   └── StudentServiceImpl.java
│   ├── Repo/
│   │   └── StudentRepository.java
│   └── model/
│       └── Student.java
└── resources/
    └── application.properties
```

### Architecture

| Layer | Responsibility |
|---|---|
| Controller | Handles HTTP requests and responses |
| Service | Implements student management operations |
| Repository | Performs database operations using Spring Data JPA |
| Model | Maps student data to a database table |

## Prerequisites

- JDK 25
- MySQL
- Maven
- Eclipse, IntelliJ IDEA, or another Java IDE
- Postman for API testing

## Installation and Setup

### 1. Clone the Repository

Replace `<your-repository-url>` with the repository's clone URL:

```bash
git clone <your-repository-url>
cd Student-Portal-Management-
```

### 2. Create the Database

Execute the following SQL in MySQL:

```sql
CREATE DATABASE IF NOT EXISTS Karthik1;
```

### 3. Configure the Application

Update `src/main/resources/application.properties`:

```properties
spring.application.name=StudentPortal
server.port=9988

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/Karthik1
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Set `DB_USERNAME` and `DB_PASSWORD` to your MySQL credentials in your terminal environment or IDE run configuration.

### 4. Run the Application

```bash
mvn spring-boot:run
```

Alternatively, run `StudentPortalApplication.java` from your IDE.

**Application base URL:** `http://localhost:9988`

> MySQL uses port `3306`. Send HTTP API requests to the application on port `9988`.

## API Usage

### Create a Student

| Method | Endpoint | Description |
|---|---|---|
| POST | `/Student/ss` | Create a student record |

**Request URL:**

```text
http://localhost:9988/Student/ss
```

**Request header:**

```text
Content-Type: application/json
```

**Sample request body:**

```json
{
  "firstName": "Karthik",
  "lastName": "Kondru",
  "email": "karthik@example.com",
  "dept": "CSE",
  "salary": 30000.0,
  "city": "Gudlavalleru"
}
```

> Match JSON property names to your entity's getters, setters, or Jackson annotations. Omit the student ID when it is generated automatically.

For retrieval operations, use the exact paths declared in `StudentController`. Combine any class-level `@RequestMapping` with the method-level mapping.

## Testing with Postman

1. Start MySQL.
2. Run the Spring Boot application.
3. Create a new request in Postman.
4. Select `POST` and enter the create endpoint URL.
5. Select **Body → raw → JSON**.
6. Paste the sample request body.
7. Click **Send** and inspect the response.
8. Use your retrieval endpoints to verify the saved record.

## Troubleshooting

| Issue | Solution |
|---|---|
| Service bean not found | Annotate the service implementation with `@Service` and ensure component scanning includes it |
| HTTP 404 | Check `@RestController`, the HTTP method, and controller mappings |
| Parse error on port 3306 | Send API requests to port `9988` |
| Database connection failure | Check MySQL, database name, and credentials |
| Port 9988 already in use | Stop the conflicting process or change `server.port` |

## Future Enhancements

- Update and delete student records
- Input validation
- Centralized exception handling
- Swagger UI / OpenAPI documentation
- Pagination and sorting
- Department-based filtering
- React frontend
- Authentication and role-based authorization

## Author

**Kondru Karthik Babu**

GitHub: [Ramm33](https://github.com/Ramm33)
