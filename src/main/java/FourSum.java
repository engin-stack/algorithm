import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    int size = nums.length;
    if (size < 4) {
      return res;
    }
    Arrays.sort(nums);
    for (int i = 0; i + 3 < size; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int otherThreeSumTarget = target - nums[i];
      int[] otherThreeSumArr = Arrays.copyOfRange(nums, i + 1, size);
      List<List<Integer>> threeSumResultList = threeSum(otherThreeSumArr, otherThreeSumTarget);
      for (List<Integer> threeSumResult : threeSumResultList) {
        List<Integer> item = new ArrayList<>();
        item.add(nums[i]);
        item.addAll(threeSumResult);
        res.add(item);
      }
    }
    return res;
  }


  private List<List<Integer>> threeSum(int[] nums, int target) {

    List<List<Integer>> res = new ArrayList<>();
    for (int firstNumIndex = 0; firstNumIndex + 2 < nums.length; firstNumIndex++) {
      if (firstNumIndex > 0 && nums[firstNumIndex] == nums[firstNumIndex - 1]) {
        continue;
      }
      int secondNumIndex = firstNumIndex + 1, threeNumIndex = nums.length - 1;
      while (secondNumIndex < threeNumIndex) {
        int sum = nums[firstNumIndex] + nums[secondNumIndex] + nums[threeNumIndex];
        if (sum < target) {
          secondNumIndex++;
          continue;
        }
        if (sum > target) {
          threeNumIndex--;
          continue;
        }
        res.add(Arrays.asList(nums[firstNumIndex], nums[secondNumIndex], nums[threeNumIndex]));
        secondNumIndex++;
        threeNumIndex--;
        while (secondNumIndex < threeNumIndex && nums[secondNumIndex] == nums[secondNumIndex - 1]) {
          secondNumIndex++;
        }
        while (secondNumIndex < threeNumIndex && nums[threeNumIndex] == nums[threeNumIndex + 1]) {
          threeNumIndex--;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    FourSum o = new FourSum();
    System.out.println(o.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    System.out.println(o.fourSum(new int[]{}, 0));
  }

}
