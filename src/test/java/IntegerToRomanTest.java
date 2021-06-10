import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToRomanTest {

  private final IntegerToRoman o = new IntegerToRoman();

  @Test
  void intToRomanTest1() {
    String result = o.intToRoman(3);
    Assertions.assertEquals("III", result);
  }

  @Test
  void intToRomanTest2() {
    String result = o.intToRoman(4);
    Assertions.assertEquals("IV", result);
  }

  @Test
  void intToRomanTest3() {
    String result = o.intToRoman(9);
    Assertions.assertEquals("IX", result);
  }

  @Test
  void intToRomanTest4() {
    String result = o.intToRoman(58);
    Assertions.assertEquals("LVIII", result);
  }

  @Test
  void intToRomanTest5() {
    String result = o.intToRoman(1994);
    Assertions.assertEquals("MCMXCIV", result);
  }

}
