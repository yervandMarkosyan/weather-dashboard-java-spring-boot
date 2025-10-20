# 🌸 Spring Boot Thymeleaf Web App
A full-stack web application built using Java Spring Boot for the backend and Thymeleaf for server-side rendering. This project demonstrates dynamic HTML templating, form handling, and integration with external APIs or databases. It was developed to practice robust backend architecture, MVC design patterns, and clean UI rendering with Thymeleaf.

## 🚀 Technologies Used

- Java 21+
- Spring Boot
- Thymeleaf
- Spring MVC
- Spring Data JPA
- H2 / MySQL

## 📦 How to Run Locally

### 1. Clone the repository

```bash
git clone https://github.com/your-username/springboot-thymeleaf-app.git
cd springboot-thymeleaf-app
```

### 2. Build the project

```bash
./mvnw clean install
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

### 4. Access the app

```bash
http://localhost:8080
```
## 🧪 Features

- 🍕 Build-your-own pizza form with categorized ingredients (crust, sauce, cheese, toppings)
- 🧾 Order summary with delivery and payment details
- 🗃️ Custom JDBC repository for saving orders and pizzas
- 🧠 Ingredient filtering by type using model attributes
- 🛠️ Form validation for name and ingredient selection
- 🧵 Session-based order tracking across multiple pizzas

## 🛠️ Developer Notes

- H2 Console available at `http://localhost:8080/h2-console`
- Default JDBC URL: `jdbc:h2:mem:yervandPizza`
- Tables created manually via SQL or repository logic
- Logging via SLF4J (`log.info(...)`)
