import org.junit.Test;

public class test {
    @Test
    public void test(){
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        Solution.swapPairs(l);
    }
}
