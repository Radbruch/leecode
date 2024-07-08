class Solution {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int numberof0 = 0;
        int maxLen = 0;
        int L = 0;
        for (int R = 0; R < n; R++) {
            if (nums[R] == 0) {
                numberof0++;
            }
            while (L <= R && numberof0 > k) {
                if (nums[L] == 0) {
                    numberof0--;
                }
                L++;
            }
            maxLen = Math.max(maxLen, R - L + 1);
        }
        return maxLen;
    }
}
