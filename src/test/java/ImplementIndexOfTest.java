import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementIndexOfTest {

  private final ImplementIndexOf o = new ImplementIndexOf();

  @Test
  void indexOfTest1() {
    String haystack = "hello", needle = "ll";
    Assertions.assertEquals(2, o.indexOf(haystack, needle));
  }

  @Test
  void indexOfTest2() {
    String haystack = "aaaaa", needle = "bba";
    Assertions.assertEquals(-1, o.indexOf(haystack, needle));
  }

  @Test
  void indexOfTest3() {
    String haystack = "", needle = "";
    Assertions.assertEquals(0, o.indexOf(haystack, needle));
  }
}
