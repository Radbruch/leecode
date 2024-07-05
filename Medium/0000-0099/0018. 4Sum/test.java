import org.junit.Test;

import java.util.List;

public class test {

    @Test
    public void test(){
        int[] test1 = new int[]{1,0,-1,0,-2,2,0,0,0,0};
        int target1 = 0;
        List<List<Integer>> results1 = Solution.fourSum(test1, target1);
        for (List<Integer> result: results1) {
            System.out.println(result);
        }

        System.out.println("next");

        int[] test2 = new int[]{2,2,2,2,2};
        int target2 = 8;
        List<List<Integer>> results2 = Solution.fourSum(test2, target2);
        for (List<Integer> result: results2) {
            System.out.println(result);
        }

        System.out.println("next");

        int[] test3 = new int[]{1000000000,1000000000,1000000000,1000000000};
        int target3 = -294967296;
        List<List<Integer>> results3 = Solution.fourSum(test3, target3);
        for (List<Integer> result: results3) {
            System.out.println(result);
        }
    }
}
