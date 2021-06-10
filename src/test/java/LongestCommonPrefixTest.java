import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

  private final LongestCommonPrefix o = new LongestCommonPrefix();


  @Test
  void longestCommonPrefixTest1() {
    String result = o.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    Assertions.assertEquals("fl", result);
  }

  @Test
  void longestCommonPrefixTest2() {
    String result = o.longestCommonPrefix(new String[]{"dog","racecar","car"});
    Assertions.assertEquals("", result);
  }

  @Test
  void longestCommonPrefixTest3() {
    String result = o.longestCommonPrefix(new String[]{});
    Assertions.assertEquals("", result);
  }

  @Test
  void longestCommonPrefixTest4() {
    String result = o.longestCommonPrefix(new String[]{"abc"});
    Assertions.assertEquals("abc", result);
  }

  @Test
  void longestCommonPrefixTest5() {
    String result = o.longestCommonPrefix(new String[]{""});
    Assertions.assertEquals("", result);
  }
}
