class Solution {
    public static long countSubarrays(int[] nums, long k) {
        long result = 0;
        int L = 0;
        long partsum = 0;
        int n = nums.length;
        for (int R = 0; R < n; R++) {
            partsum += nums[R];
            while (partsum * (R-L+1) >= k) {
                partsum -= nums[L];
                L++;
            }
            result += R-L+1;
        }

        return result;
    }
}
