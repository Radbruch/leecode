import static org.junit.Assert.*;
import org.junit.Test;

public class test {

    @Test
    public void test1(){
        int[] nums1 = new int[]{1,2,3,2,1};
        int[] nums2 = new int[]{3,2,1,4,7};
        int answer = Solution.findLength(nums1,nums2);
        assertEquals(answer,3);
    }

    @Test
    public void test2(){
        int[] nums1 = new int[]{0,0,0,0,0};
        int[] nums2 = new int[]{0,0,0,0,0};
        int answer = Solution.findLength(nums1,nums2);
        assertEquals(answer,5);
    }
}
