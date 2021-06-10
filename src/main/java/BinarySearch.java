public class BinarySearch {

  public int search(int[] nums, int target) {
    return bSearch(nums, 0, nums.length - 1, target);
  }

  private int bSearch(int[] nums, int low, int high, int target) {

    if (low > high) {
      return -1;
    }
    int mid = low + (high - low) / 2;
    if (nums[mid] > target) {
      return bSearch(nums, low, mid - 1, target);
    }
    if (nums[mid] < target) {
      return bSearch(nums, mid + 1, high, target);
    }
    return mid;
  }


}
