import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int firstNumIndex = 0; firstNumIndex + 2 < nums.length; firstNumIndex++) {
            if (firstNumIndex > 0 && nums[firstNumIndex] == nums[firstNumIndex - 1]) {
                continue;
            }
            int secondNumIndex = firstNumIndex + 1, threeNumIndex = nums.length - 1;
            while (secondNumIndex < threeNumIndex) {
                int sum = nums[firstNumIndex] + nums[secondNumIndex] + nums[threeNumIndex];
                if (sum < 0) {
                    secondNumIndex++;
                    continue;
                }
                if (sum > 0) {
                    threeNumIndex--;
                    continue;
                }
                res.add(Arrays.asList(nums[firstNumIndex], nums[secondNumIndex], nums[threeNumIndex]));
                secondNumIndex++;
                threeNumIndex--;
                while (secondNumIndex < threeNumIndex && nums[secondNumIndex] == nums[secondNumIndex - 1])
                    secondNumIndex++;
                while (secondNumIndex < threeNumIndex && nums[threeNumIndex] == nums[threeNumIndex + 1])
                    threeNumIndex--;
            }
        }
        return res;
    }
}
