import java.util.Arrays;

class Solution {
    public static int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxLength = 0;
        int L = 0;
        for (int R = 0; R < n; R++) {

            while (L < R && nums[R] - nums[L] > k+k) {
                L++;
            }
            maxLength = Math.max(maxLength, R-L+1);
        }
        return maxLength;
    }
}
