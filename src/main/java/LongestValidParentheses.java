import java.util.Stack;

public class LongestValidParentheses {

  public int longestValidParentheses(String s) {

    Stack<Character> stack = new Stack<>();
    int res = 0;
    int count = 0;
    int tm =0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ('(' == c) {
        stack.push(c);
        continue;
      }
      if (stack.isEmpty() || stack.peek() != '(') {
        stack.clear();
        if (count > res) {
          res = count;
        }
        count = 0;
      } else {
        stack.pop();
        tm += 2;
        if (stack.isEmpty()) {
          count = tm;
        }
      }
    }

    return Integer.max(res, count);
  }

}
