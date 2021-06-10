import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JumpGameTest {

  private final JumpGame o = new JumpGame();

  @Test
  void canJumpCase1() {
    int[] nums = new int[]{2, 3, 1, 1, 4};
    assertTrue(o.canJump(nums));
  }

  @Test
  void canJumpCase2() {
    int[] nums = new int[]{3, 2, 1, 0, 4};
    assertFalse(o.canJump(nums));
  }

}
