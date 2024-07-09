import org.junit.Test;

public class test {
    @Test
    public void test() {
        int[] nums1 = new int[]{1,3,2,3,3};
        int k1 = 2;
        long result1 = Solution.countSubarrays(nums1, k1);
        System.out.println(result1);

        int[] nums2 = new int[]{1,4,2,1};
        int k2 = 3;
        long result2 = Solution.countSubarrays(nums2, k2);
        System.out.println(result2);

        int[] nums3 = new int[]{61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
        int k3 = 2;
        long result3 = Solution.countSubarrays(nums3, k3);
        System.out.println(result3);

        int[] nums4 = new int[]{5,14,36,25,23,8,38,38,42,42};
        int k4 = 2;
        long result4 = Solution.countSubarrays(nums4, k4);
        System.out.println(result4);
    }
}
