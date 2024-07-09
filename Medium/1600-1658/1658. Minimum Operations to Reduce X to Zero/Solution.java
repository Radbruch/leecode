class Solution {
    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int result = n+1;
        int L = 0;
        // 1. 找左边 sum 刚好 >= x 的数
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == x) {
                result = Math.min(result,i+1);
                L = i;
                break;
            }
            else if (sum > x) {
                L = i;
                break;
            }
        }
        if (sum < x) {
            return -1;
        }

        for (int R = n-1; R > 0; R--) {
            sum += nums[R];

            while (L >= 0 && sum > x) {
                sum -= nums[L];
                L -= 1;
            }
            if (sum == x) {
                result = Math.min(result, L+1+n-R);
            }
            if (n-R >= result) {
                break;
            }
        }
        if (result > n) return -1;
        return result;
    }
}
