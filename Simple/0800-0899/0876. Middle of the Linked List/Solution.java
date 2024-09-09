/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/9/1 20:58
    *@Version 1.0
    **/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (fast == null || fast.next == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
