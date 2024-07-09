import javax.xml.transform.Result;

public class Solution2 {
    public static long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        long result = 0;
        int L = 0;
        int maxCount = 0;
        for (int R_number: nums) {
            if (R_number == max) {
                maxCount ++;
            }
            while (maxCount == k) {
                if (nums[L] == max) {
                    maxCount -= 1;
                }
                L += 1;
            }
            result += L;
        }
    return result;
    }
}
