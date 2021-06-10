import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MSqrtTest {

  private final MSqrt o = new MSqrt();

  @Test
  void mySqrt1() {
    int result = o.mySqrt(16);
    Assertions.assertEquals(4, result);
  }

  @Test
  void mySqrt2() {
    int result = o.mySqrt(0);
    Assertions.assertEquals(0, result);
  }

  @Test
  void mySqrt3() {
    int result = o.mySqrt(1);
    Assertions.assertEquals(1, result);
  }
}
