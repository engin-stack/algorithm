import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextPermutationTest {

  NextPermutation o = new NextPermutation();

  @Test
  void nextPermutationCase1() {

    int[] nums = new int[]{1, 2, 3};
    o.nextPermutation(nums);
    Assertions.assertArrayEquals(nums, new int[]{1, 3, 2});
  }

  @Test
  void nextPermutationCase2() {

    int[] nums = new int[]{3, 2, 1};
    o.nextPermutation(nums);
    Assertions.assertArrayEquals(nums, new int[]{1, 2, 3});
  }

  @Test
  void nextPermutationCase3() {

    int[] nums = new int[]{1, 1, 5};
    o.nextPermutation(nums);
    Assertions.assertArrayEquals(nums, new int[]{1, 5, 1});
  }

  @Test
  void nextPermutationCase4() {

    int[] nums = new int[]{1};
    o.nextPermutation(nums);
    Assertions.assertArrayEquals(nums, new int[]{1});
  }

}
