/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode answer = new ListNode(head.val);
        ListNode L = head.next;
        ListNode R = head.next.next;
        while (R != null) {
            L.next = answer;
            answer = L;
            L = R;
            R = R.next;
        }
        L.next = answer;
        return L;
    }
}