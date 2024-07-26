class Solution {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 1) return 0;
        int R = 1;
        int L = 0;
        int maxProfit = Math.max(0, prices[R]- prices[L]);
        while (R < n) {
            if (prices[R] < prices[R-1]) {
                R += 1;
            }
            else if (prices[R-1] < prices[L]) {
                L = R-1;
                maxProfit = Math.max(maxProfit, prices[R] - prices[L]);
                R += 1;
            }
            else {
                maxProfit = Math.max(maxProfit, prices[R] - prices[L]);
                R += 1;
            }
        }
        return maxProfit;
    }
}
