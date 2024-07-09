class Solution3 {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length, maxVal = 0;
        for (int i = 0; i < n; i ++) {
            maxVal = Math.max(maxVal, nums[i]);
        }
        long ans = 0;
        int left = 0, right = 0, maxCnt = 0;
        while (right < n) {
            if (nums[right] == maxVal) {
                maxCnt ++;
            }
            while (maxCnt >= k) {
                ans += n - right;
                if (nums[left ++] == maxVal) {
                    maxCnt--;
                }
            }
            right ++;
        }
        return ans;
    }
}
