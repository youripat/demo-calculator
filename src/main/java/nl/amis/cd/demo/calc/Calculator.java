package nl.amis.cd.demo.calc;

public class Calculator {
  private int number1;
  private int number2;
  private int total;

  public Calculator() {
    super();
  }


  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public int getNumber1() {
    return number1;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public int getNumber2() {
    return number2;
  }

  public int getTotal() {
    return total;
  }

  /**
   * Add number1 and number2
   */
  public void add() {
    total = number1 + number2;
  }

  /**
   * Subtract number2 from number1
   */
  public void subtract() {
    total = number1 - number2;
  }
  /**
   * Divide number1 by number2.
   * Note, that we're using an int for the result and thus the result is rounded
   */
  public void divide() {
    total = number1 / number2;
  }
  /**
   * Multiply both numbers
   */
  public void multiply() {
    total = number1 * number2;
  }
}
