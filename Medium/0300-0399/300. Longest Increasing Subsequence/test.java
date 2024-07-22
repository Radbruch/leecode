import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1(){
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        assertEquals(Solution.lengthOfLIS(nums), 4);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{0,1,0,3,2,3};
        assertEquals(Solution.lengthOfLIS(nums), 4);
    }

    @Test
    public void test3(){
        int[] nums = new int[]{7,7,7,7,7,7,7};
        assertEquals(Solution.lengthOfLIS(nums), 1);
    }
}
