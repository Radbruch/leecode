import java.util.Arrays;

class Solution {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return 1;
        Arrays.sort(nums);
        int maxLength = 1;
        int same = 0;
        int L = 0, R = 1;
        while (R <= n-1) {
            if (nums[R] == nums[R-1]) {
                same += 1;
                R += 1;
            }
            else if (nums[R] == nums[R-1]+1) {
                maxLength = Math.max(maxLength, R - L + 1 - same);
                R += 1;
            }
            else {
                L = R;
                R = R+1;
                same = 0;
            }
        }
        return maxLength;
    }
}
