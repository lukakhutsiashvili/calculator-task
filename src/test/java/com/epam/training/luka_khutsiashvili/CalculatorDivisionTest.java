package com.epam.training.luka_khutsiashvili;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorDivisionTest {
  private Calculator calculator;

  @BeforeAll
  void setup() {
    calculator = new Calculator();
  }

  @Test
  void testDivLong() {
    assertEquals(2, calculator.div(10, 5), "10 / 5 should be 2");
  }

  @Test
  void testDivDouble() {
    assertEquals(2.5, calculator.div(5.0, 2.0), "5.0 / 2.0 should be 2.5");
  }

  @Test
  void testDivByZeroThrowsException() {
    assertThrows(NumberFormatException.class, () -> calculator.div(10, 0), "Division by zero should throw an exception");
  }

  @AfterAll
  void tearDown() {
    calculator = null;
  }
}
