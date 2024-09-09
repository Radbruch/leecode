import java.util.Stack;

/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/8/29 14:27
    *@Version 1.0
    **/
class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int max = 0;
        if (n == 0 || n == 1) return 0;
        dp[0] = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < n; i++) {
            if (arr[i] == '(') { dp[i] = 0;}
            else {
                if (arr[i-1] == '(') {dp[i] = i > 2 ?  dp[i-2] + 2: 2;}
                else if (i - dp[i-1] - 1 >= 0 && arr[i] == ')') {
                    if (arr[i - dp[i-1] - 1] == '(') {dp[i] = i-dp[i-1]>2 ? dp[i-1]+2+dp[i-dp[i-1]-2]: dp[i-1]+2;}
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
