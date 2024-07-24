import org.junit.Test;


public class test {

    @Test
    public void test1(){
        Solution.ListNode listNode = new Solution.ListNode(1);
        listNode.next = new Solution.ListNode(2);
        listNode.next.next = new Solution.ListNode(3);
        listNode.next.next.next = new Solution.ListNode(4);
        listNode.next.next.next.next = new Solution.ListNode(5);
        int n = 2;
        Solution.ListNode result;
        result = Solution.removeNthFromEnd(listNode,n);
        while (result.next!= null) {
            System.out.println(result.val);
            result= result.next;
        }
    }

    @Test
    public void test2(){
        Solution.ListNode listNode = new Solution.ListNode(1);
        listNode.next = new Solution.ListNode(2);
        int n = 2;
        Solution.ListNode result;
        result = Solution.removeNthFromEnd(listNode,n);
        while (result.next!= null) {
            System.out.println(result.val);
            result= result.next;
        }
    }
}
