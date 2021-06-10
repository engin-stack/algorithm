public class MedianOfTwoSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int m = nums1.length;
    int n = nums2.length;
    int[] mergeArray = new int[m + n];
    int nums1Index = 0;
    int nums2Index = 0;
    for (int i = 0; i < (m + n); i++) {
      if (nums1Index == m) {
        mergeArray[i] = nums2[nums2Index++];
        continue;
      }
      if (nums2Index == n) {
        mergeArray[i] = nums1[nums1Index++];
        continue;
      }
      if (nums1[nums1Index] <= nums2[nums2Index]) {
        mergeArray[i] = nums1[nums1Index++];
        continue;
      }
      mergeArray[i] = nums2[nums2Index++];
    }
    if ((m + n) % 2 == 0) {
      return ((double) (mergeArray[(m + n) / 2] + mergeArray[(m + n) / 2 - 1])) / 2;
    }
    return mergeArray[(m + n) / 2];
  }


  public static void main(String[] args) {
    MedianOfTwoSortedArrays o = new MedianOfTwoSortedArrays();
//    int[] nums1 = {1, 3}, nums2 = {2};
//    int[] nums1 = {1, 2}, nums2 = {3, 4};
//    int[] nums1 = {0, 0}, nums2 = {0, 0};
//    int[] nums1 = {}, nums2 = {1};
    int[] nums1 = {2}, nums2 = {};
    System.out.println(o.findMedianSortedArrays(nums1, nums2));

  }

}
