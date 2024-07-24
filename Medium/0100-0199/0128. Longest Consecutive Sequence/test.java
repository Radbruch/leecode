import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1(){
        int[] nums = new int[]{100,4,200,1,3,2};
        assertEquals(4, Solution.longestConsecutive(nums));
    }

    @Test
    public void test2(){
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        assertEquals(9, Solution.longestConsecutive(nums));
    }

    @Test
    public void test3(){
        int[] nums = new int[]{1,2,0,1};
        assertEquals(3, Solution.longestConsecutive(nums));
    }

}
