# Loretta Bank Spring Boot API

Welcome to the Loretta Bank Spring Boot API, a robust and scalable backend service for the Loretta Bank web application. This API is built with Spring Boot and provides endpoints for user authentication, account management, fund transfers, and transaction history management.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
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
    cd loretta-bank-backend
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

    Ensure your PostgreSQL database is running and the database schema is set up according to the JPA entities defined in the project.

5. Start the backend server:

    ```bash
    mvn spring-boot:run
    ```

## Usage

- The backend server will run at `http://localhost:8080`
- Use tools like Postman or Curl to interact with the API endpoints
- Integrate the backend with the Loretta Bank frontend application

## API Endpoints

### Authentication

- `POST /api/auth/signup` - Sign up a new user
- `POST /api/auth/login` - Log in a user
- `POST /api/auth/logout` - Log out a user

### Accounts

- `GET /api/accounts` - Get all accounts for the authenticated user
- `POST /api/accounts` - Create a new account
- `GET /api/accounts/{id}` - Get a specific account
- `PUT /api/accounts/{id}` - Update a specific account
- `DELETE /api/accounts/{id}` - Delete a specific account

### Transactions

- `POST /api/transactions` - Create a new transaction
- `GET /api/transactions` - Get all transactions for the authenticated user

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature-name`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature-name`)
5. Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or issues, please contact us at [support@lorettabank.com](mailto:tirelo.eric@gmail.com).
