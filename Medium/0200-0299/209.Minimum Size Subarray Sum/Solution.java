import java.util.Arrays;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int minAnswer = Integer.MAX_VALUE;
        int L = 0;
        // int R = 0;
        int n = nums.length;
        int sum = 0;
        int maxSum = 0;
        for (int R = 0; R < n; R++) {
            sum += nums[R];
            maxSum += nums[R];

            while (sum >= target) {
                minAnswer = Math.min(minAnswer, R-L+1);
                sum -= nums[L];
                L++;
            }
        }

        return maxSum >= target ? minAnswer: 0;
    }
}
