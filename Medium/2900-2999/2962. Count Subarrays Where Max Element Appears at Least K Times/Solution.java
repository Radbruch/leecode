class Solution {
    public static long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int countMax = 0;
        long result = 0;
        int L = 0;
        int totalcount = 0;

        for (int R = 0; R < n; R++) {
            if (nums[R] > max) {
                max = nums[R];
                countMax = 1;
                totalcount = 1;
                result = 0;
                L = 0;
            }

            else if (nums[R] == max) {
                countMax += 1;
                totalcount += 1;
            }
            while (L <= R && countMax == k) {
                if (nums[L] == max) {
                    countMax -= 1;
                }
                L++;
            }
            result += L;
        }
        return result;
    }
}
