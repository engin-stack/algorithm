public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    ListNode resultListNodeHead;
    int node1HeadValue = l1.val;
    int node2HeadValue = l2.val;
    if (node1HeadValue < node2HeadValue) {
      resultListNodeHead = l1;
      l1 = l1.next;
    } else {
      resultListNodeHead = l2;
      l2 = l2.next;
    }

    ListNode listNode = resultListNodeHead;
    while (l1 != null && l2 != null) {
      int node1Value = l1.val;
      int node2Value = l2.val;
      if (node1Value < node2Value) {
        listNode.next = l1;
        l1 = l1.next;
      } else {
        listNode.next = l2;
        l2 = l2.next;
      }
      listNode = listNode.next;
    }
    listNode.next = (l1 == null ? l2 : l1);
    return resultListNodeHead;
  }
}
