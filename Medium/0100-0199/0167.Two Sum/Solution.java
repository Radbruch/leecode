class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // 时间复杂度：O(n)
        // 空间复杂度：O(1)
        int leftp = 0;
        int rightp = nums.length - 1;
        while (leftp < rightp) {
            if (nums[leftp] + nums[rightp] > target) {
                rightp --;
            }
            else if (nums[leftp] + nums[rightp] < target) {
                leftp ++;
            }
            else {
                return new int[]{leftp + 1, rightp + 1};
            }
        }
        return null;
    }
}
