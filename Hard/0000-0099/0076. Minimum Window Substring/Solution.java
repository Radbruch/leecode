class Solution {
    public static String minWindow(String s, String t) {
        int n = s.length();
        int L = 0;
        int best_L = 0;
        int best_R = n+1;

        int[] current_count = new int[128];
        int[] t_count = new int[128];

        for (int i = 0; i < t.length(); i++) {
            t_count[t.charAt(i)]++;
        }

        for (int R = 0; R < n; R++) {
            current_count[s.charAt(R)] += 1;
            while (is_Contained(current_count, t_count)) {
                if (R - L < best_R - best_L) {
                    best_L = L;
                    best_R = R;
                }
                current_count[s.charAt(L)] -= 1;
                L++;
            }

        }
        if (best_R - best_L > n) {
            return "";
        }
        else {
            String result = s.substring(best_L, best_R+1);
            return result;
        }
    }

    private static boolean is_Contained(int[] s, int[] t) {
        for (int i = 'A'; i <= 'Z'; i++) {
            if (t[i] > s[i]) {
                return false;
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (t[i] > s[i]) {
                return false;
            }
        }
        return true;
    }
}