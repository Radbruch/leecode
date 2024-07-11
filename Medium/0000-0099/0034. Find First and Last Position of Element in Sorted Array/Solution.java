class Solution {
    public static int[] searchRange(int[] nums, int target) {

        int start;
        int end;
        start = lowerBond(nums, target);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1,-1};
        }
        end = lowerBond(nums, target+1) - 1;
        return new int[]{start, end};
    }

    private static int lowerBond(int[] nums, int target)  {
        int L = 0;
        int R = nums.length-1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (nums[mid] < target) {
                L = mid+1;
            }
            else {
                R = mid-1;
            }
        }
        return L;
    }
}