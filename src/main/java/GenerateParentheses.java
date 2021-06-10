import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

  public List<String> generateParenthesis(int n) {

    List<String> result = new ArrayList<>();
    if (n == 1) {
      result.add("()");
      return result;
    }
    List<String> stepResultList = generateParenthesis(n - 1);
    for (String item : stepResultList) {
      for (int i = 0; i < item.length() + 1; i++) {
        String leftParenthesisAdd =
            item.substring(0, i) + "(" + (i == item.length() ? "" : item.substring(i));
        for (int j = 0; j < leftParenthesisAdd.length(); j++) {
          String newParenthesis = leftParenthesisAdd.substring(0, j + 1) + ")"
              + (j + 1 == leftParenthesisAdd.length() ? ""
              : leftParenthesisAdd.substring(j + 1));
          if (isValid(newParenthesis) && !result
              .contains(newParenthesis)) {
            result.add(newParenthesis);
          }
        }

      }
    }
    Collections.sort(result);
    return result;
  }

  private boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char item = s.charAt(i);
      if ('(' == item) {
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
    }
    return stack.isEmpty();
  }
}
