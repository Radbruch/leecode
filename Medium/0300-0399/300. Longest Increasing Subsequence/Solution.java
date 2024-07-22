class Solution {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int L = 0;
        int R = L+1;
        int maxLength = 0;
        while(R < n && L < n-1) {
            if (maxLength >= n - L) {
                return maxLength;
            }
            if (nums[R] > nums[R-1]) {
                maxLength = Math.max(R - L, maxLength);
                R += 1;
            }
            else {
                L += 1;
                R = L + 1;
            }
        }
        return maxLength;
    }
}
