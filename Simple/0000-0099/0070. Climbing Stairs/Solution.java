class Solution {

    public static int climbStairs(int n) {
        // n = 0 --> answer = 0
        // n = 1 --> answer = 1 斐波那契第二个数
        // n = 2 --> answer = 2
        // n = 3 --> answer = 3
        // n = 4 --> answer = 5

        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
