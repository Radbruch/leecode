import org.junit.Test;

public class test {

    @Test
    public void test(){
        int[] nums1 = new int[]{1,1,4,2,3};
        int x1 = 5;
        int result1 = Solution.minOperations(nums1,x1);
        System.out.println(result1);

        int[] nums2 = new int[]{5,6,7,8,9};
        int x2 = 4;
        int result2 = Solution.minOperations(nums2,x2);
        System.out.println(result2);

        int[] nums3 = new int[]{3,2,20,1,1,3};
        int x3 = 10;
        int result3 = Solution.minOperations(nums3,x3);
        System.out.println(result3);

        int[] nums4 = new int[]{1,1};
        int x4 = 3;
        int result4= Solution.minOperations(nums4,x4);
        System.out.println(result4);
    }
}
