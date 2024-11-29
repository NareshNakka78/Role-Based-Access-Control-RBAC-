# Role-Based Access Control (RBAC) Backend

## Overview

This project implements the backend of a Role-Based Access Control (RBAC) system. The system enables secure user authentication, role management, and access control based on user roles. It uses JSON Web Tokens (JWT) for managing authentication and MySQL for storing user and role data.

The project covers core security concepts, such as authentication and authorization, ensuring that only authorized users can access specific resources based on their assigned roles (e.g., Admin, User, Moderator).

## Features

- **User Authentication**: Secure login and registration system using JWT for session management.
- **Role Management**: Roles like Admin, User, and Moderator can be assigned to users, controlling their access to various resources.
- **JWT Authentication**: JSON Web Tokens are used for managing user sessions and providing secure access to resources.
- **MySQL Database**: The system stores user data, roles, and permissions in a MySQL database.

## Technologies Used

- **Backend**: Java (Spring Boot)
- **Database**: MySQL
- **Authentication**: JWT (JSON Web Tokens)
- **Security**: Spring Security (for authentication and authorization)

## Getting Started

### Prerequisites

- Java 11 or higher
- MySQL database
- Maven for dependency management
- Postman or similar tool for API testing

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/rbac-backend.git
Navigate to the project directory:

bash:
cd rbac-backend
Configure your database connection in application.properties:

properties:
spring.datasource.url=jdbc:mysql://localhost:3306/rbac_db
spring.datasource.username=root
spring.datasource.password=your_password
Build the project:

bash:
mvn clean install
Run the application:

bash:
mvn spring-boot:run
Database Setup
Create the database in MySQL:

sql:
CREATE DATABASE rbac_db;
Ensure the tables for users, roles, and permissions are created during application startup (via JPA/Hibernate).

API Endpoints:
POST /register: Register a new user with a username, email, and password.
POST /login: Log in and receive a JWT token.
GET /admin/dashboard: Access restricted to Admin users.
GET /user/profile: Access restricted to User users.
GET /moderator/content: Access restricted to Moderator users.
Example Usage
Register a User:

Send a POST request to /register with a JSON body containing:

json
{
  "username": "john_doe",
  "email": "john@example.com",
  "password": "securePassword123"
}
Login and Get JWT Token:

Send a POST request to /login with the following credentials:

json
{
  "username": "john_doe",
  "password": "securePassword123"
}
The server will respond with a JWT token that can be used to access protected routes.

Access Protected Route:

Include the JWT token in the Authorization header when making requests to routes like /admin/dashboard or /user/profile.
