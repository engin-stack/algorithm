public class JumpGame {

  public boolean canJump(int[] nums) {

    int size = nums.length;

    int currentIndex = 0;
    int maxIndex = 0;

    while (currentIndex < size - 1) {

      int num = nums[currentIndex];
      int maxJumpToIndex = currentIndex + num;
      if (maxJumpToIndex > maxIndex) {
        maxIndex = maxJumpToIndex;
      }
      if (maxIndex >= size - 1) {
        return true;
      }
      if (currentIndex == maxIndex) {
        return false;
      }
      currentIndex++;
    }

    return true;
  }

}
