import org.junit.Test;

public class test {
    @Test
    public void test(){
        int[] nums1 = new int[]{5,7,7,8,8,10};
        int target1 = 8;
        int[] result1 = Solution.searchRange(nums1,target1);
        for (int i: result1) {
            System.out.println(i);
        }

        int target2 = 6;
        int[] result2 = Solution.searchRange(nums1,target2);
        for (int i: result2) {
            System.out.println(i);
        }

        int[] nums3 = new int[]{};
        int target3 = 0;
        int[] result3 = Solution.searchRange(nums3,target3);;
        for (int i: result3) {
            System.out.println(i);
        }

        int[] nums4 = new int[]{1};
        int target4 = 1;
        int[] result4 = Solution.searchRange(nums4,target4);;
        for (int i: result4) {
            System.out.println(i);
        }
    }
}
