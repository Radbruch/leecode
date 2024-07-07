import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public static int maxSubarrayLength(int[] nums, int k) {
        int L = 0;
        int R = 0;
        int bestresult = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;

        while (R < n) {
            int R_number = nums[R];
            Integer R_count = map.get(R_number);
            if (R_count == null) {
                R_count = 0;
            }
            R_count++;

            while (R_count > k) {
                int L_number = nums[L];
                if (L_number != R_number) {
                    map.merge(L_number, -1, Integer::sum);
                } else {
                    R_count -= 1;
                }
                L++;
            }
            map.put(R_number,R_count);
            bestresult = Math.max(bestresult, R - L + 1);
            R++;
        }
        return bestresult;
    }
}