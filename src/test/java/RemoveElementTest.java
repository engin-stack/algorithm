import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

  private final RemoveElement o = new RemoveElement();

  @Test
  void removeElement() {
    int[] nums = new int[]{3,2,2,3};
    int result = o.removeElement(nums, 3);
    Assertions.assertEquals(2, result);
  }

  @Test
  void removeElement2() {
    int[] nums = new int[]{};
    int result = o.removeElement(nums, 3);
    Assertions.assertEquals(0, result);
  }
}
