public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }
    ListNode firstNode = head;
    ListNode secondNode = head.next;
    firstNode.next = secondNode.next;
    secondNode.next = firstNode;
    head = secondNode;
    ListNode node = head.next;

    while (node.next != null && node.next.next != null) {
      ListNode nodeLast = node.next.next;
      node.next.next = nodeLast.next;
      nodeLast.next = node.next;
      node.next = nodeLast;
      node = node.next.next;
    }
    return head;
  }

}
