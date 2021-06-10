import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        int diff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for (int firstNumIndex = 0; firstNumIndex + 2 < nums.length; firstNumIndex++) {
            if (firstNumIndex > 0 && nums[firstNumIndex] == nums[firstNumIndex - 1]) {
                continue;
            }
            int secondNumIndex = firstNumIndex + 1, threeNumIndex = nums.length - 1;
            while (secondNumIndex < threeNumIndex) {
                int sum = nums[firstNumIndex] + nums[secondNumIndex] + nums[threeNumIndex];
                if (sum == target) {
                    return target;
                }
                int gap = Math.abs(target - sum);
                if (gap < diff) {
                    diff = gap;
                    res = sum;
                }
                if (sum < target) {
                    secondNumIndex++;
                } else {
                    threeNumIndex--;
                }
            }
        }
        return res;
    }
}
