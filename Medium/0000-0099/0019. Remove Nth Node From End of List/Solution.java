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

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(0, null);
        sentinel.next = head;
        ListNode L_pointer = head;
        ListNode R_pointer = head;
        for (int i = 0; i < n; i++) {
            R_pointer = R_pointer.next;
        }
        if (R_pointer == null) {
            return head.next;
        }
        while (R_pointer.next != null) {
            R_pointer = R_pointer.next;
            L_pointer = L_pointer.next;
        }
        L_pointer.next = L_pointer.next.next;
        return sentinel.next;
    }
}