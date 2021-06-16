import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

  public int findMindDepth(BinaryTreeNode node) {
    if (node == null) {
      return 0;
    }
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(node);
    int depth = 1;

    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size-- > 0) {
        BinaryTreeNode item = queue.poll();
        if (item == null) {
          return -1; //some error happened
        }
        if (item.left == null && item.right == null) {
          return depth;
        }
        if (item.left != null) {
          queue.add(item.left);
        }
        if (item.right != null) {
          queue.add(item.right);
        }
      }
      depth++;
    }
    return depth;
  }

}
