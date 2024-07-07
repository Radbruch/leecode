class Solution {
    public static int longestSemiRepetitiveSubstring(String s) {
        int n = s.length();
        int L = 0;
        int R = 0;
        int maxLength = 0;

        int duplicate = 0;

        while (R < n) {
            char R_char = s.charAt(R);

            if (R > 0 && R_char == s.charAt(R-1)) {
                duplicate += 1;
                maxLength = Math.max(maxLength, R-L);
            }

            while (duplicate == 2) {
                L++;
                if (s.charAt(L) == s.charAt(L-1)) {
                    duplicate -= 1;
                }
            }
            maxLength = Math.max(maxLength, R-L+1);
            R++;

        }
        return maxLength;
    }
}
