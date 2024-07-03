import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void testfor3sum(){
        int[] nums1 = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> results;
        results = Solution2.threeSum(nums1);
        for (List<Integer> L: results) {
                System.out.println(L);
        }

        int[] nums2 = new int[]{};
        List<List<Integer>> results2;
        results2 = Solution2.threeSum(nums2);
        for (List<Integer> L: results2) {
            System.out.println(L);
        }

        int[] nums3 = new int[]{0,0,0};
        List<List<Integer>> results3;
        results3 = Solution2.threeSum(nums3);
        for (List<Integer> L: results3) {
            System.out.println(L);
        }

    }
}
