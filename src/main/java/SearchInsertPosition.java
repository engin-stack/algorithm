public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {

    int size = nums.length;
    if (target <= nums[0]) {
      return 0;
    }
    for (int i = 1; i < size; i++) {
      if (nums[i - 1] < target && nums[i] >= target) {
        return i;
      }
    }
    return size;
  }

}
