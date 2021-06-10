import java.util.HashMap;

public class FibCalc {

  private final HashMap<Integer, Integer> resultMap = new HashMap<>();

  public int fib0(int n) {
    if (n <= 0) {
      return -1;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
   return fib(n - 1) + fib(n - 2);
  }

  public int fib(int n) {
    if (n <= 0) {
      return -1;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    if (resultMap.containsKey(n)) {
      return resultMap.get(n);
    }
    int result = fib(n - 1) + fib(n - 2);
    resultMap.put(n, result);
    return result;
  }

  public int fib1(int n) {

    if (n <= 0) {
      return -1;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    int[] table = new int[n];
    table[0] = 1;
    table[1] = 1;
    for (int i = 2; i < n; i++) {
      table[i] = table[i-1] + table[i-2];
    }
    return table[n-1];
  }

  public int fib2(int n) {

    if (n <= 0) {
      return -1;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    int pre = 1;
    int cur = 1;
    for (int i = 3; i <= n; i++) {
      int newCur = pre + cur;
      pre = cur;
      cur = newCur;
    }
    return cur;
  }

}
