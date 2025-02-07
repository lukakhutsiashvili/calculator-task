package com.epam.training.luka_khutsiashvili;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSubtractionTest {
  private Calculator calculator;

  @BeforeAll
  void setup() {
    calculator = new Calculator();
  }

  @Test
  void testSubLong() {
    assertEquals(5, calculator.sub(10, 5), "10 - 5 should be 5");
  }

  @Test
  void testSubDouble() {
    assertEquals(2.5, calculator.sub(5.5, 3.0), "5.5 - 3.0 should be 2.5");
  }

  @AfterAll
  void tearDown() {
    calculator = null;
  }
}
