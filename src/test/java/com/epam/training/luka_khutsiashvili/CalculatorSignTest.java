package com.epam.training.luka_khutsiashvili;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSignTest {
  private Calculator calculator;

  @BeforeAll
  void setup() {
    calculator = new Calculator();
  }

  @Test
  void testIsPositive() {
    assertTrue(calculator.isPositive(10), "10 should be positive");
    assertFalse(calculator.isPositive(0), "0 should not be positive");
  }

  @Test
  void testIsNegative() {
    assertTrue(calculator.isNegative(-5), "-5 should be negative");
    assertFalse(calculator.isNegative(0), "0 should not be negative");
  }

  @AfterAll
  void tearDown() {
    calculator = null;
  }
}
