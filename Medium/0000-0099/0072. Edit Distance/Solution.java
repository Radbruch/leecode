/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/8/27 15:34
    *@Version 1.0
    **/
class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        // 假如 words1 为空， 则到 j 为止需要多少步
        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }
        // 假如 words2 为空， 则到 i 为止需要多少步
        for (int j = 0; j <= len2; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i-1][j-1]) + 1;
                }
            }
        }
        return dp[len1][len2];
    }
}
