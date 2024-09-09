/**
 * @ClassName Solution
 * @Description TODO
 * @Author msjoy
 * @Date 2024/8/28 18:04
 * @Version 1.0
 **/
public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 1; i <= n; i++) {
            int value = nums[i-1];
            dp[i][1] = dp[i-1][0] + value;
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
        }
        return Math.max(dp[n][0],dp[n][1]);
    }
}
