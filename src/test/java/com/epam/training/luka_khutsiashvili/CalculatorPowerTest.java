package com.epam.training.luka_khutsiashvili;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorPowerTest {
  private Calculator calculator;

  @BeforeAll
  void setup() {
    calculator = new Calculator();
  }

  @Test
  void testPower() {
    assertEquals(16, calculator.pow(2, 4), "2^4 should be 16");
  }

  @AfterAll
  void tearDown() {
    calculator = null;
  }
}
