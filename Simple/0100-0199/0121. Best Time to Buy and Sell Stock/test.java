import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1(){
        int[] nums = new int[]{7,1,5,3,6,4};
        assertEquals(Solution.maxProfit(nums), 5);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{7,6,4,3,1};
        assertEquals(Solution.maxProfit(nums), 0);
    }

}
