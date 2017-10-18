package nl.amis.cd.demo.calc;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
  public CalculatorTest() {
    super();
  }

  @Test
  public void testAdd() {
    Calculator calc = new Calculator();
    calc.setNumber1(10);
    calc.setNumber2(5);
    calc.add();
    Assert.assertEquals(15, calc.getTotal());
  }

  @Test
  public void testSubtract() {
    Calculator calc = new Calculator();
    calc.setNumber1(10);
    calc.setNumber2(5);
    calc.subtract();
    Assert.assertEquals(5, calc.getTotal());
  }

  @Test
  public void testMultiply() {
    Calculator calc = new Calculator();
    calc.setNumber1(10);
    calc.setNumber2(5);
    calc.multiply();
    Assert.assertEquals(50, calc.getTotal());
  }

  @Test
  public void testDivide() {
    Calculator calc = new Calculator();
    calc.setNumber1(10);
    calc.setNumber2(5);
    calc.divide();
    Assert.assertEquals(2, calc.getTotal());
  }

}
