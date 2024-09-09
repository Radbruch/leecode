/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/8/28 16:44
    *@Version 1.0
    **/
class Solution {
    public boolean canJump(int[] nums) {
        int maxRange = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (maxRange < i) return false;
            maxRange = Math.max(maxRange, nums[i] + i);
        }
        return true;
    }
}
