class Solution {
    public static int trap(int[] height) {
        // 输入：正整数和 0
        int length = height.length;

        int[] leftwalls = new int[length];
        leftwalls[0] = height[0];

        int[] rightwalls = new int[length];
        rightwalls[length-1] = height[length-1];

        int result = 0;

        for (int i = 1; i < length; i++) {
            leftwalls[i] = Math.max(height[i], leftwalls[i-1]);
        }
        for (int i = length-2; i > 0; i--) {
            rightwalls[i] = Math.max(height[i], rightwalls[i+1]);
        }

        for (int i = 0; i < length; i++) {
            int wall = Math.min(leftwalls[i], rightwalls[i]);
            if (wall > height[i]) {
                result += wall - height[i];
            }
        }
    return result;
    }
}
