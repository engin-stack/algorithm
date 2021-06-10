import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  private static Map<String, Integer> map = new HashMap<>();

  static {
    map.put("I", 1);
    map.put("IV", 4);
    map.put("V", 5);
    map.put("IX", 9);
    map.put("X", 10);
    map.put("XL", 40);
    map.put("L", 50);
    map.put("XC", 90);
    map.put("C", 100);
    map.put("CD", 400);
    map.put("D", 500);
    map.put("CM", 900);
    map.put("M", 1000);
  }

  public int romanToInt(String s) {

    int size = s.length();
    int result = 0;

    for (int i = 0; i < size; i++) {
      char ch = s.charAt(i);
      if (i + 1 < size) {
        char nextCh = s.charAt(i + 1);
        String key = String.valueOf(ch) + nextCh;
        if (map.containsKey(key)) {
          result += map.get(key);
          i++;
          continue;
        }
      }
      result += map.get(String.valueOf(ch));
    }
    return result;
  }
}
