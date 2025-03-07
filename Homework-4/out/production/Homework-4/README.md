# Homework 4: Advanced Structural Patterns – Singleton & Adapter

## Overview

We explored two important Structural Patterns: **Singleton** and **Adapter**. These patterns help manage global state and integrate legacy components with our system. In this assignment, you will apply these patterns in more complex scenarios by implementing:

1. A **Global Configuration Manager** using the Singleton pattern.
2. A **Chat Service Adapter** that converts a legacy chat system's interface into the one expected by our application.

Mock data and expected outputs are provided below to guide your implementation.

---

## Part 1: Global Configuration Manager (Singleton Pattern)

### Objective

- **Intent:** Ensure that only one instance of a configuration manager exists throughout the application, providing a centralized, globally accessible resource.
- **Task:** Implement a `ConfigurationManager` class that:
  - Loads a set of hardcoded key-value pairs as configuration settings.
  - Provides a method to retrieve configuration values by key.
  - Uses lazy initialization to create the instance only when needed.
  - Includes a method to print all configuration settings for testing purposes.

### Example Data

- `maxPlayers` → `"100"`
- `defaultLanguage` → `"en"`
- `gameDifficulty` → `"medium"`

### Expected Behavior

- When retrieving a configuration value (e.g., `getConfig("maxPlayers")`), it should return `"100"`.
- When invoking the method to print all configurations, the output should display all key-value pairs in a clear format.

### Deliverables

- A `ConfigurationManager` class implementing the Singleton pattern.
- A demo class (e.g., `ConfigManagerDemo`) that retrieves and prints configuration settings.

---

## Part 2: Chat Service Adapter (Adapter Pattern)

### Objective

- **Intent:** Enable integration of a legacy chat system with our application by adapting its interface to our expected format.
- **Task:** Implement an adapter that wraps a legacy chat service and translates its interface to match a new `ChatService` interface.
  - Use a simulated legacy chat class (`LegacyChatService`) that provides a method for sending messages in its own format.
  - Define a target interface (`ChatService`) with a method `sendMessage(String message)`.
  - Implement an adapter (`ChatServiceAdapter`) that converts calls from `sendMessage()` into the appropriate call on the legacy chat service.
  
### Example Data

- The legacy chat service is expected to output messages prefixed with `"Legacy Chat:"`.  
- For instance, when sending the message `"Hello world!"` through the adapter, the output should be:  
  `Legacy Chat: Hello world!`

### Expected Behavior

- The adapter should correctly map calls from the `ChatService` interface to the legacy service’s method.
- When running a demo, the system should print the legacy log message exactly as described.

### Deliverables

- A legacy chat service class (simulate this with a simple legacy interface).
- A `ChatService` interface that represents the new target interface.
- A `ChatServiceAdapter` class that wraps the legacy chat service.
- A demo class (e.g., `ChatAdapterDemo`) that demonstrates sending a message through the adapter, producing the expected output.

---

## General Requirements

- **Documentation:**  
  - Your code should include clear, concise comments explaining the implementation logic.
  - Provide a short README (this document) with compilation and execution instructions.

- **Testing:**  
  - Your implementation must compile without errors.
  - Provide sample output or screenshots that demonstrate:
    - The configuration manager returns and prints the correct configuration values.
    - The chat adapter translates a message as expected (e.g., producing the output `Legacy Chat: Hello world!`).

- **Code Quality:**  
  - Follow proper naming conventions and organize your classes into appropriate packages.
  - Ensure that each class adheres to the principles of Single Responsibility and Dependency Inversion.

---

## Grading Criteria

- **Completeness:**  
  - All required components (Configuration Manager and Chat Service Adapter) are implemented.
- **Correctness:**  
  - The `ConfigurationManager` properly enforces the Singleton pattern and returns the expected configurations.
  - The `ChatServiceAdapter` accurately maps calls from the `ChatService` interface to the legacy chat service.
- **Code Quality:**  
  - Your code is well-organized, documented, and easy to understand.
- **Testing:**  
  - Sample outputs clearly demonstrate the functionality of both patterns.