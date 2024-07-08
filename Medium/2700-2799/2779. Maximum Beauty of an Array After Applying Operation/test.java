import org.junit.Test;

public class test {
    @Test
    public void test() {
        int[] nums1 = new int[]{4,6,1,2};
        int k1 = 2;
        int result1 = Solution.maximumBeauty(nums1, k1);
        System.out.println(result1);

        int[] nums2 = new int[]{1,1,1,1};
        int k2 = 10;
        int result2 = Solution.maximumBeauty(nums2, k2);
        System.out.println(result2);


    }
}
