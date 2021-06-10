import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {

    List<ListNode> listNodeList = new ArrayList<>();

    ListNode node = head;
    while (node != null) {
      listNodeList.add(node);
      node = node.next;
    }

    int length = listNodeList.size();
    for (int i = 0; i < length; i++) {
      if (i != length - n) {
        continue;
      }

      ListNode removeNode = listNodeList.get(i);
      if (i == 0) {
        return removeNode.next;
      }
      listNodeList.get(i - 1).next = removeNode.next;
      return head;
    }
    return head;
  }

}
