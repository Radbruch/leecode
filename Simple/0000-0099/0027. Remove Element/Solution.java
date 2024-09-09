import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                nums[i] = 51;
            }
            else {
                k += 1;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}