import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || x == 10) return false;
        int y = x;
        Queue<Integer> quu = new ArrayDeque<>();
        while (y > 0) {
            quu.add(y % 10);
            y = y / 10;
        }
        while (!quu.isEmpty()){
            y = y*10 + quu.poll();
        }
        return y == x;
    }
}
