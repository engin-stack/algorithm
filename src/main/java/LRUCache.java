import java.util.LinkedHashMap;

public class LRUCache {

  private final int capacity;
  private final LinkedHashMap<Integer, Integer> cache;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    cache = new LinkedHashMap<>();
  }

  public int get(int key) {
    return cache.getOrDefault(key, -1);
  }

  public void put(int key, int value) {

    Integer oldKey = null;
    if (cache.containsKey(key)) {
      oldKey = key;
    } else if (capacity == cache.size()) {
      oldKey = cache.keySet().iterator().next();
    }
    if (oldKey != null) {
      cache.remove(oldKey);
    }
    cache.put(key, value);
  }
}
