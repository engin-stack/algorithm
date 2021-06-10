public class NextPermutation {

  public void nextPermutation(int[] nums) {

    int len = nums.length;
    int compareNum = nums[len - 1];
    int i = len - 2;
    while (i >= 0) {
      if (nums[i] < compareNum) {
        break;
      } else {
        compareNum = nums[i];
        i--;
      }
    }

    if (i < 0) {
      reverse(nums, 0, len - 1);
      return;
    } else {
      int firstLargeIndex = i + 1;
      while (firstLargeIndex < len - 2) {
        if (nums[firstLargeIndex] > nums[i] && nums[firstLargeIndex + 1] < nums[i]) {
          break;
        }
        firstLargeIndex ++;
      }
      swap(nums, i, firstLargeIndex);
    }
    reverse(nums, i + 1, len - 1);
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  private void reverse(int[] nums, int i, int j) {
    while (i < j) {
      swap(nums, i, j);
      j--;
      i++;
    }
  }

}
