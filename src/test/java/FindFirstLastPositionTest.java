import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindFirstLastPositionTest {

  private final FindFirstLastPosition o = new FindFirstLastPosition();

  @Test
  void searchRangeCase1() {
    int[] nums = new int[]{5, 7, 7, 8, 8, 10};
    Assertions.assertArrayEquals(new int[]{3, 4}, o.searchRange(nums, 8));
  }

  @Test
  void searchRangeCase2() {
    int[] nums = new int[]{5, 7, 7, 8, 8, 10};
    Assertions.assertArrayEquals(new int[]{-1, -1}, o.searchRange(nums, 6));
  }

  @Test
  void searchRangeCase4() {
    int[] nums = new int[]{};
    Assertions.assertArrayEquals(new int[]{-1, -1}, o.searchRange(nums, 0));
  }
}
