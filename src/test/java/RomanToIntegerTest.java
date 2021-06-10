import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

  RomanToInteger o = new RomanToInteger();

  @Test
  void romanToIntTest1() {
    int result = o.romanToInt("III");
    Assertions.assertEquals(3, result);
  }

  @Test
  void romanToIntTest2() {
    int result = o.romanToInt("IV");
    Assertions.assertEquals(4, result);
  }

  @Test
  void romanToIntTest3() {
    int result = o.romanToInt("IX");
    Assertions.assertEquals(9, result);
  }

  @Test
  void romanToIntTest4() {
    int result = o.romanToInt("LVIII");
    Assertions.assertEquals(58, result);
  }

  @Test
  void romanToIntTest5() {
    int result = o.romanToInt("MCMXCIV");
    Assertions.assertEquals(1994, result);
  }
}
