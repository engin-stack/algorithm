public class ImplementIndexOf {

  public int indexOf(String haystack, String needle) {

    if (needle.length() == 0) {
      return 0;
    }
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.charAt(i) != needle.charAt(0)) {
        continue;
      }

      boolean found = true;
      for (int j = 1; j < needle.length(); j++) {
        if (needle.charAt(j) != haystack.charAt(i + j)) {
          found = false;
          break;
        }
      }
      if (found) {
        return i;
      }
    }
    return -1;
  }
}
