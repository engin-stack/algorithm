import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

  private final RemoveDuplicatesFromSortedArray o = new RemoveDuplicatesFromSortedArray();

  @Test
  void removeDuplicatesCase1() {
    int[] nums = new int[]{1,1,2};
    int result = o.removeDuplicates(nums);
    Assertions.assertEquals(2, result);
    for (int i = 0; i < result; i++) {
      System.out.println(nums[i]);
    }
  }

  @Test
  void removeDuplicatesCase2() {
    int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
    int result = o.removeDuplicates(nums);
    Assertions.assertEquals(5, result);
    for (int i = 0; i < result; i++) {
      System.out.println(nums[i]);
    }
  }
}
