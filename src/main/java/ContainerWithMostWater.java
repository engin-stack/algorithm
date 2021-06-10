
public class ContainerWithMostWater {

  public int maxArea(int[] height) {

    int n = height.length;
    int maxValue = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int minHeight = Math.min(height[i], height[j]);
        int weight = j -i;
        int newResult = minHeight * weight;
        if (maxValue < newResult) {
          maxValue = newResult;
        }
      }
    }
    return maxValue;
  }

}
