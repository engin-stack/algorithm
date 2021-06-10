import java.util.Collections;
import java.util.HashSet;

public class CoinChangeIssue {

  public int coinChange(int[] coins, int amount) {

    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    HashSet<Integer> res = new HashSet<>();
    for (int coin : coins) {
      int result = coinChange(coins, amount - coin);
      if (result == -1) {
        continue;
      }
      res.add(result + 1);
    }
    return Collections.min(res);
  }

}
