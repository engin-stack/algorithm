public class ReverseNodesInKGroup {

  // recursively
  public ListNode reverseKGroup(ListNode head, int k) {
    int l = 0;
    ListNode cur = head;
    while (cur != null) {
      l++;
      cur = cur.next;
    }
    if (k > l) {
      return head;
    }
    cur = head;
    ListNode node = null;
    for (int i = 0; i < k; i++) {
      ListNode nxt = cur.next;
      cur.next = node;
      node = cur;
      cur = nxt;
    }
    head.next = reverseListNode(cur, k);
    return node;
  }

  // iteratively
  public ListNode reverseListNode(ListNode head, int k) {
    int l = 0;
    ListNode cur = head;
    while (cur != null) {
      l++;
      cur = cur.next;
    }
    if (l < k) {
      return head;
    }
    int n = l / k;
    ListNode pre = new ListNode(0), node, rem, ret = pre;
    for (int i = 0; i < n; i++) {
      node = null;
      rem = head;
      for (int j = 0; j < k; j++) {
        ListNode nxt = head.next;
        head.next = node;
        node = head;
        head = nxt;
      }
      pre.next = node;
      rem.next = head;
      pre = rem;
    }
    return ret.next;
  }

}
