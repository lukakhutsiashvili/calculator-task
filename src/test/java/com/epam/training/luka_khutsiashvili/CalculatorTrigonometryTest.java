package com.epam.training.luka_khutsiashvili;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTrigonometryTest {
  private Calculator calculator;

  @BeforeAll
  void setup() {
    calculator = new Calculator();
  }

  @Test
  void testSin() {
    assertEquals(Math.sin(30), calculator.sin(30), "Sin(30) should be correct");
  }

  @Test
  void testCos() {
    assertEquals(Math.sin(30), calculator.cos(30), "Cos(30) should be correct");
  }

  @AfterAll
  void tearDown() {
    calculator = null;
  }
}
