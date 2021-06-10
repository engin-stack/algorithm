public class FindFirstLastPosition {

  public int[] searchRange(int[] nums, int target) {
    int searchResult = binarySearch(nums, 0, nums.length - 1, target);
    if (searchResult == -1) {
      return new int[]{-1, -1};
    }

    int start = searchResult, end = searchResult;
    while (start > 0 && nums[start - 1] == target) {
      start--;
    }
    while (end < nums.length - 1 && nums[end + 1] == target) {
      end++;
    }
    return new int[]{start, end};
  }

  private int binarySearch(int[] nums, int low, int high, int target) {
    if (low > high) {
      return -1;
    }
    int mid = low + (high - low) / 2;
    if (nums[mid] > target) {
      return binarySearch(nums, low, mid - 1, target);
    }
    if (nums[mid] < target) {
      return binarySearch(nums, mid + 1, high, target);
    }
    return mid;
  }

}
