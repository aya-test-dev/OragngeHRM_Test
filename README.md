# Testing_Project

A simple Java CLI tool to fetch the Jira issue summary (title) for a given ticket key.

## Prerequisites

- Java 11 or higher
- Maven

## Build

```bash
mvn clean package
```

## Usage

```bash
java -jar target/app.jar <baseUrl> <email> <apiToken> <issueKey>
```

For example:

```bash
java -jar target/app.jar https://your-domain.atlassian.net user@example.com your_api_token SCRUM-3
```

This will output the Jira issue summary for the specified ticket.
