/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/9/1 17:05
    *@Version 1.0
    **/
class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode sentinal = new ListNode(0, head);
        ListNode pointer = sentinal;
        ListNode temp;
        while (pointer.next != null) {
            if (pointer.next.next == null) return sentinal.next;
            temp = pointer.next; //1
            pointer.next = pointer.next.next; //2
            temp.next = temp.next.next; //3
            pointer.next.next = temp; //4
            pointer = pointer.next.next;
        }
        return sentinal.next;
    }
}
