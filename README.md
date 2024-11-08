# Spring Security Study Project

This repository contains a simple Spring Boot project for studying and testing the fundamental features of Spring Security. The project provides a basic structure to explore various security configurations, login and logout mechanisms, and role-based access control.

## Project Structure

The project has a simple structure with a focus on Spring Security setup:

- **`config/`**: Security configuration files, including custom login and logout settings.
- **`controller/`**: Basic controller(s) for handling page navigation.
- **`templates/`**: Thymeleaf HTML templates for login, logout, and restricted content pages.

## Key Features

- **Custom Login Page**: A login page (`login.html`) using Thymeleaf for handling authentication.
- **Logout Button**: A logout button is included in the navigation bar, redirecting to the login page upon logging out.
- **Role-Based Access Control**: Allows the restriction of access to specific pages based on user roles.

## Getting Started

### Prerequisites

- **Java 11** or higher
- **Maven** (for dependency management)
- **Spring Boot 2.7+**

### Installation and Running

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/spring-security-study.git
   cd spring-security-study
   ```

2. **Build and run the project:**
   ```bash
   mvn spring-boot:run
   ```

3. **Access the application:**
   - Go to `http://localhost:8080/login` to view the login page.
   - After successful login, you will be redirected to `hello.html`.

## Usage Guide

### Login and Logout

- **Login**: Use the credentials specified in the application (if using a hardcoded in-memory user for simplicity, credentials can be found in `SecurityConfiguration`).
- **Logout**: The logout button in the navigation bar redirects you to the login page, effectively logging out the current session.

### Customizing Access Control

You can easily modify roles and permissions in the `SecurityConfiguration` class to control access to different endpoints and features. This is especially useful for studying how different configurations impact access control.

## License

This project is intended for educational purposes and is free to use and modify. No specific license applies.

---

Enjoy learning Spring Security! Feel free to experiment with configurations and expand the project.
