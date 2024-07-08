import org.junit.Test;

public class test {

    @Test
    public void test() {
        int[] nums1 = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k1 = 2;
        int result1 = Solution.longestOnes(nums1, k1);
        System.out.println(result1);

        int[] nums2 = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k2 = 3;
        int result2 = Solution.longestOnes(nums2, k2);
        System.out.println(result2);

        int[] nums3 = new int[]{0,0,0,0};
        int k3 = 0;
        int result3 = Solution.longestOnes(nums3, k3);
        System.out.println(result3);

    }
}
