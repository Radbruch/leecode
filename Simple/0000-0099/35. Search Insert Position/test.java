import org.junit.Test;

public class test {
    @Test
    public void test(){
        int[] nums1 = new int[]{1,3,5,6};
        int target1 = 5;
        int answer1 = Solution.searchInsert(nums1, target1);
        System.out.println(answer1);

        int target2 = 2;
        int answer2 = Solution.searchInsert(nums1, target2);
        System.out.println(answer2);

        int target3 = 7;
        int answer3 = Solution.searchInsert(nums1, target3);
        System.out.println(answer3);
    }
}
