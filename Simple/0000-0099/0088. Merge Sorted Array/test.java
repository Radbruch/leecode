import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1(){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        Solution.merge(nums1,m,nums2,n);
        int[] expect =new int[]{1,2,2,3,5,6};
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i],nums1[i]);
        }
    }
    @Test
    public void test2(){
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        Solution.merge(nums1,m,nums2,n);
        int[] expect =new int[]{1};
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i],nums1[i]);
        }
    }

    @Test
    public void test3(){
        int[] nums1 = new int[]{2,0};
        int m = 1;
        int[] nums2 = new int[]{1};
        int n = 1;
        Solution.merge(nums1,m,nums2,n);
        int[] expect =new int[]{1,2};
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i],nums1[i]);
        }
    }
}
