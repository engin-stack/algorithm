import java.util.Collections;

public class QuickSort {

  public void sort(int[] nums) {

    if (nums.length < 2) {
      return;
    }
    qSort(nums, 0, nums.length - 1);
  }

  private void qSort(int[] nums, int left, int right) {

    int start = left;
    int end = right;
    int base = nums[end];
    while (start < end) {
      while (nums[start] <= base && start < end) {
        start++;
      }
      if (start != end) {
        swap(nums, start, end);
        end--;
      }
      while (nums[end] > base && start < end) {
        end--;
      }
      if (start != end) {
        swap(nums, start, end);
        start++;
      }
    }
    qSort(nums, left, start - 1);
    qSort(nums, start + 1, right);
  }

  private void swap(int[] nums, int left, int right) {
    int tmp = nums[left];
    nums[left] = nums[right];
    nums[right] = tmp;
  }

}
