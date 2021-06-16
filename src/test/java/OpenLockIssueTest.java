import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OpenLockIssueTest {


  private final OpenLockIssue o = new OpenLockIssue();

  @Test
  void openLock1() {
    String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
    String target = "0202";
    Assertions.assertEquals(6, o.openLock(deadends, target));
  }

  @Test
  void openLock2() {
    String[] deadends = new String[]{"8888"};
    String target = "0009";
    Assertions.assertEquals(1, o.openLock(deadends, target));
  }

  @Test
  void openLock3() {
    String[] deadends = new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888",
        "9888"};
    String target = "8888";
    Assertions.assertEquals(-1, o.openLock(deadends, target));
  }

  @Test
  void openLock4() {
    String[] deadends = new String[]{"0000"};
    String target = "8888";
    Assertions.assertEquals(-1, o.openLock(deadends, target));
  }

  @Test
  void openLock5() {
    String[] deadends = new String[]{"2111","2202","2210","0201","2210"};
    String target = "2201";
    Assertions.assertEquals(5, o.openLock(deadends, target));
  }
}
