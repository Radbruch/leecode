import org.junit.Test;

public class test {
    @Test
    public void test(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode result = Solution.mergeTwoLists(l1, l2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
