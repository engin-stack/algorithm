public class StringToIntegerAtoi {

  public int myAtoi(String s) {

    Boolean isPositive = null;
    boolean isLeading = true;
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (isLeading && c == ' ') {
        start++;
        end++;
        continue;
      }
      if (isLeading && c == '+') {
        start++;
        end++;
        isPositive = true;
        isLeading = false;
        continue;
      }
      if (isLeading && c == '-') {
        start++;
        end++;
        isPositive = false;
        isLeading = false;
        continue;
      }
      if (c < '0' || c > '9') {
        break;
      }
      end++;
      if (isLeading) {
        isLeading = false;
      }
    }
    if (end > start) {
      String subString = s.substring(start, end);
      double result = 0;
      for (int i = 0; i < subString.length(); i++) {
        String dig = subString.substring(i, i + 1);
        int digInt = Integer.parseInt(dig);
        result = result + digInt * Math.pow(10, subString.length() - i - 1);
        if ((isPositive == null || isPositive) && result > Integer.MAX_VALUE) {
          return Integer.MAX_VALUE;
        }
        if ((isPositive != null && !isPositive) && -result < Integer.MIN_VALUE) {
          return Integer.MIN_VALUE;
        }
      }
      return (int) ((isPositive == null || isPositive) ? result : -result);
    }
    return 0;
  }

  public static void main(String[] args) {
    StringToIntegerAtoi o = new StringToIntegerAtoi();
    System.out.println(o.myAtoi("42"));
    System.out.println(o.myAtoi("   -42"));
    System.out.println(o.myAtoi("4193 with words"));
    System.out.println(o.myAtoi("words and 987"));
    System.out.println(o.myAtoi("-91283472332"));
    System.out.println(o.myAtoi("--91283472332"));
    System.out.println(o.myAtoi("-91.283472332"));
    System.out.println(o.myAtoi(""));
    System.out.println(o.myAtoi("+22"));
    System.out.println(o.myAtoi("20000000000000000000"));
    System.out.println(o.myAtoi("  +  413"));
  }

}
