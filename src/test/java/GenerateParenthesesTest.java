import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateParenthesesTest {
  private final GenerateParentheses o = new GenerateParentheses();

  @Test
  void generateParenthesisTest1() {
    List<String> result = o.generateParenthesis(1);
    Assertions.assertArrayEquals(new String[]{"()"}, result.toArray());
  }

  @Test
  void generateParenthesisTest2() {
    List<String> result = o.generateParenthesis(3);
    Assertions.assertArrayEquals(new String[]{"((()))","(()())","(())()","()(())","()()()"}, result.toArray());
  }

}
