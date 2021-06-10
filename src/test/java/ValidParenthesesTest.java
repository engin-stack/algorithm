import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

  private final ValidParentheses o = new ValidParentheses();

  @Test
  void isValidTest1() {
    boolean result = o.isValid("()");
    assertTrue(result);
  }

  @Test
  void isValidTest2() {
    boolean result = o.isValid("()[]{}");
    assertTrue(result);
  }

  @Test
  void isValidTest3() {
    boolean result = o.isValid("(]");
    assertFalse(result);
  }

  @Test
  void isValidTest4() {
    boolean result = o.isValid("([)]");
    assertFalse(result);
  }

  @Test
  void isValidTest5() {
    boolean result = o.isValid("{[]}");
    assertTrue(result);
  }
}
