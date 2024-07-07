import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int L = 0;
        int R = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int bestresult = 0;

        m.put(nums[R], 1);
        bestresult = 1;
        while (R < n-1) {
            if (!m.containsKey(nums[R+1]) || m.get(nums[R+1])+1 <= k) {
                m.merge(nums[R+1], 1, Integer::sum);
                R++;
                bestresult = Math.max(bestresult, R-L+1);
            }
            else if (m.get(nums[R+1])+1 > k) {
                R++;
                m.merge(nums[R], 1, Integer::sum);
                while (nums[L] != nums[R]) {
                    m.merge(nums[L], -1, Integer::sum);
                    L++;
                }
                m.merge(nums[L], -1, Integer::sum);
                L++;
            }

        }
        return bestresult;
    }
}
