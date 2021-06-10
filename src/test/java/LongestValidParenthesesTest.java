import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestValidParenthesesTest {

  private final LongestValidParentheses o = new LongestValidParentheses();

  @Test
  void longestValidParenthesesCase1() {
    Assertions.assertEquals(2, o.longestValidParentheses("(()"));
  }

  @Test
  void longestValidParenthesesCase2() {
    Assertions.assertEquals(4, o.longestValidParentheses(")()())"));
  }

  @Test
  void longestValidParenthesesCase3() {
    Assertions.assertEquals(0, o.longestValidParentheses(""));
  }


  @Test
  void longestValidParenthesesCase4() {
    Assertions.assertEquals(2, o.longestValidParentheses("()(()"));
  }

}
