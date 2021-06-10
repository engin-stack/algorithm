public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    int size = strs.length;
    if (size == 0) {
      return "";
    }
    if (size == 1) {
      return strs[0];
    }
    String result = strs[0];
    for (int i = 1; i < size; i++) {
      String comparedString = strs[i];
      int j = 0;
      while (j < Math.min(result.length(), comparedString.length())) {
        if (result.charAt(j) != comparedString.charAt(j)) {
          break;
        }
        j++;
      }
      if (j == 0) {
        return "";
      }
      result = result.substring(0, j);
    }
    return result;
  }

}
