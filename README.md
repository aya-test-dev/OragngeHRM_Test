# OragngeHRM_Test

<<<<<<< HEAD
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
=======
Automated test suite for the OrangeHRM web application using Selenium WebDriver, Cucumber, TestNG, and Allure Reports.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Generating Allure Report](#generating-allure-report)
- [BDD Feature Scenarios](#bdd-feature-scenarios)

## Prerequisites

- Java JDK 23 or higher
- Maven 3.6+
- Web browser (e.g., Chrome, Firefox)

## Project Structure

```
OragngeHRM_Test/
├── pom.xml
├── testng.xml
├── src/
│   ├── main/
│   │   ├── java/org/example/Main.java
│   │   └── resources/log4j2.xml
│   └── test/
│       ├── java/
│       │   ├── StepDefination/
│       │   ├── Pages/
│       │   ├── TestPages/
│       │   └── Runner/
│       └── resources/
│           └── Features/
│               ├── login.feature
│               ├── logout.feature
│               └── register.feature
└── README.md
```

## Installation
>>>>>>> 110e2bb8b3bd517675d9b195cfc5a263f68240d0

```bash
git clone https://github.com/aya-test-dev/OragngeHRM_Test.git
cd OragngeHRM_Test
mvn clean install
```

## Running Tests

<<<<<<< HEAD
To execute all tests via Maven:
=======
By default, the TestNG suite is configured in `testng.xml`. Run all tests with:
>>>>>>> 110e2bb8b3bd517675d9b195cfc5a263f68240d0

```bash
mvn test
```

<<<<<<< HEAD
Or run the TestNG suite directly:
=======
To specify the TestNG suite file explicitly:
>>>>>>> 110e2bb8b3bd517675d9b195cfc5a263f68240d0

```bash
mvn test -DsuiteXmlFile=testng.xml
```

<<<<<<< HEAD
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
=======
## Generating Allure Report

After executing tests, generate and serve the Allure report with:

```bash
mvn verify
allure serve target/allure-results
```

## BDD Feature Scenarios

- **Login Feature** (`src/test/resources/Features/login.feature`): Scenarios for successful and failed login/logout flows.
- **Logout Feature** (`src/test/resources/Features/logout.feature`): Scenarios covering logout functionality.
- **Register Feature** (`src/test/resources/Features/register.feature`): Scenarios for user registration.
>>>>>>> 110e2bb8b3bd517675d9b195cfc5a263f68240d0
