import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoinChangeIssueTest {

  private final CoinChangeIssue o = new CoinChangeIssue();


  @Test
  void coinChange() {
    int[] coins = new int[3];
    coins[0] = 1;
    coins[1] = 2;
    coins[2] = 5;
    int result = o.coinChange(coins, 11);
    Assertions.assertEquals(3, result);
  }



  @Test
  void coinChange1() {
    int[] coins = new int[3];
    coins[0] = 1;
    coins[1] = 2;
    coins[2] = 5;
    int result = o.coinChange1(coins, 123456789);
    Assertions.assertEquals(24691359, result);
  }

  @Test
  void coinChange2() {
    int[] coins = new int[3];
    coins[0] = 1;
    coins[1] = 2;
    coins[2] = 5;
    int result = o.coinChange2(coins, 123456789);
    Assertions.assertEquals(24691359, result);
  }
}
