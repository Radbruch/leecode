class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode head = result;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                result.next = p2;
                return head.next;
            }
            else if (p2 == null) {
                result.next = p1;
                return head.next;
            }
            else {
                if (p1.val > p2.val) {
                    result.next = new ListNode(p2.val);
                    p2 = p2.next;
                    result = result.next;
                }
                else {
                    result.next = new ListNode(p1.val);
                    p1 = p1.next;
                    result = result.next;
                }
            }
        }
        return head.next;
    }
}
