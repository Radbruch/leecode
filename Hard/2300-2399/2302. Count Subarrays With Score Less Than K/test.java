import org.junit.Test;

public class test {
    @Test
    public void test() {

        int[] nums1 = new int[]{2, 1, 4, 3, 5};
        int k1 = 10;
        long result1 = Solution.countSubarrays(nums1, k1);
        System.out.println(result1);

        int[] nums2 = new int[]{1, 1, 1};
        int k2 = 5;
        long result2 = Solution.countSubarrays(nums2, k2);
        System.out.println(result2);

        int[] nums3 = new int[]{5, 2, 6, 8, 9, 7};
        int k3 = 50;
        long result3 = Solution.countSubarrays(nums3, k3);
        System.out.println(result3);
    }
}
