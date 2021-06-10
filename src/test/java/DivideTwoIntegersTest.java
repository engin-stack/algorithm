import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideTwoIntegersTest {

  private final DivideTwoIntegers o = new DivideTwoIntegers();

  @Test
  void divideCase1() {
    int dividend = 10, divisor = 3;
    Assertions.assertEquals(3, o.divide(dividend, divisor));
  }

  @Test
  void divideCase2() {
    int dividend = 7, divisor = -3;
    Assertions.assertEquals(-2, o.divide(dividend, divisor));
  }

  @Test
  void divideCase3() {
    int dividend = 0, divisor = 1;
    Assertions.assertEquals(0, o.divide(dividend, divisor));
  }

  @Test
  void divideCase4() {
    int dividend = 1, divisor = 1;
    Assertions.assertEquals(1, o.divide(dividend, divisor));
  }

  @Test
  void divideCase5() {
    int dividend = -2147483648, divisor = -1;
    Assertions.assertEquals(2147483647, o.divide(dividend, divisor));
  }
}
