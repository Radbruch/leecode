import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
    *@ClassName Solution
    *@Description TODO
    *@Author msjoy
    *@Date 2024/8/26 16:16
    *@Version 1.0
    **/
class Solution {
    public static List<String> generateParenthesis(int n) {
        // 1 <= n <= 8
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n, res, 0, 0, sb);
        return res;
    }

    private static void helper(int n, List<String> result, int L, int R, StringBuilder sb) {
        if (R > L) return;
        if (L == R && R == n) {
            result.add(sb.toString());
            return;
        }
        if (L < n) {
            helper(n, result, L+1, R, sb.append("("));
            sb.deleteCharAt(sb.length()-1);
        }
        if (R < L) {
            helper(n, result, L, R+1, sb.append(")"));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
