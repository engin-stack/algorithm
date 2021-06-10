import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementPowTest {

  private final ImplementPow o = new ImplementPow();

  @Test
  void myPowCase1() {
    Assertions.assertEquals(1024.0000, o.myPow(2.00000, 10));
  }

  @Test
  void myPowCase2() {
    Assertions.assertEquals(9.26100, o.myPow(2.10000, 3));
  }

  @Test
  void myPowCase3() {
    Assertions.assertEquals(0.25000, o.myPow(2.00000, -2));
  }

  @Test
  void myPowCase4() {
    Assertions.assertEquals(700.28148, o.myPow(8.88023, 3));
  }

  @Test
  void myPowCase5() {
    Assertions.assertEquals(3e-05, o.myPow(34.00515, -3));
  }

  @Test
  void myPowCase6() {
    Assertions.assertEquals(54.83508, o.myPow(0.44894, -5));
  }
}

