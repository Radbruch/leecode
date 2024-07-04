import java.util.Arrays;

public class Solution {

    public static int minSubArrayLen(int target, int[] nums) {
        int length = nums.length;
        int L = 0;
        int sum = 0;
        int ans = length+1;
        for (int R = 0; R < length; R++) {
            sum += nums[R];
            while (L <= length -1 && sum - nums[L] >= target ) {
                    sum -= nums[L];
                    L++;
            }
            if (sum >= target) { //当sum大于target才需要更新ans
              ans = Math.min(ans, R-L+1);
            }
        }
        if (ans <= length) return ans;
        else return 0;
    }
}
