import org.junit.Test;

public class test {
    @Test
    public void test(){
        int[] nums1 = new int[]{4,5,6,7,0,1,2};
        int target1 = 0;
        int ans1 = Solution.search(nums1,target1);
        System.out.println(ans1);

        int target2 = 3;
        int ans2 = Solution.search(nums1,target2);
        System.out.println(ans2);

        int[] nums3 = new int[]{1};
        int target3 = 0;
        int ans3 = Solution.search(nums3,target3);
        System.out.println(ans3);

        int[] nums4 = new int[]{3,1};
        int target4 = 1;
        int ans4 = Solution.search(nums4, target4);
        System.out.println(ans4);
    }
}
