import java.util.HashMap;
import java.util.Random;

public class EightQueen {


  public void print(HashMap<Integer, Integer> map, int row, int col, int size) {
    if (row >= size) {
      System.out.println(map);
      return;
    }

    int nextPointRow = row;
    int nextPointCol = col + 1;
    if (nextPointCol >= size) {
      nextPointCol = 0;
      nextPointRow += 1;
    }
    HashMap<Integer, Integer> newMap = new HashMap<>(map);
    if (isValidPosition(map, row, col, size)) {
      if (new Random().nextInt() % 2 == 0) {
        newMap.put(row, col);
      }
    }
    print(newMap, nextPointRow, nextPointCol, size);
  }


  private boolean isValidPosition(HashMap<Integer, Integer> map, int row, int col, int size) {
    if (map.containsKey(row) || map.containsValue(col)) {
      return false;
    }
    int leftUpStep = 1;
    while ((row - leftUpStep) >= 0 && (col - leftUpStep) >= 0) {
      if (map.containsKey(row - leftUpStep) && map.get(row - leftUpStep) == col - leftUpStep) {
        return false;
      }
      leftUpStep++;
    }
    int rightUpStep = 1;
    while ((row - rightUpStep) >= 0 && (col + rightUpStep) < size) {
      if (map.containsKey(row - rightUpStep) && map.get(row - rightUpStep) == col + rightUpStep) {
        return false;
      }
      rightUpStep++;
    }
    return true;
  }
}
