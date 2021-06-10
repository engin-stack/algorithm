public class ReverseInteger {

  public int reverse(int x) {
    String sign = "";
    String xString = x + "";
    if (x < 0) {
      sign = "-";
      xString = xString.substring(1);
    }
    char[] arr = xString.toCharArray();
    StringBuilder sb = new StringBuilder();
    sb.append(sign);
    for (int i = arr.length - 1; i >= 0; i--) {
      sb.append(arr[i]);
    }
    String reversedString = sb.toString();
    long s = Long.parseLong(reversedString);
    if (s > Integer.MAX_VALUE || s < Integer.MIN_VALUE) {
      return 0;
    }
    return Integer.parseInt(reversedString);
  }

  public int reverseOff(int x) {
    long rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      rev = rev * 10 + pop;
    }
    if (rev > (long) Integer.MAX_VALUE || rev < (long) Integer.MIN_VALUE) {
      return 0;
    }
    return (int) rev;
  }

  public static void main(String[] args) {
    int input = -77;
    System.out.println(input % 10);
    System.out.println(input / 10);
  }

}
