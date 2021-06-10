import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidPerfectSquareTest {

  private final ValidPerfectSquare o = new ValidPerfectSquare();

  @Test
  void isPerfectSquareCase1() {
    assertTrue(o.isPerfectSquare(16));
  }

  @Test
  void isPerfectSquareCase2() {
    assertFalse(o.isPerfectSquare(14));
  }

  @Test
  void isPerfectSquareCase3() {
    assertFalse(o.isPerfectSquare(2147483647));
  }

  @Test
  void isPerfectSquareCase4() {
    assertTrue(o.isPerfectSquare(808201));
  }

  @Test
  void isPerfectSquareCase5() {
    assertFalse(o.isPerfectSquare(5));
  }
}
