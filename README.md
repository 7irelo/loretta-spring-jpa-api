# Loretta Bank Spring Boot API

Welcome to the Loretta Bank Spring Boot API! This API serves as the backend for the Loretta Bank web application, providing endpoints for user authentication, account management, fund transfers, and transaction history management. This implementation uses Spring Boot, Spring Security, JWT, and PostgreSQL.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

- User Authentication (Sign Up, Log In, Log Out)
- Account Management (Create, View, Update, Delete Accounts)
- Fund Transfers (Internal and External)
- Transaction History
- Balance Inquiries
- Secure API with JWT Authentication

## Tech Stack

- **Backend**: Spring Boot
- **Database**: PostgreSQL
- **Authentication**: JWT (JSON Web Tokens)
- **Build Tool**: Maven

## Project Structure

```
loretta-bank-backend-springboot
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── lorettabank
│   │   │           ├── LorettaBankApplication.java
│   │   │           ├── config
│   │   │           │   └── JwtAuthenticationFilter.java
│   │   │           │   └── SecurityConfig.java
│   │   │           ├── controller
│   │   │           │   └── AuthController.java
│   │   │           │   └── AccountController.java
│   │   │           │   └── TransactionController.java
│   │   │           ├── model
│   │   │           │   └── User.java
│   │   │           │   └── Account.java
│   │   │           │   └── Transaction.java
│   │   │           ├── repository
│   │   │           │   └── UserRepository.java
│   │   │           │   └── AccountRepository.java
│   │   │           │   └── TransactionRepository.java
│   │   │           ├── service
│   │   │           │   └── UserService.java
│   │   │           │   └── AccountService.java
│   │   │           │   └── TransactionService.java
│   │   │           ├── util
│   │   │           │   └── JwtUtil.java
│   │   └── resources
│   │       └── application.properties
└── pom.xml
```

### Directory Structure Overview

- **config**: Contains configuration classes like `JwtAuthenticationFilter` and `SecurityConfig`.
- **controller**: Contains REST controllers like `AuthController`, `AccountController`, and `TransactionController`.
- **model**: Contains entity classes like `User`, `Account`, and `Transaction`.
- **repository**: Contains repository interfaces like `UserRepository`, `AccountRepository`, and `TransactionRepository`.
- **service**: Contains service classes like `UserService`, `AccountService`, and `TransactionService`.
- **util**: Contains utility classes like `JwtUtil`.

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- PostgreSQL installed and running
- Git installed
- Maven installed

### Backend Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/7irelo/loretta-spring-api.git
    cd loretta-bank-backend-springboot
    ```

2. Install dependencies and build the project:

    ```bash
    mvn clean install
    ```

3. Set up environment variables:

    Create a `application.properties` file in the `src/main/resources` directory and add the following:

    ```properties
    server.port=8080
    spring.datasource.url=jdbc:postgresql://localhost:5432/loretta_bank
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    jwt.secret=your_jwt_secret
    ```

4. Initialize the database:

    Ensure PostgreSQL is running and create a database named `loretta_bank`. The application will handle the schema creation.

5. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## Usage

Once the application is running, you can access the API at `http://localhost:8080`.

### Example Requests

- Sign Up:

    ```bash
    curl -X POST http://localhost:8080/api/auth/signup -H "Content-Type: application/json" -d '{"username":"testuser","password":"password"}'
    ```

- Log In:

    ```bash
    curl -X POST http://localhost:8080/api/auth/login -H "Content-Type: application/json" -d '{"username":"testuser","password":"password"}'
    ```

## API Endpoints

### Authentication

- **POST** `/api/auth/signup`: Register a new user.
- **POST** `/api/auth/login`: Authenticate a user and receive a JWT.

### Accounts

- **GET** `/api/accounts`: Retrieve all accounts.
- **POST** `/api/accounts`: Create a new account.
- **DELETE** `/api/accounts/{id}`: Delete an account.

### Transactions

- **GET** `/api/transactions`: Retrieve all transactions.
- **POST** `/api/transactions`: Create a new transaction.

## Contributing

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/feature-name`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/feature-name`
5. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries, please reach out to:

- **Name**: Eric Ncube
- **Email**: tirelo.eric@gmail.com
- **GitHub**: [7irelo](https://github.com/7irelo)

Thank you for using Loretta Bank Spring Boot API!
