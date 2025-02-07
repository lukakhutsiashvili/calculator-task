  package com.epam.training.luka_khutsiashvili;

  import com.epam.tat.module4.Calculator;
  import org.junit.jupiter.api.*;
  import org.junit.jupiter.params.ParameterizedTest;
  import org.junit.jupiter.params.provider.CsvSource;

  import static org.junit.jupiter.api.Assertions.*;

  @TestInstance(TestInstance.Lifecycle.PER_CLASS)
  public class CalculatorMultiplicationTest {
    private Calculator calculator;

    @BeforeAll
    void setup() {
      calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
        "2, 3, 6",
        "4, 5, 20",
        "-1, 6, -6"
    })
    void testMultiplication(long a, long b, long expected) {
      assertEquals(expected, calculator.mult(a, b), "Multiplication result incorrect");
    }

    @AfterAll
    void tearDown() {
      calculator = null;
    }
  }
