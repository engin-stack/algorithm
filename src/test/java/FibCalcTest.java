import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibCalcTest {

  private final FibCalc o = new FibCalc();

  @Test
  void fib1() {
    int result = o.fib(2);
    Assertions.assertEquals(1, result);
  }

  @Test
  void fib2() {
    int result = o.fib(0);
    Assertions.assertEquals(-1, result);
  }

  @Test
  void fib3() {
    int result = o.fib(-3);
    Assertions.assertEquals(-1, result);
  }

  @Test
  void fib4() {
    int result = o.fib(2000);
    Assertions.assertEquals(1392522469, result);
  }

  @Test
  void fib5() {
    int result = o.fib1(2000);
    Assertions.assertEquals(1392522469, result);
  }

  @Test
  void fib6() {
    int result = o.fib2(2000);
    Assertions.assertEquals(1392522469, result);
  }
}
