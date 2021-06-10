import java.util.Collections;

public class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {

    int k = lists.length;
    if (k == 0) {
      return null;
    }
    if (k == 1) {
      return lists[0];
    }
    ListNode result = lists[0];
    for (int i = 1; i < k; i++) {
      result = mergeListNode(result, lists[i]);
    }
    return result;
  }

  private ListNode mergeListNode(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    ListNode resultNodeHead;
    if (l1.val < l2.val) {
      resultNodeHead = l1;
      l1 = l1.next;
    } else {
      resultNodeHead = l2;
      l2 = l2.next;
    }
    ListNode resultNode = resultNodeHead;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        resultNode.next = l1;
        resultNode = l1;
        l1 = l1.next;
      } else {
        resultNode.next = l2;
        resultNode = l2;
        l2 = l2.next;
      }
    }
    resultNode.next = (l1 == null ? l2 : l1);
    return resultNodeHead;
  }

}
