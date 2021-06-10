import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class KClosestPointsToOrigin {

  public int[][] kClosest(int[][] points, int k) {

    Map<Integer, List<int[]>> treeMap = new TreeMap<>();
    for (int[] point : points) {
      int x = Math.abs(point[0]);
      int y = Math.abs(point[1]);
      int key = x * x + y * y;
      if (treeMap.containsKey(key)) {
        treeMap.get(key).add(point);
      } else {
        List<int[]> list = new ArrayList<>();
        list.add(point);
        treeMap.put(key, list);
      }
    }

    List<int[]> sortList = new ArrayList<>();
    for (Entry<Integer, List<int[]>> entry : treeMap.entrySet()){
      sortList.addAll(entry.getValue());
    }

    int[][] res = new int[k][2];
    for (int i = 0; i < k; i++) {
      res[i] = sortList.get(i);
    }
    return res;
  }
}
