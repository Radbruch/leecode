import org.junit.Test;

public class testtest {


    @Test
    public void testforsolution() {
        int[] testarray1 = {2,7,11,15};
        int target1 = 9;

        int[] result1;
        result1 = Solution.twoSum(testarray1, target1);
        for (int i: result1) {
            System.out.println(i);
        }

        int[] testarray2 = {2,3,4};
        int target2 = 6;

        int[] result2;
        result2 = Solution.twoSum(testarray2, target2);
        for (int i: result2) {
            System.out.println(i);
        }

        int[] testarray3 = {-1,0};
        int target3 = -1;

        int[] result3;
        result3 = Solution.twoSum(testarray3, target3);
        for (int i: result3) {
            System.out.println(i);
        }
    }
}
