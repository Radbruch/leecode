import org.junit.Test;

public class test {
    @Test
    public void test(){
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        int result1 = Solution.threeSumClosest(nums1, target1);
        System.out.println(result1);

        int[] nums2 = {0,0,0};
        int target2 = 1;
        int result2 = Solution.threeSumClosest(nums2, target2);
        System.out.println(result2);
    }
}
