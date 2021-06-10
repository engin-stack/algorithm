public class FirstBadVersion {

  public int firstBadVersion(int n) {

    int leftIndex = 1, rightIndex = n;

    while (leftIndex < rightIndex) {
      int mid = leftIndex + (rightIndex - leftIndex) / 2;
      if (isBadVersion(mid)) {
        rightIndex = mid;
      } else {
        leftIndex = mid + 1;
      }
    }
    return leftIndex;
  }

  private boolean isBadVersion(int version) {
    return false;
  }

}
