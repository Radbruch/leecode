import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    @Test
    public void test() {
        List<Integer> nums1 = new ArrayList<Integer>();
        Collections.addAll(nums1, 9,-5,-5,5,-5,-4,-6,6,-6);
        int result = Solution.countPairs(nums1, 3);



    }

}
