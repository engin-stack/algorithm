public class LongestPalindromicSubstring {

  public String longestPalindrome(String s) {
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
      int oddLen = expandAroundCenter(s, i, i);
      int evenLen = expandAroundCenter(s, i, i + 1);
      int len = Math.max(oddLen, evenLen);
      if (len > end - start) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }
    return s.substring(start, end + 1);
  }

  private int expandAroundCenter(String s, int left, int right) {
    int lIndex = left, rIndex = right;
    while (lIndex >= 0 && rIndex < s.length() && s.charAt(lIndex) == s.charAt(rIndex)) {
      lIndex--;
      rIndex++;
    }
    return rIndex - lIndex - 1;
  }

  public static void main(String[] args) {
    LongestPalindromicSubstring o = new LongestPalindromicSubstring();
    String s1 = "babad";
    String s2 = "cbbd";
    String s3 = "a";
    String s4 = "bb";
    String s5 = "ac";
    System.out.println(o.longestPalindrome(s1));
    System.out.println(o.longestPalindrome(s2));
    System.out.println(o.longestPalindrome(s3));
    System.out.println(o.longestPalindrome(s4));
    System.out.println(o.longestPalindrome(s5));
  }
}
