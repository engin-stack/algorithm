public class KokoEatingBananas {

  public int minEatingSpeed(int[] piles, int h) {

    int maxSpeed = getMaxInt(piles);
    if (h == piles.length) {
      return maxSpeed;
    }
    int start = 1;
    int end = maxSpeed;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (canFinish(piles, mid, h)) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  private boolean canFinish(int[] piles, int speed, int h) {
    int timeNeed = 0;
    for (int pile : piles) {
      timeNeed = timeNeed + pile / speed + (pile % speed == 0 ? 0 : 1);
      if (timeNeed > h) {
        return false;
      }
    }
    return true;
  }

  private int getMaxInt(int[] piles) {
    int max = 0;
    for (int pile : piles) {
      if (pile > max) {
        max = pile;
      }
    }
    return max;
  }
}
