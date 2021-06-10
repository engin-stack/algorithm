public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }

    ListNode firstNode = head;
    ListNode secondNode = firstNode.next;
    head.next = null;
    while (secondNode.next != null) {
      ListNode thirdNode = secondNode.next;
      secondNode.next = firstNode;
      firstNode = secondNode;
      secondNode = thirdNode;
    }
    secondNode.next = firstNode;
    return secondNode;
  }
}
