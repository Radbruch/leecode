import java.util.Arrays;

class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int bestsum = Integer.MAX_VALUE;
        int bestdiff = Integer.MAX_VALUE;
        int index = 0;

        while (index < nums.length-2) {
            int L = index + 1;
            int R = length - 1;
            int sumfirst = nums[index]+nums[index+1]+nums[index+2];
            if (sumfirst >= target) {
                if (Math.abs(sumfirst - target) < bestdiff) {
                    bestdiff = Math.abs(sumfirst-target);
                    bestsum = sumfirst;
                }
            }
            int sumlast = nums[index] + nums[length-1] + nums[length-2];
            if (sumlast <= target) {
                if (Math.abs(sumlast - target) < bestdiff) {
                    bestdiff = Math.abs(sumlast-target);
                    bestsum = sumlast;
                }
            }

            while (L < R) {
                int sum = nums[index] + nums[L] + nums[R];
                if (Math.abs(sum - target) < bestdiff) {
                    bestdiff = Math.abs(sum-target);
                    bestsum = sum;
                }
                if (sum < target) {
                    L += 1;
                }
                else if (sum > target) {
                    R -= 1;
                }
                else {
                    return bestsum;
                }
            }

            index += 1;
            while (index < length-1 && nums[index] == nums[index-1]) {
                index++;
            }
        }
        return bestsum;
    }
}
