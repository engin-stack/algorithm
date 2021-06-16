import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

class EightQueenTest {

  private final EightQueen o = new EightQueen();

  @Test
  void print() {
    HashMap<Integer, Integer> map = new HashMap<>();
    o.print(map, 0, 0, 50);
  }
}
