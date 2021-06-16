import java.util.HashMap;

public class CoinChangeIssue {

  private final HashMap<Integer, Integer> map = new HashMap<>();

  public int coinChange(int[] coins, int amount) {

    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    int result = -1;
    for (int coin : coins) {
      int res;
      if (map.containsKey(amount - coin)) {
        res = map.get(amount - coin) + 1;
      } else {
        res = coinChange(coins, amount - coin) + 1;
      }
      if (res == 0) {
        continue;
      }
      if (result == -1 || res < result) {
        result = res;
      }
    }
    if (result != -1) {
      map.put(amount, result);
    }
    return result;
  }

  public int coinChange1(int[] coins, int amount) {
    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    int[] table = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (i - coin < 0) {
          continue; // if coins is sorted, use break
        }
        int pre = table[i - coin] + 1;
        if (table[i] == 0 || pre < table[i]) {
          table[i] = pre;
        }
      }

    }
    return table[amount];
  }

  public int coinChange2(int[] coins, int amount) {
    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    int[] table = new int[amount + 1];
    for (int i = 0; i < amount + 1; i++) {
      for (int coin : coins) {
        if (coin + i > amount) {
          break;
        }
        if (table[coin + i] != 0) {
          continue;
        }
        table[coin + i] = table[i] + 1;
        if (coin + i == amount) {
          return table[coin + i];
        }
      }
    }

    return table[amount];
  }

}
