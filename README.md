# OragngeHRM_Test

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

```bash
git clone https://github.com/aya-test-dev/OragngeHRM_Test.git
cd OragngeHRM_Test
mvn clean install
```

## Running Tests

By default, the TestNG suite is configured in `testng.xml`. Run all tests with:

```bash
mvn test
```

To specify the TestNG suite file explicitly:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

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
