class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        int L = 0;
        int R = x;
        int ans = -1;
        int mid = 0;
        while (L <= R) {
            mid = L + (R-L) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                L = mid + 1;
            }
            else if ((long) mid * mid == x) {
                ans = mid;
                return ans;
            }
            else {
                R = mid - 1;
            }

        }
        return ans;
    }
}
