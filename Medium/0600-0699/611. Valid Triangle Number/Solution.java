import java.util.Arrays;

class Solution {
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int answer = 0;
        for (int k = 2; k < n; k++) {
            int i = 0;
            int j = k-1;

            while (i < j) {
                if (nums[i]+nums[j] > nums[k]) {
                    answer += j - i;
                    j--;
                }
                else if (nums[i]+nums[j] <= nums[k]) {
                    i++;
                }
            }

        }
        return answer;
    }
}
