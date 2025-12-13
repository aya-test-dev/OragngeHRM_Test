Feature: AI functionality in automation exercise project

    Scenario: Greeting user
      Given a user sends a greeting message "hello"
      When the AI chatbot receives the greeting
      Then it should respond with a greeting and offer assistance

    Scenario: Summarize conversation thread
      Given a user requests a thread summary with "Can you summarize this thread to me?"
      When the AI chatbot receives the summary request
      Then it should provide a concise summary of the conversation

    Scenario: Introduce itself to the user
      Given a user asks the AI to introduce itself with "Can you introduce yourself to me?"
      When the AI chatbot receives the introduction request
      Then it should respond with its name, role, and capabilities

    Scenario: Draft test cases for AI functionality
      Given a user asks the AI to create test cases with "can you create test cases to test you?"
      When the AI chatbot receives the test case creation request
      Then it should draft appropriate BDD scenarios for testing its own functionality
