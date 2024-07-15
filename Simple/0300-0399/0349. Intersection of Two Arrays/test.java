import org.junit.Test;

public class test {
    @Test
    public void test(){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] result1 = Solution.intersection(nums1, nums2);
        for (int i: result1) {
            System.out.println(i);
        }

        int[] nums3 = new int[]{4,9,5};
        int[] nums4 = new int[]{9,4,9,8,4};
        int[] result2 = Solution.intersection(nums3, nums4);
        for (int i: result2) {
            System.out.println(i);
        }

    }
}
