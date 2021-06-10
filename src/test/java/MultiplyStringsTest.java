import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplyStringsTest {

  private final MultiplyStrings o = new MultiplyStrings();

  @Test
  void multiplyCase1() {
    String num1 = "2";
    String num2 = "3";
    Assertions.assertEquals("6", o.multiply(num1, num2));
  }

  @Test
  void multiplyCase2() {
    String num1 = "123";
    String num2 = "456";
    Assertions.assertEquals("56088", o.multiply(num1, num2));
  }

  @Test
  void multiplyCase3() {
    String num1 = "123456789";
    String num2 = "987654321";
    Assertions.assertEquals("121932631112635269", o.multiply(num1, num2));
  }
}
