import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  private final ContainerWithMostWater o = new ContainerWithMostWater();

  @Test
  void maxAreaTest1() {
    int result = o.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    Assertions.assertEquals(49, result);
  }

  @Test
  void maxAreaTest2() {
    int result = o.maxArea(new int[]{1, 1});
    Assertions.assertEquals(1, result);
  }

  @Test
  void maxAreaTest3() {
    int result = o.maxArea(new int[]{4, 3, 2, 1, 4});
    Assertions.assertEquals(16, result);
  }

  @Test
  void maxAreaTest4() {
    int result = o.maxArea(new int[]{1, 2, 1});
    Assertions.assertEquals(2, result);
  }

}
