/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/8/28 17:24
    *@Version 1.0
    **/
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int currentValue = 0;
        for (int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, currentValue + nums[i]);
            currentValue = Math.max(0, currentValue + nums[i]);
        }
        return maxValue;
    }
}
