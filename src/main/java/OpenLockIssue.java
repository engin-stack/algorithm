import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenLockIssue {

  public int openLock(String[] deadends, String target) {
    if (target.isBlank()) {
      return 0;
    }
    Set<String> deadEndsSet = new HashSet<>(Arrays.asList(deadends));
    Queue<String> queue = new LinkedList<>();
    String init = "0000";
    if (deadEndsSet.contains(init)) {
      return -1;
    }
    queue.add(init);
    int step = 0;
    while (!queue.isEmpty()) {
      int count = queue.size();
      while (count-- > 0) {
        String cur = queue.poll();
        if (cur == null) {
          return -1;//some error happen;
        }
        if (target.equals(cur)) {
          return step;
        }
        for (int i = 0; i < target.length(); i++) {
          String plusValue = plus(cur, i);
          if (!deadEndsSet.contains(plusValue)) {
            queue.add(plusValue);
            deadEndsSet.add(plusValue);
          }
          String minusValue = minus(cur, i);
          if (!deadEndsSet.contains(minusValue)) {
            queue.add(minusValue);
            deadEndsSet.add(minusValue);
          }
        }
      }
      step++;
    }
    return -1;
  }

  private String plus(String input, int index) {
    int size = input.length();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < size; i++) {
      if (i != index) {
        builder.append(input.charAt(i));
        continue;
      }
      char c = input.charAt(i);
      if (c == '9') {
        builder.append('0');
      } else {
        builder.append((char) (c + 1));
      }
    }
    return builder.toString();
  }

  private String minus(String input, int index) {
    int size = input.length();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < size; i++) {
      if (i != index) {
        builder.append(input.charAt(i));
        continue;
      }
      char c = input.charAt(i);
      if (c == '0') {
        builder.append('9');
      } else {
        builder.append((char) (c - 1));
      }
    }
    return builder.toString();
  }

}
