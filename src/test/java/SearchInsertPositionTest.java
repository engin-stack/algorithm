import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

  private final SearchInsertPosition o = new SearchInsertPosition();

  @Test
  void searchInsert() {
    int[] nums = new int[]{1, 3};
    Assertions.assertEquals(1, o.searchInsert(nums, 2));
  }
}
