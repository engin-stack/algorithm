public class InsertSort {

  public void sort(int[] nums) {
    if (nums.length < 2) {
      return;
    }
    for (int i = 1; i < nums.length; i++) {
      int value = nums[i];
      for (int k = i - 1; k > 0; k--) {
        if (value < nums[k]) {
          continue;
        }
      }
    }
  }

}
