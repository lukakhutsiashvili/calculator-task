# Calculator Test Automation

This project automates testing for the `Calculator` library using **JUnit 5**. It covers basic operations (addition, subtraction, multiplication, division) and advanced functions (power, trigonometric operations).

**Note**: The `calculator-1.0.jar` file is included for simplicity in this task. While generally not recommended, it has been added here for practice purposes.

---

## Key Features

- **Parameterized Tests**: The **`CalculatorMultiplicationTest.java`** class demonstrates a **data-driven approach** using parameterized tests with `@ParameterizedTest` and `@CsvSource`.
  
- **Parallel Execution**: Tests are configured to run in parallel for faster execution. This is handled through the `junit-platform.properties` configuration, enabling parallel execution of tests.

---

## Getting Started

### Prerequisites
- **Java 11+**
- **JUnit 5**
- **Maven**

### Installation
1. Clone the repository.
2. Install dependencies using Maven.

---

## Running Tests

To execute all the tests, run the following command:
```bash
mvn test
