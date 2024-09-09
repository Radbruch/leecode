import org.junit.Test;

public class test {
    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        Solution.removeElements(head, 3);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(3, null)))))));
        Solution.removeElements(head, 3);
    }
}
