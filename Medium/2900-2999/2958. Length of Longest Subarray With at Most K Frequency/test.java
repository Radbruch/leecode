import org.junit.Test;

public class test {
    @Test
    public void test() {
        int[] nums1 = new int[] {1,2,3,1,2,3,1,2};
        int k1 = 2;
        int answer1 = Solution2.maxSubarrayLength(nums1, k1);
        System.out.println(answer1);

        int[] nums2 = new int[] {1,2,1,2,1,2,1,2};
        int k2 = 1;
        int answer2 = Solution2.maxSubarrayLength(nums2, k2);
        System.out.println(answer2);

        int[] nums3 = new int[] {5,5,5,5,5,5,5};
        int k3 = 8;
        int answer3 = Solution2.maxSubarrayLength(nums3, k3);
        System.out.println(answer3);

        int[] nums4 = new int[] {1};
        int k4 = 1;
        int answer4 = Solution2.maxSubarrayLength(nums4, k4);
        System.out.println(answer4);
    }
}
