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
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode sentinal = new ListNode(0, head);
        ListNode newpointer = sentinal;
        while (newpointer.next != null) {
            if (newpointer.next.val == val) {
                newpointer.next = newpointer.next.next;
            }
            else {
                newpointer = newpointer.next;}
        }

        return sentinal.next;
    }
}
