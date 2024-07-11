import org.junit.Test;

public class test {
    @Test
    public void test(){
        int[] nums1 = new int[]{-1,0,3,5,9,12};
        int target1 = 9;
        int answer1 = Solution.search(nums1,target1);
        System.out.println(answer1);

        int[] nums2 = new int[]{-1,0,3,5,9,12};
        int target2 = 2;
        int answer2 = Solution.search(nums2,target2);
        System.out.println(answer2);
    }
}
