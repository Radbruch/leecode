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
    private int overflow = 0;
    private ListNode pointerTol1;
    private ListNode pointerTol2;
    private ListNode pointerToAnswer;
    private ListNode answer = new ListNode();


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size = 0;
        pointerTol1 = l1;
        pointerTol2 = l2;
        pointerToAnswer = answer;
        int keyOfl1;
        int keyOfl2;
        int sumOfVal;
        int valOfNode;
        while (!(pointerTol1==null && pointerTol2==null)) {
            if (pointerTol1 == null) {
                keyOfl1 = 0;
                keyOfl2 = pointerTol2.val;
                pointerTol2 = pointerTol2.next;
            }
            else if (pointerTol2 == null) {
                keyOfl1 = pointerTol1.val;
                keyOfl2 = 0;
                pointerTol1 = pointerTol1.next;
            }
            else {
                keyOfl1 = pointerTol1.val;
                keyOfl2 = pointerTol2.val;
                pointerTol1 = pointerTol1.next;
                pointerTol2 = pointerTol2.next;
            }

            sumOfVal = keyOfl1 + keyOfl2 + overflow;
            valOfNode = sumOfVal % 10;
            overflow = sumOfVal / 10;

            if (size == 0) {
                answer.val = valOfNode;
            }
            else {
                pointerToAnswer.next = new ListNode(valOfNode);
                pointerToAnswer = pointerToAnswer.next;
            }
            size++;

        }
        if (!(overflow == 0)) {
            pointerToAnswer.next = new ListNode(overflow);
        }
        return answer;
    }
}


