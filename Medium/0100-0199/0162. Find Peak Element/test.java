import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    @Test
    public void test1(){
        int[] nums = new int[]{1,2,3,1};
        int answer = Solution.findPeakElement(nums);
        assertEquals(answer, 2);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{1,2,1,3,5,6,4};
        int answer = Solution.findPeakElement(nums);
        try {
            assertEquals(1, answer);  // 第一种可能的预期结果
        } catch (AssertionError e) {
            assertEquals(5, answer);  // 第二种可能的预期结果
        }
    }
}
