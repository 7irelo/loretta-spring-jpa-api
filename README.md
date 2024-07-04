# Loretta Bank Spring Boot API

Welcome to the Loretta Bank Spring Boot API, a robust and scalable backend service for the Loretta Bank web application. This API is built with Spring Boot and provides endpoints for user authentication, account management, fund transfers, and transaction history management.

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
loretta-bank-backend
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── lorettabank
│   │   │           ├── config
│   │   │           │   └── SecurityConfig.java
│   │   │           ├── controller
│   │   │           │   ├── AuthController.java
│   │   │           │   ├── AccountController.java
│   │   │           │   └── TransactionController.java
│   │   │           ├── model
│   │   │           │   ├── User.java
│   │   │           │   ├── Account.java
│   │   │           │   └── Transaction.java
│   │   │           ├── repository
│   │   │           │   ├── UserRepository.java
│   │   │           │   ├── AccountRepository.java
│   │   │           │   └── TransactionRepository.java
│   │   │           ├── security
│   │   │           │   ├── JwtAuthenticationFilter.java
│   │   │           │   └── JwtTokenProvider.java
│   │   │           ├── service
│   │   │           │   ├── UserService.java
│   │   │           │   ├── AccountService.java
│   │   │           │   └── TransactionService.java
│   │   │           └── LorettaBankApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── lorettabank
│                   └── LorettaBankApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

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
    cd loretta-spring-api
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

    Ensure PostgreSQL is running and the `loretta_bank` database is created.

5. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## Usage

### Access the API

The API will be accessible at `http://localhost:8080`.

### Authentication

Use the `/api/auth/signup` and `/api/auth/login` endpoints to register and authenticate users. Use the obtained JWT token to access other protected endpoints.

### Example Requests

#### Sign Up
```bash
POST /api/auth/signup
Content-Type: application/json

{
    "username": "john_doe",
    "password": "password123",
    "email": "john@example.com"
}
```

#### Log In
```bash
POST /api/auth/login
Content-Type: application/json

{
    "username": "john_doe",
    "password": "password123"
}
```

#### Create Account
```bash
POST /api/accounts
Authorization: Bearer <JWT_TOKEN>
Content-Type: application/json

{
    "userId": 1,
    "balance": 1000.00
}
```

#### Transfer Funds
```bash
POST /api/transactions
Authorization: Bearer <JWT_TOKEN>
Content-Type: application/json

{
    "accountId": 1,
    "amount": 100.00,
    "type": "transfer"
}
```

## API Endpoints

- `POST /api/auth/signup`: Sign up a new user
- `POST /api/auth/login`: Log in an existing user
- `POST /api/auth/logout`: Log out the current user
- `GET /api/accounts`: Get accounts for a user
- `POST /api/accounts`: Create a new account
- `PUT /api/accounts/{id}`: Update an account
- `DELETE /api/accounts/{id}`: Delete an account
- `GET /api/transactions`: Get transactions for an account
- `POST /api/transactions`: Create a new transaction

## Contributing

We welcome contributions! Please fork the repository and create a pull request with your changes. Ensure that your code adheres to the coding standards and includes necessary tests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or issues, please contact:

- Name: Eric Ncube
- Email: tirelo.eric@gmail.com
- GitHub: [7irelo](https://github.com/7irelo)

---

Feel free to customize the content based on your project's specific details and requirements.
