class Solution {
    // 只需要找其中一个答案
    // 往数字大的方向走
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int L = 0;
        int R = n-1;
        int mid = n + 1;
        while (L <= R) {
            mid = L + (R - L) / 2;
            if (L == R) return L;
            if (nums[mid] > nums[mid+1]) {
                R = mid;
            }
            else{
                L = mid + 1;
            }
        }
        return mid;
    }
}