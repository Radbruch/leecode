/**
 * @ClassName Solution3
 * @Description TODO
 * @Author msjoy
 * @Date 2024/8/26 13:44
 * @Version 1.0
 **/
class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] m = new int[128];
        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(m[s.charAt(j)], i);
            ans = Math.max(j - i + 1, ans);
            m[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}