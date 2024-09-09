class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int L = 0;
        int R = n - 1;
        int[] ans = new int[n];

        for (int i = n-1; i >= 0; i++) {
            int left = nums[L];
            int right = nums[R];
            if (Math.abs(left) <= Math.abs(right)) {
                ans[i] = right*right;
                R--;
            } else {
                ans[i] = left*left;
                L++;
            }
        }
        return ans;
    }
}