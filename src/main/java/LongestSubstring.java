import java.util.HashSet;

public class LongestSubstring {

  public int lengthOfLongestSubstring(String s) {

    char[] charArr = s.toCharArray();
    int sz = charArr.length;
    int result = (sz == 1 ? 1 : 0);
    HashSet<Character> charSet = new HashSet<>();
    for (int i = 0; i < sz - 1; i++) {
      charSet.clear();
      charSet.add(charArr[i]);
      for (int j = i + 1; j < sz; j++) {
        if (charSet.contains(charArr[j])) {
          break;
        } else {
          charSet.add(charArr[j]);
        }
      }
      if (charSet.size() > result) {
        result = charSet.size();
      }
    }
    return result;
  }

}
