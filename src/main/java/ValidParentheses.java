import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char item = s.charAt(i);
      if ('(' == item || '[' == item || '{' == item) {
        stack.push(item);
        continue;
      }
      if (stack.empty()) {
        return false;
      }
      char popItem = stack.pop();
      if (')' == item && popItem != '(') {
        return false;
      }
      if (']' == item && popItem != '[') {
        return false;
      }
      if ('}' == item && popItem != '{') {
        return false;
      }
    }
    return stack.isEmpty();
  }
}
