import org.junit.Test;

public class test {
    @Test
    public void test() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double answer1 = Solution.findMedianSortedArrays(nums1,nums2);
        System.out.println(answer1);

        int[] nums3 = new int[]{1,2};
        int[] nums4 = new int[]{3,4};
        double answer2 = Solution.findMedianSortedArrays(nums3,nums4);
        System.out.println(answer2);
    }

}
