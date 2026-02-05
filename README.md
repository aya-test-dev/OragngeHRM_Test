# OragngeHRM_Test

A Java-based Selenium test automation project for the OrangeHRM web application using Cucumber, TestNG, Allure, WebDriverManager, and Log4j for logging.

## Project Structure

```text
OragngeHRM_Test/
├── pom.xml              # Maven project descriptor
├── testng.xml           # TestNG suite configuration
├── src/
│   ├── main/
│   │   ├── java/org/example/Main.java    # Application entry point
│   │   └── resources/log4j2.xml          # Logging configuration
│   └── test/
│       ├── java/                         # Test classes, Page Objects, and Step Definitions
│       └── resources/Features/           # Cucumber feature files (login, logout, register)
```

## Prerequisites

- Java 23 or higher
- Maven 3.8+ installed and on PATH

## Setup

```bash
git clone https://github.com/aya-test-dev/OragngeHRM_Test.git
cd OragngeHRM_Test
mvn clean install
```

## Running Tests

To execute all tests via Maven:

```bash
mvn test
```

Or run the TestNG suite directly:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Generate and Serve Allure Report

```bash
mvn allure:report
mvn allure:serve
```

## Dependencies

Key dependencies are declared in `pom.xml`:

- Selenium Java
- TestNG
- WebDriverManager
- Log4j API & Core
- Allure TestNG & Cucumber adapters
- Cucumber Java, Core, TestNG

## Contributing

Contributions are welcome! Please submit pull requests against the `main` branch.
