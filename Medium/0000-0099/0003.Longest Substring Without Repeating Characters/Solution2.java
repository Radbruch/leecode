import java.util.HashSet;

/**
    *@ClassName Solution2
    *@Description TODO
    *@Author msjoy
    *@Date 2024/8/26 13:27
    *@Version 1.0
    **/
public class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int L = 0;
        int R = 0;
        char[] ch = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        while (R < ch.length) {
            if (!set.contains(ch[R])) {
                set.add(ch[R]);
                maxLen = Math.max(maxLen, set.size());
                R++;
            }
            else {
                maxLen = Math.max(maxLen, set.size());
                while (ch[L] != ch[R]) {
                    set.remove(ch[L]);
                    L++;
                }
                L++;
                R++;
            }
        }
        return maxLen;
    }
}
