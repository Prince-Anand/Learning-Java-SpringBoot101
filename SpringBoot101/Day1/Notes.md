## Spring Framework

### Client-Server Architecture

#### Flow
- Client sends a request (e.g., user visits `www.amazon.in`).
- Server processes the request and returns a response.

#### Request & Response
- **Request:** HTTP / HTTPS
- **Response:** HTTP / HTTPS

#### What is a Client?
- Browser
- Mobile App
- React Frontend
- Android App
- Postman
- Another Server

> Any request generator is a client.

#### What is a Server?
- Receives and processes requests.
- Performs authentication, validation, and business logic.
- Sends responses back to clients.

#### HTTP (HyperText Transfer Protocol)
- Communication language between client and server.
- Defines:
  - Request/Response structure
  - GET, POST, PUT, DELETE methods
  - Headers and Body

#### HTTPS
- Secure version of HTTP.
- Data is encrypted during transmission.

### HTTP Structure

#### Request Format
1. Method (GET, POST, etc.)
2. URL / Path
3. Headers
4. Body

#### Response Format
1. Status Code (e.g., 200 OK)
2. Headers
3. Body

---

### Before Servlets

- Java provided networking through `java.net`.
- Key classes:
  - `Socket`
  - `ServerSocket`
- Developers had to manually:
  - Open ports
  - Handle requests
  - Manage threads
  - Parse HTTP messages

This involved significant boilerplate code.

### Introduction of Servlets (1997)

- Introduced as part of Java EE.
- Removed low-level networking complexity.

#### Servlet Container / Server
Popular implementations:
- Apache Tomcat
- Jetty
- Undertow

#### How It Works
1. Server continuously listens for requests.
2. Reads incoming network data.
3. Converts raw bytes into HTTP requests.
4. Handles multi-threading automatically.
5. Dispatches the request to the appropriate Servlet.

#### Benefits
- No manual socket programming.
- No thread management.
- Developers focus on business logic.

### Why Spring?

Large Servlet-based applications often became:
- Tightly coupled
- Difficult to scale
- Hard to maintain

To solve these problems, the **Spring Framework** was created.

> Spring is not a single framework; it is a complete ecosystem for modern Java development.

---

### The Layered Architecture of the Spring Ecosystem

#### Spring Core (Base Layer)
- Foundation of Spring.
- Provides **Dependency Injection (DI)** and **Inversion of Control (IoC)**.
- Enables loosely coupled applications.

#### Spring Modules (Middle Layer)

##### Spring MVC
- Builds web applications and REST APIs.
- Handles Servlets internally.

##### Spring Data
- Simplifies database operations.

##### Spring Security
- Handles authentication and authorization.

##### Spring AOP
- Separates cross-cutting concerns.

##### Spring AI
- Integrates AI capabilities into Java applications.

#### Spring Boot (Top Layer)
- Built on top of Spring Framework.
- Opinionated framework with sensible defaults.
- Eliminates most configuration.
- Accelerates development.

### Database Access Flow


```text
Spring Data JPA
      ↓
  Hibernate
      ↓
    JDBC
      ↓
  Database
```
### Monolithic vs. Microservices Architecture

1. **Monolithic Architecture**: All business functionalities, domains, and endpoints (e.g., users, orders, payments) are packaged together inside a single, unified codebase/project.  
2. **Microservices Architecture**: The massive application is broken down into small, independent, isolated services (e.g., a separate Order Service, Payment Service, and User Service). These decentralized servers communicate with each other over the network using standard HTTP protocols
<!-- # Spring Framework

## Client Server Architecture
- User/Client sends a request from browser (e.g. User types www.amazon.in)
- Server gernerates a response

- Request - HTTP/HTTPS format
- Response - HTTP

### What is a Client ?

- Browser, Mobile App, React FE, Android, Postman, Server 
- Request generator is a client

### What is a Server?

- Processes request 
- authenticate

- Language btw Client and Server - Hypertext Transfer Protocol
- It has Request/Response Structure, GET, POST, etc...

- HTTPS: (Secure) Encrypted


- Request Format:
1. Method Name
2. URL/Path
3. Headers 
4. Body


- Response Format :
1. Status Code : 200 OK
2. Headers
3. Body

- Java has provided native networking capabilities via the java.net package (offering classes like ServerSocket and Socket) since Java 1.0. but this has too much manual work.
- So, To eliminate this overwhelming manual effort and boilerplate code, Servlets (part of Java EE) were introduced in 1997.  
- servlet- classes & container = chooses which to use when...
1. Servlet Container / Server: Popular examples include Apache Tomcat, Jetty, and Undertow, with Tomcat being the most widely used. 
2. How it Works: The Tomcat server stays up continuously in the background. It opens the network port, reads incoming raw bytes, translates them into structured HTTP requests, manages multi-threading automatically, and hands over the request to your Servlet (which is just a specialized Java class).  
3. The Advantage: Developers were freed from low-level networking and thread management, allowing them to focus strictly on writing core business logic.

but this was also tightly coupled, hard to scale and maintainable, so, Spring Framework was built to solve this exact problem.

- Spring Framework = Spring is not just a single framework; it is an entire Ecosystem that makes Java development simple, modern, and highly productive

## The Layered Architecture of the Spring Ecosystem

### Spring Core (Base Layer)
- Foundation of the Spring Framework.
- Provides **Dependency Injection (DI)** and **Inversion of Control (IoC)**.
- Enables **loosely coupled** and maintainable applications.

### Spring Modules (Middle Layer)

#### Spring MVC
- Builds web applications and REST APIs.
- Handles Servlets internally.

#### Spring Data
- Simplifies database connectivity and operations.

#### Spring Security
- Manages authentication and authorization.

#### Spring AOP
- Isolates cross-cutting concerns using Aspect-Oriented Programming.

#### Spring AI
- Integrates AI capabilities into Java applications.

### Spring Boot (Top Layer)
- Automation layer built on top of Spring Framework.
- **Opinionated framework** with pre-configured defaults.
- Reduces manual XML/Java configuration.
- Helps developers start building applications quickly.


- Spring Data JPA ➡️ Hibernate ➡️ JDBC(SQL Queries are here) ➡️ Database.

## Monolithic vs. Microservices Architecture

1. Monolithic Architecture: All business functionalities, domains, and endpoints (e.g., users, orders, payments) are packaged together inside a single, unified codebase/project.  
2. Microservices Architecture: The massive application is broken down into small, independent, isolated services (e.g., a separate Order Service, Payment Service, and User Service). These decentralized servers communicate with each other over the network using standard HTTP protocols. -->