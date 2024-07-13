class Solution {
    public static int search(int[] nums, int target) {
        int n = nums.length;

        if (n == 0) return -1;
        if (n == 1) {
            return nums[0] == target ? 0:-1;
        }
        int L = 0;
        int R = n-1;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            //一半有序一半无序，分成两部分，0~mid, mid+1~n-1
            //0~mid有序
            else if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    R = mid-1;
                }
                else {
                    L = mid + 1;
                }
            } else {
                // 0~mid 无序
                if (nums[mid] < target && target <= nums[n-1]) {
                    L = mid + 1;
                }
                else {
                    R = mid - 1;
                }
            }
        }
        return -1;
    }
}