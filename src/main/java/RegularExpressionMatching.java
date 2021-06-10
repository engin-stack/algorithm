public class RegularExpressionMatching {

  public boolean isMatch(String s, String p) {

    if (p.isEmpty()) {
      return s.isEmpty();
    }
    boolean firstMatch = (!s.isEmpty() &&
        (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

    if (p.length() >= 2 && p.charAt(1) == '*') {
      return (isMatch(s, p.substring(2)) ||
          (firstMatch && isMatch(s.substring(1), p)));
    } else {
      return firstMatch && isMatch(s.substring(1), p.substring(1));
    }
  }


  public static void main(String[] args) {
    RegularExpressionMatching o = new RegularExpressionMatching();
    System.out.println(o.isMatch("aa", "a"));
    System.out.println(o.isMatch("aa", "a*"));
    System.out.println(o.isMatch("ab", ".*"));
    System.out.println(o.isMatch("aab", "c*a*b"));
    System.out.println(o.isMatch("mississippi", "mis*is*p*."));
  }

}
