package com.epam.training.luka_khutsiashvili;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSumTest {
  private Calculator calculator;

  @BeforeAll
  void setup() {
    calculator = new Calculator();
  }

  @Test
  void testSumLong() {
    assertEquals(10, calculator.sum(4, 6), "4 + 6 should be 10");
  }

  @Test
  void testSumDouble() {
    assertEquals(10.5, calculator.sum(4.5, 6.0), 0.0001, "4.5 + 6.0 should be 10.5");
  }

  @Test
  void testSumNegative() {
    assertEquals(-5, calculator.sum(-2, -3), "-2 + -3 should be -5");
  }

  @AfterAll
  void tearDown() {
    calculator = null;
  }
}
